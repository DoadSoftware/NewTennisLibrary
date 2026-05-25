package com.tennis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LiveMatchStatsAPI {
	
	@JsonProperty("TournamentYear")
	private int Tournament_year;
	
	@JsonProperty("TournamentId")
	private int Tournament_id;

	@JsonProperty("MatchId")
	private String MatchId;
	
	@JsonProperty("Status")
	private String Status;
	
	@JsonProperty("PlayerTeam1")
	private PlayerStatsAPI PlayerTeam1;
	
	@JsonProperty("PlayerTeam2")
	private PlayerStatsAPI PlayerTeam2;

	public int getTournament_year() {
		return Tournament_year;
	}

	public void setTournament_year(int tournament_year) {
		Tournament_year = tournament_year;
	}

	public int getTournament_id() {
		return Tournament_id;
	}

	public void setTournament_id(int tournament_id) {
		Tournament_id = tournament_id;
	}

	public String getMatchId() {
		return MatchId;
	}

	public void setMatchId(String matchId) {
		MatchId = matchId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public PlayerStatsAPI getPlayerTeam1() {
		return PlayerTeam1;
	}

	public void setPlayerTeam1(PlayerStatsAPI playerTeam1) {
		PlayerTeam1 = playerTeam1;
	}

	public PlayerStatsAPI getPlayerTeam2() {
		return PlayerTeam2;
	}

	public void setPlayerTeam2(PlayerStatsAPI playerTeam2) {
		PlayerTeam2 = playerTeam2;
	}

	@Override
	public String toString() {
		return "LiveMatchStatsAPI [Tournament_year=" + Tournament_year + ", Tournament_id=" + Tournament_id
				+ ", MatchId=" + MatchId + ", Status=" + Status + ", PlayerTeam1=" + PlayerTeam1 + ", PlayerTeam2="
				+ PlayerTeam2 + "]";
	}
}
