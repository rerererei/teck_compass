
public class Person {
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
	// 引数無しでインスタンス化したときに実行される
	public Person() {}

	// 引数ありでインスタンス化したときに実行される
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*-------------------------
	 * メソッド
	 *-------------------------*/
	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "歳です。");
		System.out.println("よろしくお願いします。");
	}
}
