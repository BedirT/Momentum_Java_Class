import java.util.Scanner;

public class OctalBase {

	public static void main(String[] args) {
		// convert 10th base to octal(8)

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		String str = "";
		while (n > 0) {
			str = n % 8 + str;
			n /= 8;
		}
		System.out.println(str);

	}

}
