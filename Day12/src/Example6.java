
public class Example6 {

	public static void main(String[] args) {
		
		int[][] ar = new int[10][10];
		int n = ar.length;
		int m = ar[0].length;
		
		for(int i = 1; i < n; i++){
			for(int j = 1; j < m; j++){
				ar[i][j] = i*j;
			}
		}
		
		int[] Sums = new int[10];
		for(int i = 1; i < n; i++)
			for(int j = 1; j < m; j++)
				Sums[i] += ar[i][j];
				
		
		for(int i = 1; i < n; i++){
			for(int j = 1; j < m; j++)
				System.out.printf("%4d", ar[i][j]);
			System.out.println("  " + Sums[i]);
		}
		for(int i = 1; i < n; i++)
			System.out.printf("%4d", Sums[i]);
		
	}

}
