import java.util.Scanner;

public class binaryToDecimal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		
		int dec = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '1')
				dec += Math.pow(2, (str.length()-i-1));
		}
		System.out.println(dec);

	}

}
