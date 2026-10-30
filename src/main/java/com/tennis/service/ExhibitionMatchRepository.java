package com.tennis.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tennis.model.ExhibitionMatch;
import com.tennis.util.TennisUtil;

@Service
public class ExhibitionMatchRepository 
{
	private final ObjectMapper objectMapper = new ObjectMapper();
    private final Path matchesDirectory = Path.of(TennisUtil.TENNIS_DIRECTORY, TennisUtil.MATCHES_DIRECTORY);

	public File save(ExhibitionMatch match) throws IOException {
	    if (match == null || match.getMatchId() == null || match.getMatchId().isBlank() || match.getMatchFileName() == null || match.getMatchFileName().isBlank()) throw new IllegalArgumentException("Exhibition match, ID and filename are required.");
	    UUID.fromString(match.getMatchId());
	    String baseName = match.getMatchFileName().trim();
	    if (baseName.length() > 100 || !baseName.matches("[a-zA-Z0-9_-]+")) throw new IllegalArgumentException("Invalid Exhibition filename.");
	    Files.createDirectories(matchesDirectory);
	    Path target = matchesDirectory.resolve(baseName + ".exhibition.json");
	    if (Files.exists(target)) {
	        ExhibitionMatch existing = objectMapper.readValue(target.toFile(), ExhibitionMatch.class);
	        if (existing == null || !match.getMatchId().equals(existing.getMatchId())) {
	            int suffix = 2;
	            do {
	                target = matchesDirectory.resolve(baseName + "_" + suffix++ + ".exhibition.json");
	            } while (Files.exists(target));
	            match.setMatchFileName(target.getFileName().toString().replaceFirst("\\.exhibition\\.json$", ""));
	        }
	    }
	    Path temp = Files.createTempFile(matchesDirectory, "EXH_", ".tmp");
	    try {
	        objectMapper.writeValue(temp.toFile(), match);
	        try {
	            Files.move(temp, target, java.nio.file.StandardCopyOption.ATOMIC_MOVE, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
	        } catch (java.nio.file.AtomicMoveNotSupportedException ex) {
	            Files.move(temp, target, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
	        }
	    } finally {
	        Files.deleteIfExists(temp);
	    }
	    return target.toFile();
	}
	    
	public ExhibitionMatch load(String matchId) throws IOException {
	    if (matchId == null || matchId.isBlank()) throw new IllegalArgumentException("Match ID is required.");
	    UUID.fromString(matchId);
	    if (!Files.isDirectory(matchesDirectory)) throw new IOException("Exhibition matches directory not found.");
	    try (var files = Files.newDirectoryStream(matchesDirectory, "*.exhibition.json")) {
	        for (Path file : files) {
	            try {
	                ExhibitionMatch match = objectMapper.readValue(file.toFile(), ExhibitionMatch.class);
	                if (match != null && matchId.equals(match.getMatchId())) return match;
	            } catch (IOException ex) {
	                continue;
	            }
	        }
	    }
	    throw new IOException("Exhibition match not found.");
	}

	public List<ExhibitionMatch> findAll() throws IOException {
	    List<ExhibitionMatch> matches = new ArrayList<>();
	    if (!Files.isDirectory(matchesDirectory)) return matches;
	    try (var files = Files.newDirectoryStream(matchesDirectory, "*.exhibition.json")) {
	        for (Path file : files) {
	            try {
	                ExhibitionMatch match = objectMapper.readValue(file.toFile(), ExhibitionMatch.class);
	                if (match != null && match.getMatchId() != null && !match.getMatchId().isBlank()) matches.add(match);
	            } catch (IOException ex) {
	                continue;
	            }
	        }
	    }
	    matches.sort(Comparator.comparing(ExhibitionMatch::getCompetitionName, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)).thenComparing(ExhibitionMatch::getMatchTitle, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)));
	    return matches;
	}

	
	public boolean exists(String matchId) {
	    try {
	        return load(matchId) != null;
	    } catch (IOException | IllegalArgumentException ex) {
	        return false;
	    }
	}

}
