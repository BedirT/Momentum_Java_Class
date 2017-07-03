
public class CircleClassFromDay9 {
	
	private int cx, cy; // private variable for center
	private int r; 	// private variable for radius
	private String name;

	public CircleClassFromDay9(){
		r = 0;
		name = "";
	}
	
	public CircleClassFromDay9(int x){
		r = x;
		name = "";
	}
	
	public CircleClassFromDay9(int x, String n){
		r = x;
		name = n;
	}
	
	public CircleClassFromDay9(int r, String n, int x, int y){
		this.r = r;
		name = n;
		cx = x;
		cy = y;
	}
	
	public void setCenter(int x, int y){
		cx = x;
		cy = y;
	}
	
	public void setRadius(int x){
		r = x;
	}
	
	public double getRadius(){
		return r;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPerimeter(){
		return 2*Math.PI*r;
	}
	
	public double getArea(){
		return Math.PI*r*r;
	}
	
	public boolean isInside(int x, int y){
		int dist1 = cx - x;
		int dist2 = cy - y;
		return r >= Math.sqrt(dist1*dist1 + dist2*dist2);
	}

	
	public void speak() {
		System.out.println("I am round");
		System.out.println("You are not");
		System.out.println("My name is " + name + ".");
		System.out.println("My radius is " + r + ".");
		System.out.println("My center is (" + cx + "," + cy + ").");
	}
	
	public void eat() {
		System.out.println("I didn't have breakfast yet.");
		System.out.println("May I borrow some money from Trump ?");
	}

}

