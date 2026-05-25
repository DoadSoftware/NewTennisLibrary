package com.tennis.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) 
public class API_Tournament {

    @JsonProperty("tournament")
    private String tournament;

    @JsonProperty("venue")
    private String venue;

    @JsonProperty("day")
    private int day;

    @JsonProperty("match_no")
    private int matchNo;

    @JsonProperty("game_no")
    private int gameNo;

    @JsonProperty("match_id")
    private int matchId;

    @JsonProperty("team_a_id")
    private int teamAId;

    @JsonProperty("team_a")
    private String teamA;

    @JsonProperty("team_b_id")
    private int teamBId;

    @JsonProperty("team_b")
    private String teamB;

    @JsonProperty("game_name")
    private String gameName;

    @JsonProperty("match_status")
    private String matchStatus;

    @JsonProperty("score")
    private Score score;

    @JsonProperty("winner")
    private List<Winner> winner;

    @JsonProperty("squad")
    private Squad squad;

    @JsonProperty("playerwise_stat")
    private PlayerwiseStat playerwiseStat;

    @JsonProperty("teamwise_stat")
    private TeamwiseStat teamwiseStat;

    @JsonProperty("leader_board")
    private List<List<LeaderBoard>> leaderBoard;

   

    @Override
	public String toString() {
		return "TournamentDetails [tournament=" + tournament + ", venue=" + venue + ", day=" + day + ", matchNo="
				+ matchNo + ", gameNo=" + gameNo + ", matchId=" + matchId + ", teamAId=" + teamAId + ", teamA=" + teamA
				+ ", teamBId=" + teamBId + ", teamB=" + teamB + ", gameName=" + gameName + ", matchStatus="
				+ matchStatus + ", score=" + score + ", winner=" + winner + ", squad=" + squad + ", playerwiseStat="
				+ playerwiseStat + ", teamwiseStat=" + teamwiseStat + ", leaderBoard=" + leaderBoard + "]";
	}

	public String getTournament() {
		return tournament;
	}

	public void setTournament(String tournament) {
		this.tournament = tournament;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMatchNo() {
		return matchNo;
	}

	public void setMatchNo(int matchNo) {
		this.matchNo = matchNo;
	}

	public int getGameNo() {
		return gameNo;
	}

	public void setGameNo(int gameNo) {
		this.gameNo = gameNo;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getTeamAId() {
		return teamAId;
	}

	public void setTeamAId(int teamAId) {
		this.teamAId = teamAId;
	}

	public String getTeamA() {
		return teamA;
	}

	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}

	public int getTeamBId() {
		return teamBId;
	}

	public void setTeamBId(int teamBId) {
		this.teamBId = teamBId;
	}

	public String getTeamB() {
		return teamB;
	}

	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public List<Winner> getWinner() {
		return winner;
	}

	public void setWinner(List<Winner> winner) {
		this.winner = winner;
	}

	public Squad getSquad() {
		return squad;
	}

	public void setSquad(Squad squad) {
		this.squad = squad;
	}

	public PlayerwiseStat getPlayerwiseStat() {
		return playerwiseStat;
	}

	public void setPlayerwiseStat(PlayerwiseStat playerwiseStat) {
		this.playerwiseStat = playerwiseStat;
	}

	public TeamwiseStat getTeamwiseStat() {
		return teamwiseStat;
	}

	public void setTeamwiseStat(TeamwiseStat teamwiseStat) {
		this.teamwiseStat = teamwiseStat;
	}

	public List<List<LeaderBoard>> getLeaderBoard() {
		return leaderBoard;
	}

	public void setLeaderBoard(List<List<LeaderBoard>> leaderBoard) {
		this.leaderBoard = leaderBoard;
	}
	@JsonIgnoreProperties(ignoreUnknown = true) 
	public static class Score {
        @JsonProperty("team_a")
        private List<GameScore> teamA;

        @JsonProperty("team_b")
        private List<GameScore> teamB;

        public List<GameScore> getTeamA() {
            return teamA;
        }

        public void setTeamA(List<GameScore> teamA) {
            this.teamA = teamA;
        }

        public List<GameScore> getTeamB() {
            return teamB;
        }

        public void setTeamB(List<GameScore> teamB) {
            this.teamB = teamB;
        }
    }
	@JsonIgnoreProperties(ignoreUnknown = true) 
    public static class GameScore {
        @JsonProperty("game_1")
        private String game1;

        @JsonProperty("game_1_points")
        private int game1Points;

        @JsonProperty("game_2")
        private String game2;

        @JsonProperty("game_2_points")
        private int game2Points;

        @JsonProperty("game_3")
        private String game3;

        @JsonProperty("game_3_points")
        private int game3Points;

        @JsonProperty("game_4")
        private String game4;

        @JsonProperty("game_4_points")
        private int game4Points;

        @JsonProperty("total")
        private String total;

        @JsonProperty("total_points")
        private int totalPoints;

		public String getGame1() {
			return game1;
		}

		public void setGame1(String game1) {
			this.game1 = game1;
		}

		public int getGame1Points() {
			return game1Points;
		}

		public void setGame1Points(int game1Points) {
			this.game1Points = game1Points;
		}

		public String getGame2() {
			return game2;
		}

		public void setGame2(String game2) {
			this.game2 = game2;
		}

		public int getGame2Points() {
			return game2Points;
		}

		public void setGame2Points(int game2Points) {
			this.game2Points = game2Points;
		}

		public String getGame3() {
			return game3;
		}

		public void setGame3(String game3) {
			this.game3 = game3;
		}

		public int getGame3Points() {
			return game3Points;
		}

		public void setGame3Points(int game3Points) {
			this.game3Points = game3Points;
		}

		public String getGame4() {
			return game4;
		}

		public void setGame4(String game4) {
			this.game4 = game4;
		}

		public int getGame4Points() {
			return game4Points;
		}

		public void setGame4Points(int game4Points) {
			this.game4Points = game4Points;
		}

		public String getTotal() {
			return total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		public int getTotalPoints() {
			return totalPoints;
		}

		public void setTotalPoints(int totalPoints) {
			this.totalPoints = totalPoints;
		}

		@Override
		public String toString() {
			return "GameScore [game1=" + game1 + ", game1Points=" + game1Points + ", game2=" + game2 + ", game2Points="
					+ game2Points + ", game3=" + game3 + ", game3Points=" + game3Points + ", game4=" + game4
					+ ", game4Points=" + game4Points + ", total=" + total + ", totalPoints=" + totalPoints + "]";
		}

       
    }

    @JsonIgnoreProperties(ignoreUnknown = true) 
    public static class Winner {
        @JsonProperty("game_1")
        private String game1;

        @JsonProperty("game_1_winner")
        private String game1Winner;

        @JsonProperty("game_2")
        private String game2;

        @JsonProperty("game_2_winner")
        private String game2Winner;

        @JsonProperty("game_3")
        private String game3;

        @JsonProperty("game_3_winner")
        private String game3Winner;

        @JsonProperty("game_4")
        private String game4;

        @JsonProperty("game_4_winner")
        private String game4Winner;

		public String getGame1() {
			return game1;
		}

		public void setGame1(String game1) {
			this.game1 = game1;
		}

		public String getGame1Winner() {
			return game1Winner;
		}

		public void setGame1Winner(String game1Winner) {
			this.game1Winner = game1Winner;
		}

		public String getGame2() {
			return game2;
		}

		public void setGame2(String game2) {
			this.game2 = game2;
		}

		public String getGame2Winner() {
			return game2Winner;
		}

		public void setGame2Winner(String game2Winner) {
			this.game2Winner = game2Winner;
		}

		public String getGame3() {
			return game3;
		}

		public void setGame3(String game3) {
			this.game3 = game3;
		}

		public String getGame3Winner() {
			return game3Winner;
		}

		public void setGame3Winner(String game3Winner) {
			this.game3Winner = game3Winner;
		}

		public String getGame4() {
			return game4;
		}

		public void setGame4(String game4) {
			this.game4 = game4;
		}

		public String getGame4Winner() {
			return game4Winner;
		}

		public void setGame4Winner(String game4Winner) {
			this.game4Winner = game4Winner;
		}

		@Override
		public String toString() {
			return "Winner [game1=" + game1 + ", game1Winner=" + game1Winner + ", game2=" + game2 + ", game2Winner="
					+ game2Winner + ", game3=" + game3 + ", game3Winner=" + game3Winner + ", game4=" + game4
					+ ", game4Winner=" + game4Winner + "]";
		}

       
    }
    @JsonIgnoreProperties(ignoreUnknown = true) 
    public static class Squad {
        @JsonProperty("team_a")
        private List<Player> teamA;

        @JsonProperty("team_b")
        private List<Player> teamB;

        public List<Player> getTeamA() {
            return teamA;
        }

        public void setTeamA(List<Player> teamA) {
            this.teamA = teamA;
        }

        public List<Player> getTeamB() {
            return teamB;
        }

        public void setTeamB(List<Player> teamB) {
            this.teamB = teamB;
        }

		@Override
		public String toString() {
			return "Squad [teamA=" + teamA + ", teamB=" + teamB + "]";
		}
        
    }
    @JsonIgnoreProperties(ignoreUnknown = true) 
    public static class Player {
        @JsonProperty("player_id")
        private int playerId;

        @JsonProperty("player_name")
        private String playerName;

        @JsonProperty("gender")
        private String gender;

        @JsonProperty("age")
        private int age;

        @JsonProperty("nationality")
        private String nationality;

		@Override
		public String toString() {
			return "Player [playerId=" + playerId + ", playerName=" + playerName + ", gender=" + gender + ", age=" + age
					+ ", nationality=" + nationality + "]";
		}

		public int getPlayerId() {
			return playerId;
		}

		public void setPlayerId(int playerId) {
			this.playerId = playerId;
		}

		public String getPlayerName() {
			return playerName;
		}

		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

        
    }
    @JsonIgnoreProperties(ignoreUnknown = true) 
    public static class PlayerwiseStat {
        @JsonProperty("team_a")
        private List<PlayerStat> teamA;

        @JsonProperty("team_b")
        private List<PlayerStat> teamB;

        public List<PlayerStat> getTeamA() {
            return teamA;
        }

        public void setTeamA(List<PlayerStat> teamA) {
            this.teamA = teamA;
        }

        public List<PlayerStat> getTeamB() {
            return teamB;
        }

        public void setTeamB(List<PlayerStat> teamB) {
            this.teamB = teamB;
        }

		@Override
		public String toString() {
			return "PlayerwiseStat [teamA=" + teamA + ", teamB=" + teamB + "]";
		}
        
    }
    @JsonIgnoreProperties(ignoreUnknown = true) 
    public static class PlayerStat {
        @JsonProperty("player_name")
        private String playerName;

        @JsonProperty("player_id")
        private int playerId;

        @JsonProperty("mens_singles_points")
        private int mensSinglesPoints;

        @JsonProperty("mens_doubles_points")
        private int mensDoublesPoints;
        
        @JsonProperty("womens_singles_points")  
        private int womensSinglesPoints;

        @JsonProperty("womens_doubles_points")  
        private int womensDoublesPoints;

        @JsonProperty("total_points")
        private int totalPoints;

        @JsonProperty("aces")
        private int aces;

        @JsonProperty("winners")
        private int winners;

        @JsonProperty("unforced_errors")
        private int unforcedErrors;

        @JsonProperty("double_faults")
        private int doubleFaults;

		public String getPlayerName() {
			return playerName;
		}

		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}

		public int getPlayerId() {
			return playerId;
		}

		public void setPlayerId(int playerId) {
			this.playerId = playerId;
		}

		public int getMensSinglesPoints() {
			return mensSinglesPoints;
		}

		public void setMensSinglesPoints(int mensSinglesPoints) {
			this.mensSinglesPoints = mensSinglesPoints;
		}

		public int getMensDoublesPoints() {
			return mensDoublesPoints;
		}

		public void setMensDoublesPoints(int mensDoublesPoints) {
			this.mensDoublesPoints = mensDoublesPoints;
		}

		public int getTotalPoints() {
			return totalPoints;
		}

		public void setTotalPoints(int totalPoints) {
			this.totalPoints = totalPoints;
		}

		public int getAces() {
			return aces;
		}

		public void setAces(int aces) {
			this.aces = aces;
		}

		public int getWinners() {
			return winners;
		}

		public void setWinners(int winners) {
			this.winners = winners;
		}

		public int getUnforcedErrors() {
			return unforcedErrors;
		}

		public void setUnforcedErrors(int unforcedErrors) {
			this.unforcedErrors = unforcedErrors;
		}

		public int getDoubleFaults() {
			return doubleFaults;
		}

		public void setDoubleFaults(int doubleFaults) {
			this.doubleFaults = doubleFaults;
		}

		public int getWomensSinglesPoints() {
			return womensSinglesPoints;
		}

		public void setWomensSinglesPoints(int womensSinglesPoints) {
			this.womensSinglesPoints = womensSinglesPoints;
		}

		public int getWomensDoublesPoints() {
			return womensDoublesPoints;
		}

		public void setWomensDoublesPoints(int womensDoublesPoints) {
			this.womensDoublesPoints = womensDoublesPoints;
		}

		@Override
		public String toString() {
			return "PlayerStat [playerName=" + playerName + ", playerId=" + playerId + ", mensSinglesPoints="
					+ mensSinglesPoints + ", mensDoublesPoints=" + mensDoublesPoints + ", womensSinglesPoints="
					+ womensSinglesPoints + ", womensDoublesPoints=" + womensDoublesPoints + ", totalPoints="
					+ totalPoints + ", aces=" + aces + ", winners=" + winners + ", unforcedErrors=" + unforcedErrors
					+ ", doubleFaults=" + doubleFaults + "]";
		}

        
    }
    @JsonIgnoreProperties(ignoreUnknown = true) 
    public static class TeamwiseStat {
        @JsonProperty("team_a")
        private List<TeamStat> teamA;

        @JsonProperty("team_b")
        private List<TeamStat> teamB;

        public List<TeamStat> getTeamA() {
            return teamA;
        }

        public void setTeamA(List<TeamStat> teamA) {
            this.teamA = teamA;
        }

        public List<TeamStat> getTeamB() {
            return teamB;
        }

        public void setTeamB(List<TeamStat> teamB) {
            this.teamB = teamB;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true) 
    public static class TeamStat {
        @JsonProperty("team_name")
        private String teamName;

        @JsonProperty("team_id")
        private int teamId;

        @JsonProperty("total_points")
        private int totalPoints;

        @JsonProperty("aces")
        private int aces;

        @JsonProperty("winners")
        private int winners;

        @JsonProperty("unforced_errors")
        private int unforcedErrors;

        @JsonProperty("double_faults")
        private int doubleFaults;

		public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}

		public int getTeamId() {
			return teamId;
		}

		public void setTeamId(int teamId) {
			this.teamId = teamId;
		}

		public int getTotalPoints() {
			return totalPoints;
		}

		public void setTotalPoints(int totalPoints) {
			this.totalPoints = totalPoints;
		}

		public int getAces() {
			return aces;
		}

		public void setAces(int aces) {
			this.aces = aces;
		}

		public int getWinners() {
			return winners;
		}

		public void setWinners(int winners) {
			this.winners = winners;
		}

		public int getUnforcedErrors() {
			return unforcedErrors;
		}

		public void setUnforcedErrors(int unforcedErrors) {
			this.unforcedErrors = unforcedErrors;
		}

		public int getDoubleFaults() {
			return doubleFaults;
		}

		public void setDoubleFaults(int doubleFaults) {
			this.doubleFaults = doubleFaults;
		}

		@Override
		public String toString() {
			return "TeamStat [teamName=" + teamName + ", teamId=" + teamId + ", totalPoints=" + totalPoints + ", aces="
					+ aces + ", winners=" + winners + ", unforcedErrors=" + unforcedErrors + ", doubleFaults="
					+ doubleFaults + "]";
		}

       
    }
    @JsonIgnoreProperties(ignoreUnknown = true) 
    public static class LeaderBoard {
        @JsonProperty("matches")
        private int matches;

        @JsonProperty("points")
        private int points;

        @JsonProperty("position")
        private int position;

        @JsonProperty("team")
        private String team;

        @JsonProperty("team_id")
        private int teamId;

		public int getMatches() {
			return matches;
		}

		public void setMatches(int matches) {
			this.matches = matches;
		}

		public int getPoints() {
			return points;
		}

		public void setPoints(int points) {
			this.points = points;
		}

		public int getPosition() {
			return position;
		}

		public void setPosition(int position) {
			this.position = position;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}

		public int getTeamId() {
			return teamId;
		}

		public void setTeamId(int teamId) {
			this.teamId = teamId;
		}

		@Override
		public String toString() {
			return "LeaderBoard [matches=" + matches + ", points=" + points + ", position=" + position + ", team="
					+ team + ", teamId=" + teamId + "]";
		}

        // Getters and Setters
        // (same as previous response for LeaderBoard class)
    }
}
