import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		// Given two strings, return their concatenation, but the first characters are dropped. For
		// example, “Hello” and “World” will produce “elloorld”.

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		scan.close();
		
		System.out.println(str1.substring(1) + str2.substring(1));
		
	}

}
