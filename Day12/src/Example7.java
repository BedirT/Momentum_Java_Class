
public class Example7 {

	public static int[] findMiddle(int[] A) {

		int n = A.length;
		if(A.length % 2 == 1){
			int[] B = {A[n/2-1], A[n/2], A[n/2+1]};
			return B;
		}else {
			int[] B = {A[n/2-1], A[n/2]};
			return B;
		}

	}

	public static void printArray(int[] B) {

		for (int k = 0; k < B.length; k++)

			System.out.print(B[k] + " ");

		System.out.println();

	}

	public static void main(String[] args) {

		int[] A1 = { 1, 2, 3, 4, 5 };

		printArray(findMiddle(A1)); // output: 2 3 4

		int[] A2 = { 1, 2, 3, 4, 5, 6 };

		printArray(findMiddle(A2)); // output: 3 4

	}

}
