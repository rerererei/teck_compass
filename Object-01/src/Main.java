
public class Main {

	public static void main(String[] args) {
		// 引数ありでインスタンスを生成
		Person person1 = new Person();
		person1.myProfile();
		// 引数ありでインスタンスを生成
		Person person2 = new Person("イシバシ", 85);
		person2.myProfile();
	}
}
