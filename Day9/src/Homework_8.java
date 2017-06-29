import java.util.Scanner;

public class Homework_8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to convert: ");
		int n = scan.nextInt();
		System.out.print("Enter the base to convert: ");
		int k = scan.nextInt();
		scan.close();
		
		String base = "";
		while(n > 0){
			int val = n % k;
			if(val > 9){
				if(n == 10) base = 'A' + base;
				else if(n == 11) base = 'B' + base;
				else if(n == 12) base = 'C' + base;
				else if(n == 13) base = 'D' + base;
				else if(n == 14) base = 'E' + base;
				else base = 'F' + base;
			}else{
				base = val + base;
			}
			n /= k;
		}
		System.out.println(base);

	}

}
