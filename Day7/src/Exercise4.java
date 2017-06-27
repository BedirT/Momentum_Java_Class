import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		// Given a string (at least two characters long), check if the first two chars are the same as the
		// last two chars. For example, “edited” produces true while “editing” produces false.

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		scan.close();
		
		if(str1.substring(0, 2).equals(str1.substring(str1.length()-2))){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
	}

}
