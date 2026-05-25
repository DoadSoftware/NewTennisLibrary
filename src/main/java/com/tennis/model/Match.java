package com.tennis.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Match {

  private String matchFileTimeStamp;

  private String matchResult;

  private String tieBreakerRule;

  private String advantageRule;
  
  private String matchStatus;
  
  private String matchFileName;

  private String tournament;

  private String matchIdent;
  
  private String categoryType;
  
  private String matchType;
  
  private String matchId;

  private int homeFirstPlayerId;

  private int homeSecondPlayerId;

  private int awayFirstPlayerId;

  private int awaySecondPlayerId;
  
  private int retiredHurtPlayerId;

  private List<Set> sets;
  
  @JsonIgnore 
  private Player homeFirstPlayer;

    @JsonIgnore 
  private Player homeSecondPlayer;
  
    @JsonIgnore 
  private Player awayFirstPlayer;

    @JsonIgnore 
  private Player awaySecondPlayer;

  private Clock clock;
  
    @JsonIgnore 
  private List<Event> events;

    @JsonIgnore 
  private List<Player> players;
 
    @JsonIgnore 
  private int home_total_score;
  
    @JsonIgnore 
  private int away_total_score;
  
public int getHome_total_score() {
	return home_total_score;
}

public void setHome_total_score(int home_total_score) {
	this.home_total_score = home_total_score;
}

public int getAway_total_score() {
	return away_total_score;
}

public void setAway_total_score(int away_total_score) {
	this.away_total_score = away_total_score;
}

  
public List<Player> getPlayers() {
	return players;
}

public void setPlayers(List<Player> players) {
	this.players = players;
}

public String getAdvantageRule() {
	return advantageRule;
}

public void setAdvantageRule(String advantageRule) {
	this.advantageRule = advantageRule;
}

public String getTieBreakerRule() {
	return tieBreakerRule;
}

public void setTieBreakerRule(String tieBreakerRule) {
	this.tieBreakerRule = tieBreakerRule;
}

public String getMatchFileTimeStamp() {
	return matchFileTimeStamp;
}

public void setMatchFileTimeStamp(String matchFileTimeStamp) {
	this.matchFileTimeStamp = matchFileTimeStamp;
}

public String getMatchResult() {
	return matchResult;
}

public void setMatchResult(String matchResult) {
	this.matchResult = matchResult;
}

public String getMatchStatus() {
	return matchStatus;
}

public void setMatchStatus(String matchStatus) {
	this.matchStatus = matchStatus;
}

public String getMatchFileName() {
	return matchFileName;
}

public void setMatchFileName(String matchFileName) {
	this.matchFileName = matchFileName;
}

public String getTournament() {
	return tournament;
}

public void setTournament(String tournament) {
	this.tournament = tournament;
}

public String getMatchIdent() {
	return matchIdent;
}

public void setMatchIdent(String matchIdent) {
	this.matchIdent = matchIdent;
}

public String getMatchType() {
	return matchType;
}

public void setMatchType(String matchType) {
	this.matchType = matchType;
}

public int getHomeFirstPlayerId() {
	return homeFirstPlayerId;
}

public void setHomeFirstPlayerId(int homeFirstPlayerId) {
	this.homeFirstPlayerId = homeFirstPlayerId;
}

public int getHomeSecondPlayerId() {
	return homeSecondPlayerId;
}

public void setHomeSecondPlayerId(int homeSecondPlayerId) {
	this.homeSecondPlayerId = homeSecondPlayerId;
}

public int getAwayFirstPlayerId() {
	return awayFirstPlayerId;
}

public void setAwayFirstPlayerId(int awayFirstPlayerId) {
	this.awayFirstPlayerId = awayFirstPlayerId;
}

public int getAwaySecondPlayerId() {
	return awaySecondPlayerId;
}

public void setAwaySecondPlayerId(int awaySecondPlayerId) {
	this.awaySecondPlayerId = awaySecondPlayerId;
}

public List<Set> getSets() {
	return sets;
}

public void setSets(List<Set> sets) {
	this.sets = sets;
}

public Player getHomeFirstPlayer() {
	return homeFirstPlayer;
}

public void setHomeFirstPlayer(Player homeFirstPlayer) {
	this.homeFirstPlayer = homeFirstPlayer;
}

public Player getHomeSecondPlayer() {
	return homeSecondPlayer;
}

public void setHomeSecondPlayer(Player homeSecondPlayer) {
	this.homeSecondPlayer = homeSecondPlayer;
}

public Player getAwayFirstPlayer() {
	return awayFirstPlayer;
}

public void setAwayFirstPlayer(Player awayFirstPlayer) {
	this.awayFirstPlayer = awayFirstPlayer;
}

public Player getAwaySecondPlayer() {
	return awaySecondPlayer;
}

public void setAwaySecondPlayer(Player awaySecondPlayer) {
	this.awaySecondPlayer = awaySecondPlayer;
}

public List<Event> getEvents() {
	return events;
}

public void setEvents(List<Event> events) {
	this.events = events;
}

public Clock getClock() {
	return clock;
}

public void setClock(Clock clock) {
	this.clock = clock;
}

public String getCategoryType() {
	return categoryType;
}

public void setCategoryType(String categoryType) {
	this.categoryType = categoryType;
}

public String getMatchId() {
	return matchId;
}

public void setMatchId(String matchId) {
	this.matchId = matchId;
}

public int getRetiredHurtPlayerId() {
	return retiredHurtPlayerId;
}

public void setRetiredHurtPlayerId(int retiredHurtPlayerId) {
	this.retiredHurtPlayerId = retiredHurtPlayerId;
}

@Override
public String toString() {
	return "Match [matchFileTimeStamp=" + matchFileTimeStamp + ", matchResult=" + matchResult + ", tieBreakerRule="
			+ tieBreakerRule + ", advantageRule=" + advantageRule + ", matchStatus=" + matchStatus + ", matchFileName="
			+ matchFileName + ", tournament=" + tournament + ", matchIdent=" + matchIdent + ", categoryType="
			+ categoryType + ", matchType=" + matchType + ", matchId=" + matchId + ", homeFirstPlayerId="
			+ homeFirstPlayerId + ", homeSecondPlayerId=" + homeSecondPlayerId + ", awayFirstPlayerId="
			+ awayFirstPlayerId + ", awaySecondPlayerId=" + awaySecondPlayerId + ", retiredHurtPlayerId="
			+ retiredHurtPlayerId + ", sets=" + sets + ", homeFirstPlayer=" + homeFirstPlayer + ", homeSecondPlayer="
			+ homeSecondPlayer + ", awayFirstPlayer=" + awayFirstPlayer + ", awaySecondPlayer=" + awaySecondPlayer
			+ ", clock=" + clock + ", events=" + events + "]";
}

}