public class Cat {
	String name; // 名前
	String type; // 種類
	int intimacy;// 親密度

	
	//コンストラクタ
	//戻り値は書かずにpublic Cat(String name,String type,int intimacy){
	
	
	public Cat(String name, String type) {
		this.name = name;
		this.type = type;
		this.intimacy = 0;
	}
	
	//
	
	
	public void play() {
		System.out.println(this.name + "と遊んだ");
		System.out.println("...");
		System.out.println(this.name + "の親密度がアップした!");
		this.intimacy++;
	}

	public String showStatus() {
		return String.format("%s[%s](%d)", this.name, this.type, this.intimacy);
	}
}