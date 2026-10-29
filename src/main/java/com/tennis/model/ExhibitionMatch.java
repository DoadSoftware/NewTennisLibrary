package com.tennis.model;

import java.util.ArrayList;
import java.util.List;

public class ExhibitionMatch {
	private String matchFileName;
	private String matchId;
    private String competitionName;
    private String matchTitle;
    private String group1Name;
    private String group2Name;
    private String matchStatus;
    private String overallWinnerGroup;
    private List<ExhibitionSet> sets = new ArrayList<>();
	public String getMatchFileName() {
		return matchFileName;
	}
	public void setMatchFileName(String matchFileName) {
		this.matchFileName = matchFileName;
	}
	public String getMatchId() {
		return matchId;
	}
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	public String getCompetitionName() {
		return competitionName;
	}
	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}
	public String getMatchTitle() {
		return matchTitle;
	}
	public void setMatchTitle(String matchTitle) {
		this.matchTitle = matchTitle;
	}
	public String getGroup1Name() {
		return group1Name;
	}
	public void setGroup1Name(String group1Name) {
		this.group1Name = group1Name;
	}
	public String getGroup2Name() {
		return group2Name;
	}
	public void setGroup2Name(String group2Name) {
		this.group2Name = group2Name;
	}
	public String getMatchStatus() {
		return matchStatus;
	}
	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}
	public String getOverallWinnerGroup() {
		return overallWinnerGroup;
	}
	public void setOverallWinnerGroup(String overallWinnerGroup) {
		this.overallWinnerGroup = overallWinnerGroup;
	}
	public List<ExhibitionSet> getSets() {
		return sets;
	}
	public void setSets(List<ExhibitionSet> sets) {
		this.sets = sets;
	}

}
