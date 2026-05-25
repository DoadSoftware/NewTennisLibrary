package com.tennis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class APIReturnStats {
	
	@JsonProperty("FirstServeReturnPointsWon")
	private MultipleStat firstServeReturnPointsWon;
	
	@JsonProperty("SecondServeReturnPointsWon")
	private MultipleStat secondServeReturnPointsWon;
	
	@JsonProperty("BreakPointsConverted")
	private MultipleStat breakPointsConverted;
	
	@JsonProperty("ReturnGamesPlayed")
	private SingleStat returnGamesPlayed;

	public MultipleStat getFirstServeReturnPointsWon() {
		return firstServeReturnPointsWon;
	}

	public void setFirstServeReturnPointsWon(MultipleStat firstServeReturnPointsWon) {
		this.firstServeReturnPointsWon = firstServeReturnPointsWon;
	}

	public MultipleStat getSecondServeReturnPointsWon() {
		return secondServeReturnPointsWon;
	}

	public void setSecondServeReturnPointsWon(MultipleStat secondServeReturnPointsWon) {
		this.secondServeReturnPointsWon = secondServeReturnPointsWon;
	}

	public MultipleStat getBreakPointsConverted() {
		return breakPointsConverted;
	}

	public void setBreakPointsConverted(MultipleStat breakPointsConverted) {
		this.breakPointsConverted = breakPointsConverted;
	}

	public SingleStat getReturnGamesPlayed() {
		return returnGamesPlayed;
	}

	public void setReturnGamesPlayed(SingleStat returnGamesPlayed) {
		this.returnGamesPlayed = returnGamesPlayed;
	}

	@Override
	public String toString() {
		return "APIReturnStats [firstServeReturnPointsWon=" + firstServeReturnPointsWon
				+ ", secondServeReturnPointsWon=" + secondServeReturnPointsWon + ", breakPointsConverted="
				+ breakPointsConverted + ", returnGamesPlayed=" + returnGamesPlayed + "]";
	}
	
}
