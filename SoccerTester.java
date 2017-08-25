
public class SoccerTester extends SoccerTeam {
		
		public static void main(String[] args) {
			
			SoccerTeam soc1 = new SoccerTeam();
			SoccerTeam soc2 = new SoccerTeam();
			SoccerTeam soc3 = new SoccerTeam();
			SoccerTeam soc4 = new SoccerTeam();
			
			//tourney one, each team plays 3 games (round robin)
			soc1.played(soc2, 3, 5);
			soc1.played(soc3, 1, 4);
			soc1.played(soc4, 4, 3);
			soc2.played(soc3, 5, 0);
			soc2.played(soc4, 4, 3);
			soc3.played(soc4, 3, 8);
			
			System.out.println("Team One: " + soc1.getTournamentPoints());
			System.out.println("Team Two: " +soc2.getTournamentPoints());
			System.out.println("Team Three: " + soc3.getTournamentPoints());
			System.out.println("Team Four: " + soc4.getTournamentPoints());
			System.out.println("Total Games Played: " + getGamesPlayed());
			System.out.println("Total Goals Scored: " + getTotalGoals());
			
			startTournament();
			soc1.resetRecord();
			soc2.resetRecord();
			soc3.resetRecord();
			soc4.resetRecord();
			
			//tourney two, same format
			soc1.played(soc2, 2, 1);
			soc1.played(soc3, 12, 3);
			soc1.played(soc4, 4, 4); //soc1 was practicing
			soc2.played(soc3, 2, 6);
			soc2.played(soc4, 3, 1);
			soc3.played(soc4, 1, 5);
			
			System.out.println("");
			System.out.println("Team One: " + soc1.getTournamentPoints());
			System.out.println("Team Two: " +soc2.getTournamentPoints());
			System.out.println("Team Three: " + soc3.getTournamentPoints());
			System.out.println("Team Four: " + soc4.getTournamentPoints());
			System.out.println("Total Games Played: " + getGamesPlayed());
			System.out.println("Total Goals Scored: " + getTotalGoals());
			
			
		}
		
		
}
