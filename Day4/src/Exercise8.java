
public class Exercise8 {

	public static void main(String[] args) {
		// Implement a method with input of an integer n, 3 <= n <= 10,
		// that will print the name of the polygons with n sides.
		
		int num = 4;

		switch (num) {
			case 3:
				System.out.println("triangle");
				break;
			case 4:
				System.out.println("quadrilateral");
				break;
			case 5:
				System.out.println("pentagon");
				break;
			case 6:
				System.out.println("hexagon");
				break;
			case 7:
				System.out.println("heptagon");
				break;
			case 8:
				System.out.println("octagon");
				break;
			case 9:
				System.out.println("nonagon");
				break;
			case 10:
				System.out.println("decagon");
				break;
			default:
				System.out.println("Something different");
		}
	}

}
