package exe1;

import java.util.Scanner;

public class laststartexchangeString {

	public static void main(String[] args) {
		System.out.print("Enter the text:");

		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		String s2=s;
		
		System.out.println(s);
		char fnum=s.charAt(0);
		int lnum=s.length()-1;
		char lString=s.charAt(lnum);
		
		String output=s.replace(fnum, lString);
		output=s2.replace(lString,fnum);
		System.out.println(output);

		
	}

}
