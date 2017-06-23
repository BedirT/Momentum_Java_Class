
public class Exercise3 {

	public static void main(String[] args) {
		// Exercise 3: How many numbers are there between 1 and 1000 (inclusive) which 
		// has at least one digit 7. Write a piece of code to perform the calculation.
		int counter = 0;
		for(int i = 1; i <= 1000 ; i++){
			if(i % 10 == 7 || (i/10) % 10 == 7 || (i/100) % 10 == 7){
				counter++;
			}
		}
		System.out.println(counter);
	}

}
