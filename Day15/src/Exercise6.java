import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		// Read a list of integers from keyboard and then print the minimum, the maximum, 
		// and the standard deviation of these integers.

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> v = new ArrayList<Integer>();
		
		// System.out.print("Enter the number of integers you want to process: ");
		// int n = sc.nextInt();
		// Make it Dynamic :>
		double tot = 0, sd = 0;
        System.out.print("Enter the next number: ");
		// for(int i = 0; i < n; i++){
		while(sc.hasNext()){
			v.add(sc.nextInt());
            System.out.print("Enter the next number (If you are done please press Ctrl+D or Cmnd+D): ");
			tot += v.get(v.size() - 1);
		}
		int n = v.size();

		tot /= n;
		int mx = -1, mn = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			if(mx < v.get(i)) mx = v.get(i);
			if(mn > v.get(i)) mn = v.get(i);
			sd += (tot - v.get(i)) * (tot - v.get(i));
		}
		
		sd = Math.sqrt(sd/(n-1));
		
		System.out.println("\nThe minimum is: " + mn + "\nThe maximum is: " + mx + "\nThe standard deviation is: " + sd );
		
		sc.close();
		
	}

}
