package PiggyBank;
public class PiggyBank {

	int money;
	
	public PiggyBank() {
		this.money = 0;
	}
	
	public void saveMoney(int money) {
	this.money += money;
	System.out.printf("%d円貯金しました！%n", money);
	}
	void showMoney() {
		System.out.printf("現在の貯金額は%d円です%n", this.money);
	}
}
