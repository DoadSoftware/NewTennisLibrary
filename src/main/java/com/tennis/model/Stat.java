package com.tennis.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stat {
	
	private int statNumber;

	private String statType;
	
	private int playerId;

	public Stat() {
		super();
	}

	public Stat(int statNumber, String statType, int playerId) {
		super();
		this.statNumber = statNumber;
		this.statType = statType;
		this.playerId = playerId;
	}

	public int getStatNumber() {
		return statNumber;
	}

	public void setStatNumber(int statNumber) {
		this.statNumber = statNumber;
	}

	public String getStatType() {
		return statType;
	}

	public void setStatType(String statType) {
		this.statType = statType;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	@Override
	public String toString() {
		return "Stat [statNumber=" + statNumber + ", statType=" + statType + ", playerId=" + playerId + "]";
	}

}
