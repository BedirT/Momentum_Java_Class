import java.util.ArrayList;

public class Exercise4 {

	public static void main(String[] args) {
		
		// Remove negative elements
		
		ArrayList<Integer> ray = new ArrayList<Integer>();
		ray.add(1);
		ray.add(-2);
		ray.add(-3);
		ray.add(4);
		ray.add(0);
		
		/* remove the negative numbers */

		for(int i = 0; i < ray.size(); i++){
			if(ray.get(i) < 0){
				ray.remove(i);
				i--;
			}
		}
		
		System.out.println(ray);

	}

}
