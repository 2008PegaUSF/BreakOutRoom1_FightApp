package beans;

public class player {

	private int playerId;
	private int wins;
	private int losses;
	
	
	public player() {
		super();
	}
	
	public player(int playerId, int wins, int losses) {
		super();
		this.playerId = playerId;
		this.wins = wins;
		this.losses = losses;
	}

	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	@Override
	public String toString() {
		return "player [playerId=" + playerId + ", wins=" + wins + ", losses=" + losses + "]";
	}

	
	
}
