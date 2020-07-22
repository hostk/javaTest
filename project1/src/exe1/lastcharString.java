package exe1;

import java.io.Reader;
import java.util.Scanner;

public class lastcharString {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the text:");
		
		String s1=scan.nextLine();
		
		System.out.println(s1);
		
		int num=s1.length()-1;
		char add=(s1.charAt(num));
		System.out.println(add+s1+add);
		
	}

}
