public class PlayMonitor
{
	public static int matchWin(String winningTracking)
	{				
		String[] arr = winningTracking.split("/");

		StringBuilder sb = new StringBuilder();
		sb.append(arr[1]); //game
		sb.append(",");		
		sb.append(arr[0]); //win
		sb.append(":");
		sb.append(arr[3]); //game
		sb.append(",");	
		sb.append(arr[2]); //win
		sb.append(":");
		sb.append(arr[5]); //game
		sb.append(",");	
		sb.append(arr[4]); //win

		int noOfGamesInLeg1 = Integer.parseInt(arr[1]);
		int noOfGamesInLeg2 = Integer.parseInt(arr[3]);
		int noOfGamesInLeg3 = Integer.parseInt(arr[5]);

		int legNoOfWins1 = Integer.parseInt(arr[0]);
		int legNoOfWins2 = Integer.parseInt(arr[2]);
		int legNoOfWins3 = Integer.parseInt(arr[4]);	

		double sumOfGames = noOfGamesInLeg1 + noOfGamesInLeg2 + noOfGamesInLeg3;
		double sumOfWins = legNoOfWins1 + legNoOfWins2 + legNoOfWins3;

		double percentage = (sumOfWins/sumOfGames)*100;	
		int resultPercentage = (int) percentage;

		return resultPercentage;	

	}

	static int playerValidate(Game game) {		

		String p1 = game.getPlayer1();
		String p2 = game.getPlayer2();

		//Allowed Name Pattern = First Letter Capital, followed by small letters; spaces & hyphen allowed.
		
		if(p1.matches("[A-Z][a-z]*\\s*-*\\s*[a-z]*\\s*") && (p2.matches("[A-Z][a-z]*\\s*-*\\s*[a-z]*\\s*"))) 
		{
			return 10; // Both player's name is valid
		}

		else if(p1.matches("[A-Z][a-z]*\\s*-*\\s*[a-z]*\\s*") || (p2.matches("[A-Z][a-z]*\\s*-*\\s*[a-z]*\\s*"))) 
		{
			return 5; //Either of player's name is valid
		}

		else
		{
			return 0; //Neither of player's name is valid
		}
	}
	
	//driver code
	public static void main(String[] args)
	{		
		//leg 1 = 2/3 games won; leg2 = 2/5 games won; leg3 = 0/2 games won
		System.out.println("Winning Percentage: "+matchWin("2/3/2/5/0/2")+"%"); 

		Game g1 = new Game("Alpha-bravo","Charlie delta");
		System.out.println(playerValidate(g1));

	}
}
