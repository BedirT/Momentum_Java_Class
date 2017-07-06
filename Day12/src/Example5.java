
public class Example5 {

	public static void main(String[] args) {

		int[] nums = { 7, 7, 1, 7, 8, 7, 4, 3, 7, 9, 8 };
		int sum = 0;

		for(int i = 0; i < nums.length; i++)
			sum += nums[i];

		System.out.println("Sum = " + sum);
	}

}
