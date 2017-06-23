
public class Approximate {

	public static void main(String[] args) {
		
		// get closer to sqrt(a) where a is not a square.
		// will give 2 digit accuracy... since I used 100
		double n = 3;
		int fr; 
		for(fr = 0; ((double)fr/100)*((double)fr/100) < n; fr++){}
		System.out.println((double)(fr-1)/100);
		
		
		// Simpler version
	}

}
