package com.tennis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Column;

@Entity
@Table(name = "Results")
public class Result {

  @Id
  @Column(name = "MatchId")
  private int matchId;
  
  @Column(name = "MatchNumber")
  private int matchNumber;
  
  @Column(name = "Date")
  private String date;
  
  @Column(name = "Time")
  private String time;
  
  @Column(name = "Day")
  private String day;
  
  @Column(name = "HomeTeam")
  private int homeTeam;
  
  @Column(name = "AwayTeam")
  private int awayTeam;
  
  @Column(name = "MatchResult")
  private String matchResult;
  
  @Column(name = "HomeTieBreaker")
  private String homeTieBreaker;
  
  @Column(name = "AwayTieBreaker")
  private String awayTieBreaker;
  
  @Transient
  private Team home_Team;
  
  @Transient
  private Team away_Team;

public int getMatchId() {
	return matchId;
}

public void setMatchId(int matchId) {
	this.matchId = matchId;
}

public int getMatchNumber() {
	return matchNumber;
}

public void setMatchNumber(int matchNumber) {
	this.matchNumber = matchNumber;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public String getDay() {
	return day;
}

public void setDay(String day) {
	this.day = day;
}

public int getHomeTeam() {
	return homeTeam;
}

public void setHomeTeam(int homeTeam) {
	this.homeTeam = homeTeam;
}

public int getAwayTeam() {
	return awayTeam;
}

public void setAwayTeam(int awayTeam) {
	this.awayTeam = awayTeam;
}

public String getMatchResult() {
	return matchResult;
}

public void setMatchResult(String matchResult) {
	this.matchResult = matchResult;
}

public Team getHome_Team() {
	return home_Team;
}

public void setHome_Team(Team home_Team) {
	this.home_Team = home_Team;
}

public Team getAway_Team() {
	return away_Team;
}

public void setAway_Team(Team away_Team) {
	this.away_Team = away_Team;
}

public String getHomeTieBreaker() {
	return homeTieBreaker;
}

public void setHomeTieBreaker(String homeTieBreaker) {
	this.homeTieBreaker = homeTieBreaker;
}

public String getAwayTieBreaker() {
	return awayTieBreaker;
}

public void setAwayTieBreaker(String awayTieBreaker) {
	this.awayTieBreaker = awayTieBreaker;
}

@Override
public String toString() {
	return "Result [matchId=" + matchId + ", matchNumber=" + matchNumber + ", date=" + date + ", time=" + time
			+ ", day=" + day + ", homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + ", matchResult=" + matchResult
			+ "]";
}
 
}