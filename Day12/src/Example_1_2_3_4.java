
public class Example_1_2_3_4 {

	public static void main(String[] args) {

		
		int[] nums = new int[6];
		System.out.println(nums[0]);

		int[] nums2 = { 2017, 7, 5, 9, 30 };

		for (int i = 0; i < nums2.length; i++)
			System.out.printf("%02d\n", nums2[i]);

		// Exercise3
		double[] A = { 1.2, 3.4, 0, 5.2, 5.3 };
		for (int i = 0; i < A.length; i++)
			System.out.println(A[i]);

		// Exercise4
		int[][] nums4 = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(nums4[i][j] + " ");
			}
			System.out.println();
		}
	}

}
