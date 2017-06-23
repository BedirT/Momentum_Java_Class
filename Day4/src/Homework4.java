
public class Homework4 {

	public static int GCD(int x, int y){
		if(y == 0)
	        return x;
	    else
	        return GCD(y, x%y);
	}
	
	public static void main(String[] args) {
		// (1)
		// How many simplified proper fractions are there having denominator 105?
		int res = 0;
		for(int i = 1; i < 105; i++){
			if(i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
				res++;
			}
		}
		System.out.println("(1): " + res);
		// (2)
		// How many simplified proper fractions are there having denominator no more than 105?
		int res2 = 0;
		for(int i = 1; i < 105; i++){
			for(int j = 1; j < i; j++){
				if(GCD(i, j) == 1){
					res2++;
				}
			}
		}
		System.out.println("(2): " + res2);
		
		
	}

}
