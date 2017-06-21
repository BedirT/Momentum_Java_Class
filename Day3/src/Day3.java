/*
 * Comment your programs, so that you will have understanding later on when
 * you look at the code
 */


public class Day3 {

	public static void main(String[] args) {
		
		// How to use loops...
		// For loop
		// for( variable = starting value; the condition to execute ; increment, decrement){
		// 		- operation wanted to compute
		// } 
		for(int i = 0; i < 10; i+=1){
			System.out.println(i);
		}
				
		// Finding max_value of 2's powers that we can reach with int
		for(int i = 1; i < Integer.MAX_VALUE/2; i*=2){
			System.out.println(i);
		}
		// Finding 2^(63)...
		long prod = 1;
		for(int i = 1; i <= 63; i+=1){
			prod *= 2;
			System.out.println(i + ":\t" + prod);
		}
		System.out.println("Max:\t" + Long.MAX_VALUE);
		
	}

}
