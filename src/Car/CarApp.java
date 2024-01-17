package Car;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car = new Car(30.0, 8.4, 60.0);
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("1. 走行 / 2. 給油 / 3. 残量表示 / 4. 終了 >");
			int select = s.nextInt();
			switch (select) {

			case 1:

				System.out.print("何キロ走行しますか >");
				double km = s.nextDouble();
				car.run(km);
				break;

			case 2:

				System.out.print("何リットル給油しますか >");
				double l = s.nextDouble();
				car.addFuel(l);
				break;

			case 3:

				car.displayFuel();
				break;

			case 4:

				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}

}
