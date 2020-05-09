
public class Main {

	public static void main(String[] args) {
		// インスタンスを生成
		Person person = new Person();

		// setter呼び出し
		person.setName("イシバシ");
		person.setAge(89);
		// getter呼び出し
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}

}
