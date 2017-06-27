import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		// Read a string from the keyboard, and print out a new string where every char in the original is
		// duplicated.
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		
		for(int i = 0; i < str.length(); i++){
			System.out.print(str.charAt(i) + "" +  str.charAt(i));
		}

	}

}
