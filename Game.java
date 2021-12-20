public class Game {

	String player1;
	String player2;
	
	public Game(String player1, String player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
	}	
	
	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getPlayer2() {
		return player2;
	}
	public void setPlayer2(String player2) {
		this.player2 = player2;
	}

	@Override
	public String toString() {
		return "Game [player1=" + player1 + ", player2=" + player2 + "]";
	}
}
