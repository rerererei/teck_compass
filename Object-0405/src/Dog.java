
public class Dog extends Animal {

	/*-----------------------
	 * フィールド
	 *-----------------------*/
	// weightフィールドの追加
	double weight;

	/*-----------------------
	 * コンストラクタ
	 *-----------------------*/
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	/*-------------------------
	 * メソッド
	 *-------------------------*/
	// runメソッド追加
	public void run() {
		System.out.println(this.name + "は走った");
	}

	// sleepメソッドをオーバーライド
	public void sleep() {
		System.out.print(this.name + "は");
		super.sleep();
	}
}
