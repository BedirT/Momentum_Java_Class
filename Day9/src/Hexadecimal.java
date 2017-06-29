import java.util.Scanner;

public class Hexadecimal {

	public static void main(String[] args) {

		// Convert given value to hexadecimal(16) base
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		String hexa = "";
		while(n > 0){
			int val = n % 16;
			if(val > 9){
				if(n == 10) hexa = 'A' + hexa;
				else if(n == 11) hexa = 'B' + hexa;
				else if(n == 12) hexa = 'C' + hexa;
				else if(n == 13) hexa = 'D' + hexa;
				else if(n == 14) hexa = 'E' + hexa;
				else hexa = 'F' + hexa;
			}else{
				hexa = val + hexa;
			}
			n /= 16;
		}
		System.out.println(hexa);

	}

}
