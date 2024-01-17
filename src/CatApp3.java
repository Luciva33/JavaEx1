import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CatApp3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		List<Cat> cats = new ArrayList<Cat>();//猫の仲間たち
		System.out.println("***猫集め***");
		ArrayList<Cat2> cats2 = new ArrayList<Cat2>();

		while (true) {

			System.out.print("1.集める 2. 遊ぶ 3.  終了>>");
			int select = new Scanner(System.in).nextInt();

			switch (select) {

			case 1:

				//集めるための猫を生む
				//猫の種類を事前に決めておく必要がある
				//猫の名前を決める
				String[] types = { "白", "黒", "茶トラ" }; //配列を使って種類を決める
				int rando = new Random().nextInt(types.length);
				String type = types[rando];
				System.out.println(type + "猫を見つけた！");

				System.out.print("この猫に名前を付けてください>>");
				String name = new Scanner(System.in).nextLine();

				Cat2 cat = new Cat2(name, type);
				cats2.add(cat);
				System.out.println(cat.name + "が仲間に加わった");

				//仲間に加わるプログラムをどう書けばいいか？
				//猫をまとめるための処理
				//ここでリストを使う

				break;

			case 2:

				if (cats.size() == 0) {
					System.out.println("まだ遊ぶ猫がいません");

				} else {

					//猫一覧の表示
					for (int i = 0; i < cats.size(); i++) {
						System.out.printf("%d・・・%s[%s](%d)\n", i, cats2.get(i).name, cats2.get(i).type,
								cats2.get(i).love);
					}
					System.out.print("どの猫と遊びますか？>>");
					select = new Scanner(System.in).nextInt();
					System.out.println(cats.get(select).name + "と遊んだ");
					System.out.println("....");

					//親密度アップ
					cats2.get(select).love++;
					System.out.println(cats2.get(select).name + "親密度がアップした!");
				}

				break;

			case 3: //終了表示
				System.out.println("***結果***");
				for (Cat2 c : cats2) {

					System.out.printf("%d%s[%s](%d)\n", c.name, c.type, c.love);
				}
				System.out.println("*また遊んでね。おしまい");
				return;                 //returna文はプログラム終了

			}
		}

	}

}
