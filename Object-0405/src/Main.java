
public class Main {

	public static void main(String[] args) {
		// 各クラスのインスタンスを生成
		Animal animal = new Animal();
		Dog dog = new Dog("ポチ", 5, 12.3);

		// 出力処理
		System.out.println("名前：" + dog.name);
		System.out.println("年齢：" + dog.age + "歳");
		System.out.println("体重：" + dog.weight + "kg");
		// runメソッドの呼び出し
		dog.run();
		// それぞれのクラスのsleepメソッドの呼び出し
		animal.sleep();
		dog.sleep();
	}

}
