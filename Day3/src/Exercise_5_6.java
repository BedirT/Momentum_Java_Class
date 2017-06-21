
public class Exercise_5_6 {
	public static void main(String[] args) {
		// Example 5
		int sum = 0;
		for (int i = 1; i <= 11; i = i + 2) {
			sum = sum + (i * i);
		}
		System.out.println(sum);

		// Example 6
		// (1)
		int product = 1;
		for (int i = 1; i <= 10; i += 1) {
			product *= i;
		}
		System.out.println(product);

		// (2)
		long productLong = 1;
		for (int i = 2; i <= 29; i += 3) {
			productLong *= i;
		}
		System.out.println(productLong);
	}
}
