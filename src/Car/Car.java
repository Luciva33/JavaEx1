package Car;
public class Car {

	double fuelRest;
	double fuelRatio;
	double fuelMax;
	
	public Car(double fuelRest, double fuelRatio, double fuelMax) {
		this.fuelRest = fuelRest;
		this.fuelRatio = fuelRatio;
		this.fuelMax = fuelMax;
	}
	
	public void displayFuel() {
		System.out.printf("現在の燃料は%.1fリットルです\n", this.fuelRest);
	}
	
	public void addFuel(double fuel) {
		if(this.fuelRest + fuel > this.fuelMax) {
			System.out.println("そんなに給油できません");
		}else {
			System.out.printf("%.0fリットル給油します。\n",fuel);
			this.fuelRest += fuel;
		
			}
		displayFuel();
		
		}
	
		public void run(double distance) {
			if(distance / this.fuelRatio > this.fuelRest) {
				System.out.println("そんなに走行できません");
			}else {
				System.out.printf("%.0fキロ走行します\n",distance);
				this.fuelRest -= distance / fuelRatio;
			}
	
	}
}
