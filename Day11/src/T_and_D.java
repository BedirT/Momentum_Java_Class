import java.util.Scanner;

public class T_and_D {

	public static void main(String[] args) {
		// How do you implement the algorithm to find all the positive
		// factors of an integer using nested loops?
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= n; i++){
			if(n/i == (double)n/i) System.out.print(i + " ");
		}

	}

}
