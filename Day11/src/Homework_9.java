import java.util.Scanner;

public class Homework_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String s = scan.next(); // Getting the input word
		scan.close(); // Closing scanner
		
		int n = s.length(); // Holding the length in n
		System.out.println(s); // printing the word at the top...
		
		
		for (int i = 1; i < n-1; i++) { // Loop will start from 1 go till n-2, since we will print
										// last line and first line outside of the loop...
			if(i < n/2){	// first half of the word is different then the second part
							// that's why we will use if-else to seperate them
				for(int j = 0; j < i; j++) System.out.print(" "); 	// spaces i times, to the beginning. First line will have 
																	// 1, second 2, third 3 until the half of the word size
				System.out.print(s.charAt(i)); // character on the position printed
				for(int j = 0; j < n-2*i-2; j++) System.out.print(" ");
				System.out.println(s.charAt(n-i-1));
			}else if(i == n/2 && n % 2 == 1){ // Special condition for text having odd length
				for(int j = n-i-2; j >= 0; j--) System.out.print(" ");
				System.out.println(s.charAt(n-i-1)); // middle char only once
			}else{
				for(int j = n-i-2; j >= 0; j--) System.out.print(" ");
				System.out.print(s.charAt(n-i-1));
				
				if(n % 2 == 1) for(int j = 2 * (i-(n/2)) - 1; j > 0; j--) System.out.print(" ");
				// this if else is also for odd-even, only difference is initial values in the loops
				else for(int j = 2 * (i-(n/2)); j > 0; j--) System.out.print(" ");
				
				System.out.println(s.charAt(i));
			}
		}
		
		System.out.println(s);
		System.out.println();
		System.out.println(s);
		for (int i = 1; i <= n; i++){
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			System.out.print(s.substring(i));
			System.out.println(s.substring(0, i));
		}
	
	
	}
	
	

}
