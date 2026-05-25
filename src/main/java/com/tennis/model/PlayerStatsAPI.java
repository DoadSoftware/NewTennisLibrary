package com.tennis.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerStatsAPI {

	@JsonProperty("PlayerId")
	private String firstPlayerId;

	@JsonProperty("PartnerId")
	private String secondPlayerId;
	
	@JsonProperty("GamePointsPlayerTeam")
	private int gamePointsPlayerTeam;
	
	@JsonProperty("Sets")
	private List<SetsAPI> sets;

	public String getFirstPlayerId() {
		return firstPlayerId;
	}

	public void setFirstPlayerId(String firstPlayerId) {
		this.firstPlayerId = firstPlayerId;
	}

	public String getSecondPlayerId() {
		return secondPlayerId;
	}

	public void setSecondPlayerId(String secondPlayerId) {
		this.secondPlayerId = secondPlayerId;
	}

	public int getGamePointsPlayerTeam() {
		return gamePointsPlayerTeam;
	}

	public void setGamePointsPlayerTeam(int gamePointsPlayerTeam) {
		this.gamePointsPlayerTeam = gamePointsPlayerTeam;
	}

	public List<SetsAPI> getSets() {
		return sets;
	}

	public void setSets(List<SetsAPI> sets) {
		this.sets = sets;
	}

	@Override
	public String toString() {
		return "PlayerStatsAPI [firstPlayerId=" + firstPlayerId + ", secondPlayerId=" + secondPlayerId
				+ ", gamePointsPlayerTeam=" + gamePointsPlayerTeam + ", sets=" + sets + "]";
	}

}
