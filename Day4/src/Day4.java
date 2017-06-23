
public class Day4 {

	public static void main(String[] args) {
		
		// How to use if-else statements & switch statement
		// usage of if-else if-else
		// 			-> if(condition){do this;}
		// 			-> else if(condition){do this;}
		// 			-> else {do this;}
		// usage of switch
		//			-> switch(variable to check){
		//			->		case -what to check-: do this; break;
		//			-> 		default: do this;
		// 			-> }
		int a = 3;
		if(a == 3){
			System.out.println(a);
		}
		else if(a > 3){
			System.out.println("a is greater than 3");
		}
		else{
			System.out.println("a is smaller than 3");
		}
		
		switch(a){
			case 3:
				System.out.println(a);
				break;
			case 4:
				System.out.println("a is 4");
				break;
			default:
				System.out.println("a is not 3 or 4");
		}
	}

}
