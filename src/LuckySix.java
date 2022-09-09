
import java.text.DecimalFormat;
import java.util.ArrayList;

import LuckySix.Ball;
import LuckySix.Field;

public class LuckySix extends Game {
	private ArrayList<Ball> listOfBalls = new ArrayList<Ball>();
	private ArrayList<Field> listOfFields = new ArrayList<Field>();
	public void printGame() {
		for(int i = 0; i < 35; i++) {
			System.out.println("Na polju broj: " + this.listOfFields.get(i).getOrdinalNumber() + " je loptica: " + this.listOfFields.get(i).getBall().getNumber() + " Multiplier: " + this.listOfFields.get(i).getMultiplier() + " Boja je " + Boja.randomBoja());
		}
	}
	public LuckySix() {
	}
	
	public double returnUserPrize(BettingTicketLuckySix ticket) {
		int numberOfHits = 0;
		for (int i = 0; i < this.listOfFields.size(); i++) {
			for (int j = 0; j < ticket.getBalls().size(); j++) {
				if (this.listOfFields.get(i).getBall().getNumber() == ticket.getBalls().get(j).getNumber()) {
					numberOfHits++;
					if (numberOfHits == 6) {
						double prize = this.listOfFields.get(i).getMultiplier() * ticket.getTicketPrice();
						return prize;
					}
				}
			}
		}
		return 0;
	}
	
	public boolean isFieldBonus() {
		int randomNumber = (int)(Math.random() * 10) + 1;
		boolean isFieldBonus = false;
		if (randomNumber == 5) {
			return true;
		}
		return false;
	}
	DecimalFormat f = new DecimalFormat("##.00");
	public void createGame() {
		for (int i = 1; i <= 48; i++) {
			Ball ball = new Ball(i);
			this.listOfBalls.add(ball);
		}
		double multiplier = 10000;
		for (int i = 0; i < 35; i++) {
			int randomBallIndex = (int)(Math.random() * 48) + 0;
			boolean isBallAssigned = false;
			while (!isBallAssigned) {
				try {
					if (!isBallAssignedAlready(this.listOfBalls.get(randomBallIndex))) {
						if (i > 5) {
							multiplier = multiplier / 1.33;
						}
						Field field = new Field(i + 1, this.isFieldBonus(), this.listOfBalls.get(randomBallIndex), Double.parseDouble(f.format(multiplier)));
						this.listOfFields.add(field);
						isBallAssigned = true;
					}
					randomBallIndex = (int)(Math.random() * 48) + 0;
				} catch(Exception e) {
					randomBallIndex = (int)(Math.random() * 48) + 0;
				}
			}
		}
	}
	public boolean isBallAssignedAlready(Ball ball) {
		for (int i = 0; i < this.listOfFields.size(); i++) {
			if (this.listOfFields.get(i).getBall().getNumber() == ball.getNumber()) {
				return true;
			}
		}
		return false;
	}
	public LuckySix(String name, int id, ArrayList<Ball> listOfBalls, ArrayList<Field> listOfFields) {
		super(name, id);
		this.listOfBalls = listOfBalls;
		this.listOfFields = listOfFields;
	}
	public ArrayList<Ball> getListOfBalls() {
		return listOfBalls;
	}
	public void setListOfBalls(ArrayList<Ball> listOfBalls) {
		this.listOfBalls = listOfBalls;
	}
	public ArrayList<Field> getListOfFields() {
		return listOfFields;
	}
	public void setListOfFields(ArrayList<Field> listOfFields) {
		this.listOfFields = listOfFields;
	}

	@Override
	public String toString() {
		return "LuckySix{" +
				"listOfBalls=" + listOfBalls +
				", listOfFields=" + listOfFields +
				'}';
	}
}
