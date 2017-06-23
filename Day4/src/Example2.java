
public class Example2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 10 == 7) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
