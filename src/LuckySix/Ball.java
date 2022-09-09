package LuckySix;


public class Ball {
	private int number;

	public Ball() {
	}
	
	public Ball(int number) {
		super();
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Ball{" +
				"number=" + number +
				'}';
	}
}