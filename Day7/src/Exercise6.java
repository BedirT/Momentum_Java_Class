import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// Read a string and a cutter from keyboard and return the sub-string after the cutter string.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str1 = scan.nextLine();
		
		System.out.print("Enter the cutter: ");
		String str2 = scan.nextLine();
		
		System.out.println(str1.replaceFirst(str2, " "));
		
		scan.close();
		
	}

}
