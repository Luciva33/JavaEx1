package CopyMachine;
public class CopyMachine {
	int paper;
	public CopyMachine(int sheet) {
		this.paper  = sheet > 0 ? sheet : 0;
		
	}
	
	public void feedPaper(int sheet) {
		this.paper += sheet;
		System.out.printf("%d給紙しました。\n",sheet);
	}
	
	public void copy(int sheet) {
		int num = this.paper > sheet ? sheet : this.paper;
		this.paper -= num;
		System.out.printf("%d枚コピーしました。\n",num);
		
	}
	
	public void display() {
		System.out.printf("コピー可能な枚数は%d枚です。\n",this.paper);
	}
	
	
}
