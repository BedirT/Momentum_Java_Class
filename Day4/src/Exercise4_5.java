
public class Exercise4_5 {

	public static void main(String[] args) {
		// Ex4
		int temparature = 109;
		if (temparature < 100) {
			System.out.println("temparature < 100");
		} else {
			System.out.println("temparature >= 100");
		}
		// Ex5
		char letter = 'c';
		int ascii = 0;
		if (letter == 'A') {
			ascii = 65;
		}
		else if (letter == 'B') {
			ascii = 66;
		}
		else if (letter == 'C') {
			ascii = 67;
		}
		else if (letter == 'D') {
			ascii = 68;
		}
		else
			ascii = 69;
		System.out.println(ascii);
	}

}
