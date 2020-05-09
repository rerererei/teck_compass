package check;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] nums = new int[9];
		System.out.println(nums[8]);
		Random r = new Random();
		System.out.println(r.nextInt(9));
		System.out.print("[");
		for (int i = 0; i < 6; i++) {
			nums[i] = i;
			int num = nums[r.nextInt(9)];
			System.out.print(num);
		}
		System.out.println("]");
	}

}
