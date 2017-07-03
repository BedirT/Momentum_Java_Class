import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please write the input: ");
		int n = scan.nextInt();
		scan.close();
		
		for(int i = 2; i <= n; i++){
			for(int j = 1; j <= i; j++){
				for(int k = 0; k <= j; k++){
					if(i*i == 2*j*j + k*k ){
						System.out.println("c: " + i + " | b: " + k + " | a: " + j);
					}
				}
			}
		}
		
	}

}
