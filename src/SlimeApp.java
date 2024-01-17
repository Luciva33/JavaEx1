import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SlimeApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			
		Scanner sc = new Scanner(System.in);
		List<Slime>List = new ArrayList<>();
		
		while(true) {
			System.out.print("スライムを追加する?(1...yes,2...no):");
			int input = sc.nextInt();
			if(input != 1) {
				break;
			}
		
			System.out.print("追加するスライムの名前を決めてね:");
			String name = sc.next();
			Slime slime = new Slime(name);
			slime.appear();
			List.add(slime);
			
		}
		
		for(Slime s : List) {
			s.attack();
		}
		
	}

}
