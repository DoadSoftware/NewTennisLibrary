package com.tennis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SingleStat {

	@JsonProperty("Number")
	private int Number;

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	@Override
	public String toString() {
		return "SingleStat [Number=" + Number + "]";
	}
	
}