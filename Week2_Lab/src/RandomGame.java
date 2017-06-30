import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number to compare with the random one: ");
		int x = scan.nextInt();
		int a = rand.nextInt(9) + 1;

		if (x == a) {
			System.out.println("WELL DONE! YOU GOT IT ON THE FIRST TRY!");
		} else {
			System.out.print("Not correct. Try Again! You have "+ 2 +" more chances left. ");
			for (int i = 0; i < 2; i++) {
				x = scan.nextInt();
				if (x == a) {
					System.out.println("WELL DONE! YOU GOT IT!");
					return;
				}
				System.out.print("Not correct. Try Again! You have " + (1 - i) + " chance left. ");
			}
		}

	}

}
