package exe1;

import java.util.Scanner;

public class AddThreeChar {

	public static void main(String[] args) {

		System.out.print("Enter the text:");
		Scanner scan = new Scanner(System.in);
		
		String text= scan.nextLine();
		if(text.length()>3) {
			
		String text2=text.substring(0,3);
		
		String output=text2+text+text2;
		System.out.println(output);
		}else {
			String text2=text.substring(0,text.length());
			String output=text2+text+text2;
			System.out.println(output);
		}
		
	}

}
