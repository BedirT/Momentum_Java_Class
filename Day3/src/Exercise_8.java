
public class Exercise_8 {
	public static void main(String args[]) {
		// (1)
		int remUnit = 1;
		for (int i = 0; i < 2017; i++) {
			remUnit = (3 * remUnit) % 10;
		}
		System.out.println(remUnit);

		// (2)
		int remTenth = 1;
		for (int i = 0; i < 2017; i++) {
			remTenth = (3 * remTenth) % 100;
		}
		System.out.println(remTenth / 10);

		// (3)
		int remHundred = 1;
		for (int i = 0; i < 2017; i++) {
			remHundred = (3 * remHundred) % 1000;
		}
		System.out.println(remHundred / 100);

		// Challenge - 7th term from the end...
		int rem7th = 1;
		for (int i = 0; i < 2017; i++) {
			rem7th = (3 * rem7th) % 10000000;
		}
		System.out.println(rem7th / 10000000);
	}
}
