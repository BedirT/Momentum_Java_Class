import java.util.Scanner;

public class Exercise4 {

	// This is a bit harder version of the aimed application
	// Simple version of the same purpose would be enough
	// Find if given number is palindromic or not. If not
	// 		just add reversed version to itself and try again. 
	
	public static boolean isPalindromic(String s) {

		for (int i = 0; i < s.length() / 2 + 1; ++i) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}

	public static String addTogether(String s, String rev) {
		String newS = "";
		int rem = 0;
		for(int i = s.length()-1; i >= 0; i--){
			int num = (rem + s.charAt(i) - '0' + rev.charAt(i) - '0');
			newS = num % 10 + newS;
			rem = num / 10;
		}
		if(rem > 0) newS = rem + newS;
//		System.out.println("TOT:\t" + newS + " R: " + rem);
		return newS;
	}
	
	public static String reverse(String s){
		String str = "";
		for(int i = 0 ; i < s.length(); i++){
			str = s.charAt(i) + str;
		}
//		System.out.println("REV:\t" + str);
		return str;
	}

	public static void main(String[] args) {
		// IsPalindromic

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		long ct = 0;
		while (true) {
			System.out.println(ct++ + ":\t" + s);
			String revs = reverse(s);
			if (revs.equals(s)) {
				System.out.println("Done");
				break;
			} else {
				s = addTogether(s, revs);
			}
		}

	}

}
