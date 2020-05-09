
public class Animal {
	// 課題4,5
	/*-----------------------
	 * フィールド
	 *-----------------------*/
	// 名前
	String name;
	// 年齢
	int age;

	/*-----------------------
	 * コンストラクタ
	 *-----------------------*/
	public Animal() {}
	public Animal( String name, int age ) {
		this.name = name;
		this.age = age;
	}

	/*-------------------------
	 * メソッド
	 *-------------------------*/
	// 眠る
	public void sleep() {
		System.out.println("眠った");
	}
}
