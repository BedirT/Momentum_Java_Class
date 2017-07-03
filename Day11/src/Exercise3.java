
public class Exercise3 {

	public static void main(String[] args) {
		// (1)
		int n = 10;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i + 1; j++) {
				System.out.print("+");
			}
			System.out.println();
		}

		// (2)
		n = 10;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		// (3)
		n = 9;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// (4)
		n = 7;
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < (n - i) * 2; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i * 2; j++) {
				System.out.print("$");
			}
			System.out.println();
		}

		// (5)
		String comp = "COMPUTER";
		n = comp.length();
		String last = "";
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			if(i != 1){
				System.out.print(comp.charAt(i-1));
				last = comp.charAt(i-1) + last;
			}
			for (int j = 1; j < i*2-2; j++) {
				System.out.print(" ");
			}
			System.out.println(comp.charAt(i-1));
			last += comp.charAt(i-1);
		}
		System.out.println(comp.charAt(n-1) + last + comp.charAt(n-1));
		
	}

}
