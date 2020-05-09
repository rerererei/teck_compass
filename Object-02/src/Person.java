
public class Person {

	/*-----------------------
	 * フィールド
	 *-----------------------*/
	// 名前
	String name;
	// 年齢
	int age;
	// 財布
	static int wallet;

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

	public Person(int money) {
		Person.wallet += money;
	}

	/*-------------------------
	 * メソッド
	 *-------------------------*/
	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}
