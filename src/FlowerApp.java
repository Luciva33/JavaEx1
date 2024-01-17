import java.util.Scanner;

public class FlowerApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		System.out.print("何色の花にしますか");
		String color = sc.next();
		System.out.print("種をいくつ植えますか？");
		int seedNum = sc.nextInt();
		Flowerbed fb = new Flowerbed(color,seedNum);
		while(true) {
		System.out.print("何をしますか？1…水汲み2…水撒き3…花壇を見る4…終了>");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				fb.drawWater();
				break;
			case 2:
				fb.waterFlower();
				break;
				
			case 3:
			
				fb.showStatus();
				break;
				
			default:
				
				System.out.println("アプリケーションを終了します。");
				return;
				
			}
		}
		
		
		
	}

}
