
public class Homework_3 {

	public static void main(String[] args) {
		
		// (1)
		// Given a double value x > 1, compute y as the following
		// y = 1+(1/(x+1))
		double x = 3.4;
		double y = 1+(1/(x+1));
		System.out.printf("%.4f\n", y);
		
		// (2) 
		for(int i = 0; i < 20; i++){
			y = 1+(1/(y+1));
		}
		System.out.printf("%.4f\n", y);
		
	}

}
