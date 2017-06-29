import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int i = 1;
		while(i <= n){
			if(n % i == 0){
				System.out.print(i + " ");
			}
			i++;
		}
	}

}
