import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		// Print reversed version of the input string
		String str1;
		Scanner scan = new Scanner(System.in);
		str1 = scan.next();
		scan.close();
		
		String str2 = "";

		for(int i=0; i<str1.length(); i++) {
			str2 = str1.charAt(i) + str2;
		}

		System.out.println(str2);

	}

}
