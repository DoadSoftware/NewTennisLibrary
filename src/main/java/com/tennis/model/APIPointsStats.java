package com.tennis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class APIPointsStats {
	
	@JsonProperty("TotalServicePointsWon")
	private MultipleStat TotalServicePointsWon;

	@JsonProperty("TotalReturnPointsWon")
	private MultipleStat TotalReturnPointsWon;
	
	@JsonProperty("TotalPointsWon")
	private MultipleStat TotalPointsWon;

	public MultipleStat getTotalServicePointsWon() {
		return TotalServicePointsWon;
	}

	public void setTotalServicePointsWon(MultipleStat totalServicePointsWon) {
		TotalServicePointsWon = totalServicePointsWon;
	}

	public MultipleStat getTotalReturnPointsWon() {
		return TotalReturnPointsWon;
	}

	public void setTotalReturnPointsWon(MultipleStat totalReturnPointsWon) {
		TotalReturnPointsWon = totalReturnPointsWon;
	}

	public MultipleStat getTotalPointsWon() {
		return TotalPointsWon;
	}

	public void setTotalPointsWon(MultipleStat totalPointsWon) {
		TotalPointsWon = totalPointsWon;
	}

	@Override
	public String toString() {
		return "APIPointsStats [TotalServicePointsWon=" + TotalServicePointsWon + ", TotalReturnPointsWon="
				+ TotalReturnPointsWon + ", TotalPointsWon=" + TotalPointsWon + "]";
	}
}
