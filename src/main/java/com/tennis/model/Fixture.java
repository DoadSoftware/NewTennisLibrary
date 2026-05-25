package com.tennis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Column;

@Entity
@Table(name = "Fixtures")
public class Fixture {

  @Id
  @Column(name = "MatchId")
  private int matchId;
  
  @Column(name = "MatchNumber")
  private int matchNumber;
  
  @Column(name = "GameNumber")
  private int gameNumber;
  
  @Column(name = "MatchFileName")
  private String matchfilename;
  
  @Column(name = "Date")
  private String date;
  
  @Column(name = "Categary")
  private String categary;
  
  @Column(name = "TypeOfMatch")
  private String typeOfMatch;
  
  @Column(name = "MatchResult")
  private String matchResult;
  
  @Column(name = "Day")
  private int day;
  
  @Column(name = "HomePlayerFirst")
  private Integer homePlayerFirst;
  
  @Column(name = "HomePlayerSecond")
  private Integer homePlayerSecond;
  
  @Column(name = "AwayPlayerFirst")
  private Integer awayPlayerFirst;
  
  @Column(name = "AwayPlayerSecond")
  private Integer awayPlayerSecond;
  
  @Transient
  private Player home_FirstPlayer;
  
  @Transient
  private Player home_SecondPlayer;
  
  @Transient
  private Player away_FirstPlayer;
  
  @Transient
  private Player away_SecondPlayer;

public Fixture() {
	super();
}

public Fixture(int matchId) {
	super();
	this.matchId = matchId;
}

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

public int getGameNumber() {
	return gameNumber;
}

public void setGameNumber(int gameNumber) {
	this.gameNumber = gameNumber;
}

public String getMatchfilename() {
	return matchfilename;
}

public void setMatchfilename(String matchfilename) {
	this.matchfilename = matchfilename;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public Integer getHomePlayerFirst() {
	return homePlayerFirst;
}

public void setHomePlayerFirst(Integer homePlayerFirst) {
	this.homePlayerFirst = homePlayerFirst;
}

public Integer getHomePlayerSecond() {
	return homePlayerSecond;
}

public void setHomePlayerSecond(Integer homePlayerSecond) {
	this.homePlayerSecond = homePlayerSecond;
}

public Integer getAwayPlayerFirst() {
	return awayPlayerFirst;
}

public void setAwayPlayerFirst(Integer awayPlayerFirst) {
	this.awayPlayerFirst = awayPlayerFirst;
}

public Integer getAwayPlayerSecond() {
	return awayPlayerSecond;
}

public void setAwayPlayerSecond(Integer awayPlayerSecond) {
	this.awayPlayerSecond = awayPlayerSecond;
}

public String getCategary() {
	return categary;
}

public void setCategary(String categary) {
	this.categary = categary;
}

public String getTypeOfMatch() {
	return typeOfMatch;
}

public void setTypeOfMatch(String typeOfMatch) {
	this.typeOfMatch = typeOfMatch;
}

public Player getHome_FirstPlayer() {
	return home_FirstPlayer;
}

public void setHome_FirstPlayer(Player home_FirstPlayer) {
	this.home_FirstPlayer = home_FirstPlayer;
}

public Player getHome_SecondPlayer() {
	return home_SecondPlayer;
}

public void setHome_SecondPlayer(Player home_SecondPlayer) {
	this.home_SecondPlayer = home_SecondPlayer;
}

public Player getAway_FirstPlayer() {
	return away_FirstPlayer;
}

public void setAway_FirstPlayer(Player away_FirstPlayer) {
	this.away_FirstPlayer = away_FirstPlayer;
}

public Player getAway_SecondPlayer() {
	return away_SecondPlayer;
}

public void setAway_SecondPlayer(Player away_SecondPlayer) {
	this.away_SecondPlayer = away_SecondPlayer;
}

public String getMatchResult() {
	return matchResult;
}

public void setMatchResult(String matchResult) {
	this.matchResult = matchResult;
}

@Override
public String toString() {
	return "Fixture [matchId=" + matchId + ", matchNumber=" + matchNumber + ", gameNumber=" + gameNumber
			+ ", matchfilename=" + matchfilename + ", date=" + date + ", categary=" + categary + ", typeOfMatch="
			+ typeOfMatch + ", day=" + day + ", homePlayerFirst=" + homePlayerFirst + ", homePlayerSecond="
			+ homePlayerSecond + ", awayPlayerFirst=" + awayPlayerFirst + ", awayPlayerSecond=" + awayPlayerSecond
			+ ", home_FirstPlayer=" + home_FirstPlayer + ", home_SecondPlayer=" + home_SecondPlayer
			+ ", away_FirstPlayer=" + away_FirstPlayer + ", away_SecondPlayer=" + away_SecondPlayer + ", getMatchId()="
			+ getMatchId() + ", getMatchNumber()=" + getMatchNumber() + ", getGameNumber()=" + getGameNumber()
			+ ", getMatchfilename()=" + getMatchfilename() + ", getDate()=" + getDate() + ", getDay()=" + getDay()
			+ ", getHomePlayerFirst()=" + getHomePlayerFirst() + ", getHomePlayerSecond()=" + getHomePlayerSecond()
			+ ", getAwayPlayerFirst()=" + getAwayPlayerFirst() + ", getAwayPlayerSecond()=" + getAwayPlayerSecond()
			+ ", getCategary()=" + getCategary() + ", getTypeOfMatch()=" + getTypeOfMatch() + ", getHome_FirstPlayer()="
			+ getHome_FirstPlayer() + ", getHome_SecondPlayer()=" + getHome_SecondPlayer() + ", getAway_FirstPlayer()="
			+ getAway_FirstPlayer() + ", getAway_SecondPlayer()=" + getAway_SecondPlayer() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}