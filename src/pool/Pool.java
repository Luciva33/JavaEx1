package pool;
public class Pool {

	private static final double MAX = 600.0d;
	private double water;

	public Pool() {
		this.water = 0.0;
	}

	public void feedWater(double water) {

		double feed = this.water + water > MAX ? MAX - this.water : water;
		this.water += feed;
		System.out.printf("%.1f立方メートル給水しました。%n", feed);

	}

	public void drainWater(double water) {

		double drain = this.water - water > 0 ? water : this.water;
		this.water -= drain;
		System.out.printf("\"%.1f立方メートル排水しました。%n", drain);

	}

	public void display() {
		System.out.printf("現在の水量は%.1f立方メートルです。%n", this.water);

	}

}
