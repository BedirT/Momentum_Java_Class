
public class Exercise2 {

	public static void main(String[] args) {

		int stop = 5;

		for (int r = 1; r <= stop; r++) { // rows
			for (int c = 1; c <= r; c++) { // columns
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
