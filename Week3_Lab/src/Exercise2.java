//import java.util.Random;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer (> 1): ");
		int n = sc.nextInt();
		sc.close();
//		Random rand = new Random();
		int[] ar = new int[n+1]; 
		
		for(int i = 0; i < 1000; i++){
			int rndNum = (int) (Math.random() * 100) % n + 1;
//			int rndNum = rand.nextInt(n) + 1;
			ar[rndNum]++;
		}
		
		System.out.println("Value\tFrequency");
		for(int i = 1 ; i <= n; i++){
			System.out.println(i + ":\t" + ar[i]);
		}
		
		
	}

}
