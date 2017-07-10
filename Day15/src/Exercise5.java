import java.util.ArrayList;

public class Exercise5 {

	// Implement the method deleteEven that removes the elements with even indices from the
	// original ArrayList.
	
	public static void deleteEven(ArrayList<Integer> A) {

		for(int i = 0; i < A.size(); i++){
			A.remove(i);
		}

	}
	
	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);

		System.out.println(A); // output: [1, 2, 3, 4, 5]

		deleteEven(A);

		System.out.println(A); // output: [2, 4]

	}

}
