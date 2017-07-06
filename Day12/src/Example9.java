import java.util.Scanner;

public class Example9 {
	
	public static int[] factors(int x){
		int[] f = new int[x];
		int it = 0;
		for(int i = 1; i <= x/2; i++){
			if(x % i == 0){
				f[it] = i;
				it++;
			}
		}
		return f;
	}
	
	public static boolean isPerfect(int x){
		int[] ar = factors(x);
		int sum = 0;
		for(int i = 0; i < ar.length; i++){
			sum += ar[i];
		}
		if(sum == x) return true;
		return false;
	}
	
	public static void main(String[] args) {
		// A perfect number is a natural number whose positive factors (not including itself) add up to
		// itself. Read an integer n > 1, show all the perfect numbers between 1 and n.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i < n; i++){
			if(isPerfect(i)){
				System.out.printf("%d is perfect\n", i);
			}
		}
	}

}
