
public class calculations1 {

	public static void main(String[] args) {
		
		// Calculations: +, -, *, /, %
		int i, j;
		int sum, diff;
		i = 1;
		j = 2;
		sum = i + j;
		diff = i- j;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("sum = " + sum);
		System.out.println("diff = " + diff);
		// Student ex: add multiplication & division
		int product, quotient;
		product = i * j;
		quotient = i / j;
		System.out.println("product = " + product);
		System.out.println("quotient = " + quotient); // Why is it 0 ...
		// What will happen if i=100, j=3 ?
		
		// Remainder explained
		i = 100;
		j = 23;
		System.out.println(i % j);

	}

}
