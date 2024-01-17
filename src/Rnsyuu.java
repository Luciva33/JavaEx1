
public class Rnsyuu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("月を入力して下さい >");
		int num = new java.util.Scanner(System.in).nextInt();
		System.out.print(num + "月の日数は" +getNumberofDays(num) + "日です。");
	}
	public static int getNumberofDays(int month ) {
		switch(month) {
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default :
			return 31;
		}
	}

}