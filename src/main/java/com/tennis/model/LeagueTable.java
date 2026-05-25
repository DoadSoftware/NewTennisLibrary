package com.tennis.model;

import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="LeagueTable")
@XmlAccessorType(XmlAccessType.FIELD)
public class LeagueTable {
	
	@XmlElementWrapper(name = "LeagueTeams")
	  @XmlElement(name = "LeagueTeam")
	  private List<LeagueTeam> LeagueTeams;

	public List<LeagueTeam> getLeagueTeams() {
		return LeagueTeams;
	}

	public void setLeagueTeams(List<LeagueTeam> leagueTeams) {
		LeagueTeams = leagueTeams;
	}

}

