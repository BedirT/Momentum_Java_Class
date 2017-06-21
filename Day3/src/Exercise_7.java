import java.math.BigInteger;

public class Exercise_7 {

	public static void main(String[] args) {
		
		// Exercise 7
		// 40th term of Fibonacci
		long fibonacci = 2;
		long fibonacci2 = 5;
		for (int i = 0; i < 38; i += 1) {
			long temp = fibonacci2; 
			fibonacci2 += fibonacci;
			fibonacci = temp;
		}
		System.out.println(fibonacci2);

		// EXTRA - Challenge
		// 100th term ...
		BigInteger fb = new BigInteger("2");
		BigInteger fb2 = new BigInteger("5");
		for (int i = 0; i < 98; i += 1) {
			BigInteger temp = fb2;
			fb2 = fb2.add(fb);
			fb = temp;
		}
		System.out.println(fb2);
	}

}
