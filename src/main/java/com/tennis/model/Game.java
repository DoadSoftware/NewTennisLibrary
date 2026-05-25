package com.tennis.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Game {
	
	private int game_number;
	private int serving_player;

	private String home_score;

	private String away_score;

	private String game_status;
	
	private String game_winner;

	private String game_type;
	
    private List<Stat> stats;
	
	public Game() {
		super();
	}

	public Game(int game_number, String home_score, String away_score, String game_status, String game_type) {
		super();
		this.game_number = game_number;
		this.home_score = home_score;
		this.away_score = away_score;
		this.game_status = game_status;
		this.game_type = game_type;
	}

	public List<Stat> getStats() {
		return stats;
	}

	public void setStats(List<Stat> stats) {
		this.stats = stats;
	}

	public String getGame_type() {
		return game_type;
	}

	public void setGame_type(String game_type) {
		this.game_type = game_type;
	}

	public int getServing_player() {
		return serving_player;
	}

	public void setServing_player(int serving_player) {
		this.serving_player = serving_player;
	}

	public String getGame_status() {
		return game_status;
	}

	public void setGame_status(String game_status) {
		this.game_status = game_status;
	}

	public int getGame_number() {
		return game_number;
	}

	public void setGame_number(int game_number) {
		this.game_number = game_number;
	}

	public String getHome_score() {
		return home_score;
	}

	public void setHome_score(String home_score) {
		this.home_score = home_score;
	}

	public String getAway_score() {
		return away_score;
	}

	public void setAway_score(String away_score) {
		this.away_score = away_score;
	}

	public String getGame_winner() {
		return game_winner;
	}

	public void setGame_winner(String game_winner) {
		this.game_winner = game_winner;
	}

	@Override
	public String toString() {
		return "Game [game_number=" + game_number + ", serving_player=" + serving_player + ", home_score=" + home_score
				+ ", away_score=" + away_score + ", game_status=" + game_status + ", game_winner=" + game_winner
				+ ", game_type=" + game_type + "]";
	}

}
