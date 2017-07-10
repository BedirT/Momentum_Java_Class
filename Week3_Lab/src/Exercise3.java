import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime(); 
		System.out.println("This will take a while please wait...");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the bound: ");
//		int n = sc.nextInt();
//		sc.close();
		int n = 2000000000;
		SieveOfEratosthenes(n);
		long estimatedTime = System.nanoTime() - startTime;
		double seconds = (double)estimatedTime / 1000000000.0;
		System.out.println("Elapsed time: " + seconds);
		
	}

	public static void SieveOfEratosthenes(int n)
	{
	    // Create a boolean array "prime[0..n]" and initialize
	    // all entries it as true. A value in prime[i] will
	    // finally be false if i is Not a prime, else true.
		
	    boolean prime[] = new boolean[n+1];
	    for(int i = 0; i < n+1; i++){prime[i] = true;}
	 
	    int ct = 1;
//	    System.out.println("position\tprime");
	    
	    for (int p = 2; p*p<=n; p++)
	    {
	        // If prime[p] is not changed, then it is a prime
	        if (prime[p])
	        {
	            // Update all multiples of p
	            for (int i=p*2; i<=n; i += p)
	                prime[i] = false;
	        }
	    }
	    for(int i = 0; i <= n; i++){
	    	if(prime[i]) System.out.println((ct++) + ":\t" + i);
	    }
	}
	
}
