import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		System.out.println("ArrayListを使ってみよう!");
		System.out.println("Listに数字をどんどん追加していってみよう");
		List<Integer> list = new ArrayList<>();

		while (true) {
			System.out.print("要素追加するよ数字を入れてね(0で終了):");
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			list.add(input);

		}

		System.out.println("--結果--");
		System.out.printf("要素数:%d%n", list.size());
		System.out.print("要素");
		for (int n : list) {
			System.out.print(n + ",");
		}

		System.out.println();
	}

}
