import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// convert 10th base to binary(2)
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		String str = "";
		while(n > 0){
			str = n % 2 + str;
			n /= 2;
		}
		System.out.println(str);

	}

}
