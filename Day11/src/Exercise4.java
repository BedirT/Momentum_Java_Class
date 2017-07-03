
public class Exercise4 {

	public static void main(String[] args) {

		CircleClassFromDay9 circle = new CircleClassFromDay9();
		int r = 3;
		int x = 2, y = 2;
		
		circle.setCenter(x, y);
		circle.setRadius(r);
		
		for(int i = x-r; i < x+r; i++){
			for(int j = y-r; j < y+r; j++){
				if(circle.isInside(i, j)){
					System.out.println("x: " + i + " | y: " + j);
				}
			}
		}
	}

}
