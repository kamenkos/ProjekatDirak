import java.util.ArrayList;

import LuckySix.Ball;
import LuckySix.Field;

public class Results {

	private ArrayList<BettingTicketLuckySix> listOfBettingTickets = new ArrayList<BettingTicketLuckySix>();
	private ArrayList<Player> listOfPlayersWon = new ArrayList<Player>();
	private ArrayList<Player> listOfPlayersLost = new ArrayList<Player>();
	private LuckySix luckySix = new LuckySix();
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public void addPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	
	public void addLuckySix(LuckySix luckySix) {
		this.luckySix = luckySix;
	}
	
	public void checkIfPlayersGotPrize() {
		for (int i = 0; i < this.players.size(); i++) {
			for (int j = 0; j < this.players.get(i).getTickets().size(); j++) {
				double prize = this.luckySix.returnUserPrize(this.players.get(i).getTickets().get(j));
				if (prize != 0) {
					this.listOfPlayersWon.add(this.players.get(i));
					this.players.get(i).setAccountMoney(this.players.get(i).getAccountMoney() + prize);
				}else{
					this.listOfPlayersLost.add(this.players.get(i));
					this.players.get(i).setAccountMoney(this.players.get(i).getAccountMoney() * 0);
				}

			}
		}
	}
	public void printWinners() {
		for (int i = 0; i<this.listOfPlayersWon.size(); i++) {
			System.out.println("Cestitamo, dobitnik je: " + this.listOfPlayersWon.get(i).getNadimak() + " Novo stanje je: " + this.listOfPlayersWon.get(i).getAccountMoney());
		}
	}
	public void printLosers(){
		for (int i = 0; i<this.listOfPlayersLost.size(); i++) {
			System.out.println("Zao nam je " + this.listOfPlayersLost.get(i).getNadimak() + " stanje je: " + 0);
		}
	}

	@Override
	public String toString() {
		return "Results{" +
				"listOfBettingTickets=" + listOfBettingTickets +
				", listOfPlayersWon=" + listOfPlayersWon +
				", listOfPlayersLost=" + listOfPlayersLost +
				", luckySix=" + luckySix +
				", players=" + players +
				'}';
	}
}
