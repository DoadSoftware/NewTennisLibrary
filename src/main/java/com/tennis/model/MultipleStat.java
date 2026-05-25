package com.tennis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MultipleStat {

	@JsonProperty("Percent")
	private String percent;
	
	@JsonProperty("Dividend")
	private String dividend;
	
	@JsonProperty("Divisor")
	private String divisor;

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	public String getDividend() {
		return dividend;
	}

	public void setDividend(String dividend) {
		this.dividend = dividend;
	}

	public String getDivisor() {
		return divisor;
	}

	public void setDivisor(String divisor) {
		this.divisor = divisor;
	}

	@Override
	public String toString() {
		return "MultipleStat [percent=" + percent + ", dividend=" + dividend + ", divisor=" + divisor + "]";
	}

}