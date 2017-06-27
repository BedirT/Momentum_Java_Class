import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// Read a complete name (first name and last name separated by a space) from keyboard. Print
		// the first and last names explicitly. For example, “John Smith” will produce the output:

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your name and lastname: ");
		String str1 = scan.nextLine();
		
		scan.close();
		
		String str2 = str1.substring(str1.indexOf(' ')+1).trim();
		str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1,str1.indexOf(' ')+1).toLowerCase();
		
		System.out.println("First Name: " + str1);
		System.out.println("Last Name: " +  str2.substring(0, 1).toUpperCase() + str2.substring(1).toLowerCase().trim());
	}

}
