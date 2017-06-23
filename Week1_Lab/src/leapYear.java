
public class leapYear {

	public static void main(String[] args) {
		// from 1st year to 2017.
		// see if it is a leap year
		// leap year if 
		//	- divisible by 400 
		//	- divisible by 4 and not divisible by 100
		for(int year = 1; year <= 2017; year++){
			if(year % 400 == 0){
				System.out.printf("%d is a leap year.\n", year);
			}
			else if(year % 4 == 0 && year % 100 != 0){
				System.out.printf("%d is a leap year.\n", year);
			}
			else {}
		}
	}

}
