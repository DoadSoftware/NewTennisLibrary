package com.tennis.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Set {
	
	private int set_number;

	private String set_status;
	
	private String set_winner;

    private List<Game> games;

	public Set(int set_number, String set_status, List<Game> games) {
		super();
		this.set_number = set_number;
		this.set_status = set_status;
		this.games = games;
	}

	public Set() {
		super();
	}
	public int getSet_number() {
		return set_number;
	}

	public void setSet_number(int set_number) {
		this.set_number = set_number;
	}

	public String getSet_status() {
		return set_status;
	}

	public void setSet_status(String set_status) {
		this.set_status = set_status;
	}

	public String getSet_winner() {
		return set_winner;
	}

	public void setSet_winner(String set_winner) {
		this.set_winner = set_winner;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "Set [set_number=" + set_number + ", set_status=" + set_status + ", set_winner=" + set_winner
				+ ", games=" + games + "]";
	}

}
