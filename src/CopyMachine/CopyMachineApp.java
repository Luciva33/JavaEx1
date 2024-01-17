package CopyMachine;
import java.util.Scanner;

public class CopyMachineApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("最初に給紙する枚数を入力してください >");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		CopyMachine cm = new CopyMachine(num);
		
		while(true) {
			System.out.print("1. 給紙 / 2. コピー / 3. 表示 / 4. 終了 /");
			int select = s.nextInt();
			switch(select) {
			
			case 1:
				
			System.out.print("給紙する枚数を入力して下さい");
			num = s.nextInt();
			cm.feedPaper(num);
			break;
				
			case 2:
				
				num =s.nextInt();
				cm.copy(num);
				break;
				
			case 3:
				
				cm.display();
				break;
				
			default:
				
				System.out.println("アプリケーションを終了します");
				return;
			}
			
			
		}
		
		
		
	}

}
