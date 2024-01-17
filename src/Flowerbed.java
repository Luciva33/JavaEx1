
public class Flowerbed {

	final int MAXWATER=3; //一度に持てる水の最大値
	String color; //花の色
	int seedNum; //種の数
	int bloom; //咲いた花の数
	int water; //水の量
	
	public Flowerbed(String color , int seedNum) {
		this.color = color;
		this.seedNum = seedNum;
	}
	
	public void drawWater() {
		if(this.water ==MAXWATER) {
			System.out.println("水は満杯です！");
			return;
		
		}
		
		int draw = MAXWATER-this.water;
		System.out.println("水を" + draw + "杯汲みました。");
		
	this.water += draw;
	}
	
	public void waterFlower() {
		if(this.water == 0) {
			System.out.println("水が空っぽです");
			return;
		}
	
		if(this.seedNum == this.bloom) {
			System.out.println("全ての花が咲いています！");
			return;
	
		}
	
		System.out.println("水をまきました。");
		this.water --;
		this.bloom ++;
	
		}
	public void showStatus() {
		System.out.println("花の色は" + this.color);
		System.out.print('#');
		for(int i = 0; i < this.seedNum;i++) {
			if(i < this.bloom) {
				System.out.print('*');
			}else {
				System.out.print('.');
			}
		}
	System.out.println('#');
	}
	
}
