package com.tennis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class APIServiceStats {
	
	@JsonProperty("Aces")
	private SingleStat aces;

	@JsonProperty("DoubleFaults")
	private SingleStat doubleFaults;
	
	@JsonProperty("FirstServe")
	private MultipleStat firstServe;
	
	@JsonProperty("FirstServePointsWon")
	private MultipleStat firstServePointsWon;
	
	@JsonProperty("SecondServePointsWon")
	private MultipleStat secondServePointsWon;
	
	@JsonProperty("BreakPointsSaved")
	private MultipleStat breakPointsSaved;
	
	@JsonProperty("ServiceGamesPlayed")
	private SingleStat serviceGamesPlayed;

	public SingleStat getAces() {
		return aces;
	}

	public void setAces(SingleStat aces) {
		this.aces = aces;
	}

	public SingleStat getDoubleFaults() {
		return doubleFaults;
	}

	public void setDoubleFaults(SingleStat doubleFaults) {
		this.doubleFaults = doubleFaults;
	}

	public MultipleStat getFirstServe() {
		return firstServe;
	}

	public void setFirstServe(MultipleStat firstServe) {
		this.firstServe = firstServe;
	}

	public MultipleStat getFirstServePointsWon() {
		return firstServePointsWon;
	}

	public void setFirstServePointsWon(MultipleStat firstServePointsWon) {
		this.firstServePointsWon = firstServePointsWon;
	}

	public MultipleStat getSecondServePointsWon() {
		return secondServePointsWon;
	}

	public void setSecondServePointsWon(MultipleStat secondServePointsWon) {
		this.secondServePointsWon = secondServePointsWon;
	}

	public MultipleStat getBreakPointsSaved() {
		return breakPointsSaved;
	}

	public void setBreakPointsSaved(MultipleStat breakPointsSaved) {
		this.breakPointsSaved = breakPointsSaved;
	}

	public SingleStat getServiceGamesPlayed() {
		return serviceGamesPlayed;
	}

	public void setServiceGamesPlayed(SingleStat serviceGamesPlayed) {
		this.serviceGamesPlayed = serviceGamesPlayed;
	}

	@Override
	public String toString() {
		return "APIServiceStats [aces=" + aces + ", doubleFaults=" + doubleFaults + ", firstServe=" + firstServe
				+ ", firstServePointsWon=" + firstServePointsWon + ", secondServePointsWon=" + secondServePointsWon
				+ ", breakPointsSaved=" + breakPointsSaved + ", serviceGamesPlayed=" + serviceGamesPlayed + "]";
	}
	

}
