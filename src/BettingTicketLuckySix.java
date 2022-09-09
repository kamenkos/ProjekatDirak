import java.util.ArrayList;

import LuckySix.Ball;

public class BettingTicketLuckySix {
	
	private double prizeWon;
	private double ticketPrice;
	private ArrayList<Ball> balls = new ArrayList<Ball>();
	private Game game;
	
	public ArrayList<Ball> getBalls() {
		return balls;
	}
	public void setBalls(ArrayList<Ball> balls) {
		this.balls = balls;
	}
	
	public BettingTicketLuckySix() {
	}
	public BettingTicketLuckySix(double ticketPrice, Game game, ArrayList<Ball> balls) {
		super();
		this.balls = balls;
		this.ticketPrice = ticketPrice;
		this.game = game;
	}
	public double getPrizeWon() {
		return prizeWon;
	}
	public void setPrizeWon(double prizeWon) {
		this.prizeWon = prizeWon;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}

	@Override
	public String toString() {
		return "BettingTicketLuckySix{" +
				"prizeWon=" + prizeWon +
				", ticketPrice=" + ticketPrice +
				", balls=" + balls +
				", game=" + game +
				'}';
	}
}
