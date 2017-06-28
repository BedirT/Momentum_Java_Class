
public class CircleMain {

	public static void main(String[] args) {
		
		Circle A = new Circle();
		System.out.println(A.getRadius());
		// more test cases
		
		Circle jim = new Circle();
		jim.speak();
		jim.eat();
		
		Circle ian = new Circle(2);
		ian.setName("Ian");
		ian.setCenter(3, -1);
		ian.speak();
		ian.eat();
		
		Circle jsp = new Circle(3, "Joseph", 2, 4);
		jsp.speak();
		jsp.eat();
		System.out.println(jsp.getArea());
		System.out.println(jsp.getPerimeter());
		System.out.println(jsp.isInside(3, 4));
		
		
		
	}

}
