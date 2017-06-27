import java.util.Scanner;

public class Homework_6 {

	public static void main(String[] args) {
		// Read a string from keyboard and perform the translation (encryption)
		// then print the new string
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type your message to encrypt:");
		String str = scan.nextLine();
		scan.close();
		
		String encrypted = "";
		for(int i = 0; i < str.length(); i++){
			switch(str.charAt(i)){
				case 'a':
					encrypted += "e";
					break;
				case 'e':
					encrypted += "i";
					break;
				case 'i':
					encrypted += "o";
					break;
				case 'o':
					encrypted += "u";
					break;
				case 'u':
					encrypted += "a";
					break;
				case 'A':
					encrypted += "E";
					break;
				case 'E':
					encrypted += "I";
					break;
				case 'I':
					encrypted += "O";
					break;
				case 'O':
					encrypted += "U";
					break;
				case 'U':
					encrypted += "A";
					break;
				default:
					encrypted += str.charAt(i);
			}
		}
		System.out.println(encrypted);
		

	}

}
