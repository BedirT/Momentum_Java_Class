
public class LastQ {

	public static void main(String[] args) {
		
		// (a)
		// Write a Java program to display all the square numbers between 1 and 1000.
		for(int i = 1; i <= 10000; i++){
			if(Math.sqrt(i) == (int)Math.sqrt(i)){
				System.out.println(i);
			}
		}
		
		// (b)
		// Write a Java program to display the sum of the digits of each of the square numbers from part (a).
		for(int i = 1; i <= 10000; i++){
			if(Math.sqrt(i) == (int)Math.sqrt(i)){
				// Sum of the digits:
				int sum = i%10 + (i%100)/10 + (i%1000)/100 + (i%10000)/1000 + (i%100000)/10000;
				System.out.println(i + "\t" + sum);
			}
		}
		
		// (c)
		// What if the upper bound is increased to 1,000,000?
		// We would just change the loop upper bound...
		for(int i = 1; i <= 1000000; i++){ // here
			if(Math.sqrt(i) == (int)Math.sqrt(i)){
				System.out.println(i);
			}
		}
	}

}
