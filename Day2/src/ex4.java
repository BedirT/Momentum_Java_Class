
public class ex4 {

	public static void main(String[] args) {
		double a = 1.2;
		double b = 10.5;		
		
		// Display numbers obtained from a, b
		System.out.println(a+b); // 11.7
		System.out.println(b-a); // 9.3
		System.out.println(a-b); // -9.3
		System.out.println(b*a); // 12.6
		System.out.println(a/b); // 0.11429
		System.out.println(b/a); // 8.75
		
		// Why use functions ?
		// (write the function foo)
		System.out.println(foo(a, b));
		
	}
	
	public static double foo(double a, double b){
		double ret = a*a * b - a - b - 2017;
		return ret;
	}

}
