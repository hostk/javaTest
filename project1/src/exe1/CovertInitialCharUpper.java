package exe1;

import java.util.Scanner;

class StringFormatter{
	public static String capitalizeWord(String str) {
		
		String words[]=str.split("\\s");
		
		String capitalizeWord=" ";
		for(String w:words) {
			String first=w.substring(0,1);
			String afterfirst=w.substring(1);
			capitalizeWord+=first.toUpperCase()+afterfirst+" ";
		}
		
		return capitalizeWord.trim();
	}
}

public class CovertInitialCharUpper {

	public static void main(String[] args) {
		
		StringFormatter format =new StringFormatter();
		
		
		System.out.print("Enter the text:");
		Scanner scan  =new Scanner(System.in);
		
		String text=scan.nextLine();
		
		System.out.print(StringFormatter.capitalizeWord(text));
		
	}

}
