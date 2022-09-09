package LuckySix;

public class Field {
	
	private int ordinalNumber;
	private boolean isBonus;
	private Ball ball;
	private double multiplier;
	
	public double getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}
	public Ball getBall() {
		return ball;
	}
	public void setBall(Ball ball) {
		this.ball = ball;
	}
	public Field() {
	}
	public Field(int ordinalNumber, boolean isBonus, Ball ball, double multiplier) {
		super();
		this.ordinalNumber = ordinalNumber;
		this.isBonus = isBonus;
		this.ball = ball;
		this.multiplier = multiplier;
	}
	public int getOrdinalNumber() {
		return ordinalNumber;
	}
	public void setOrdinalNumber(int ordinalNumber) {
		this.ordinalNumber = ordinalNumber;
	}
	public boolean isBonus() {
		return isBonus;
	}
	public void setBonus(boolean isBonus) {
		this.isBonus = isBonus;
	}

	@Override
	public String toString() {
		return "Field{" +
				"ordinalNumber=" + ordinalNumber +
				", isBonus=" + isBonus +
				", ball=" + ball +
				", multiplier=" + multiplier +
				'}';
	}
}
