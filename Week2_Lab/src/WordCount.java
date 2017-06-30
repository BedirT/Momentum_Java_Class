import java.io.File;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(new File("input.txt"));
		sc.close();

		int wordCount = 0, lineCount = 0;
		
		while(sc.hasNext()){
			String line = sc.nextLine();
			lineCount++;
			
			while(true){
				int id = line.indexOf(' ');
				if(id > 0){
					line.substring(id).trim();
					wordCount++;
				}else{
					break;
				}
			}
		}
		
		System.out.println("Word count: " + wordCount + "\nLine Count: " + lineCount);
		
	}

}
