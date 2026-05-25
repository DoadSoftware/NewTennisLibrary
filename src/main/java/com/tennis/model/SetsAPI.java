package com.tennis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetsAPI {

	@JsonProperty("SetNumber")
	private int setNumber;

	@JsonProperty("SetScore")
	private String setScore;
	
	@JsonProperty("TieBreakScore")
	private String tieBreakScore;
	
	@JsonProperty("Stats")
	private APIstats stats;

	public int getSetNumber() {
		return setNumber;
	}

	public void setSetNumber(int setNumber) {
		this.setNumber = setNumber;
	}

	public String getSetScore() {
		return setScore;
	}

	public void setSetScore(String setScore) {
		this.setScore = setScore;
	}

	public String getTieBreakScore() {
		return tieBreakScore;
	}

	public void setTieBreakScore(String tieBreakScore) {
		this.tieBreakScore = tieBreakScore;
	}

	public APIstats getStats() {
		return stats;
	}

	public void setStats(APIstats stats) {
		this.stats = stats;
	}

	@Override
	public String toString() {
		return "SetsAPI [setNumber=" + setNumber + ", setScore=" + setScore + ", tieBreakScore=" + tieBreakScore
				+ ", stats=" + stats + "]";
	}
	
}
