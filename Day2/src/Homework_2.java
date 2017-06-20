
public class Homework_2 {

	public static double computeDistance(double x1, double y1, double x2, double y2){
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
	
	public static double computeTriangleArea(double x1, double y1, double x2, 
			double y2, double x3, double y3){
		return 0.5 * Math.abs(x1*y2+x2*y3+x3*y1 - (y1*x2+y2*x3+y3*x1)); 
	}
	
	public static void main(String[] args) {
		double x1 = 3.5;
		double y1 = 2.8;
		double x2 = -3.5;
		double y2 = -2.8;
		double x3 = 2.1;
		double y3 = -3.9;
		
		System.out.println("Distance between point 1 and point 3 is: " + computeDistance(x1,y1,x3,y3));
		System.out.println("Distance between point 2 and point 3 is: " + computeDistance(x3,y3,x2,y2));
		System.out.println("Distance between point 1 and point 2 is: " + computeDistance(x1,y1,x2,y2));
		System.out.println("Area of the triangle produced from these point is: " + computeTriangleArea(x1, y1, x2, y2, x3, y3));
	}

}
