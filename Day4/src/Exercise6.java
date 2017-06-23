
public class Exercise6 {

	public static void main(String[] args) {
		// Given an integer score (1~100) and calculate its letter grade.
		int score = 96;
		if (score >= 90) {
			System.out.println("You got an A");
		}
		else if (score >= 80) {
			System.out.println("You got a B");
		}
		else if (score >= 70) {
			System.out.println("You got a C");
		}
		else if (score >= 60) {
			System.out.println("You got a D");
		}
		else
			System.out.println("You got a F");
	}

}
