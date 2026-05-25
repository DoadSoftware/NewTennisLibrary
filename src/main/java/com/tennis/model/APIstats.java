package com.tennis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class APIstats {

	@JsonProperty("Time")
	private String time;
	
	@JsonProperty("ServiceStats")
	private APIServiceStats serviceStats;
	
	@JsonProperty("ReturnStats")
	private APIReturnStats returnStats;
	
	@JsonProperty("PointStats")
	private APIPointsStats pointStats;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public APIServiceStats getServiceStats() {
		return serviceStats;
	}

	public void setServiceStats(APIServiceStats serviceStats) {
		this.serviceStats = serviceStats;
	}

	public APIPointsStats getPointStats() {
		return pointStats;
	}

	public void setPointStats(APIPointsStats pointStats) {
		this.pointStats = pointStats;
	}

	public APIReturnStats getReturnStats() {
		return returnStats;
	}

	public void setReturnStats(APIReturnStats returnStats) {
		this.returnStats = returnStats;
	}

	@Override
	public String toString() {
		return "APIstats [time=" + time + ", serviceStats=" + serviceStats + ", returnStats=" + returnStats
				+ ", pointStats=" + pointStats + "]";
	}
}
