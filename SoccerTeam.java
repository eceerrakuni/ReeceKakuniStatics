
public class SoccerTeam {
	
	private int wins;
	private int losses;
	private int ties;
	private int TournamentPoints;
	private static int gamesPlayed = 0;
	private static int totalGoals = 0;
	
	public void played(SoccerTeam opponent, int myScore, int opponentScore) {
		gamesPlayed = gamesPlayed + 1;
		totalGoals = opponentScore + myScore + totalGoals;
		if (myScore > opponentScore) {
			wins = wins + 1;
			opponent.losses = opponent.losses + 1;
		} else if (myScore == opponentScore) {
			ties = ties + 1;
			opponent.ties = opponent.ties + 1;
		} else if (myScore < opponentScore) {
			losses = losses + 1;
			opponent.wins = opponent.wins + 1;
		}
	}
	
	public int getTournamentPoints() {
		TournamentPoints = wins * 3 + ties;
		return TournamentPoints;
	}
	
	public void resetRecord() {
		losses = 0;
		wins = 0;
		ties = 0;
	}
	
	public static int getGamesPlayed() {
		return gamesPlayed;
	}
	
	public static int getTotalGoals() {
		return totalGoals;
	}
	
	
	public static void startTournament() {
		gamesPlayed = 0;
		totalGoals = 0;
	}

}
