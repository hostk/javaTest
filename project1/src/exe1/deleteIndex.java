package exe1;

import java.util.Scanner;

public class deleteIndex {

	public static void main(String[] args) {

		System.out.print("Enter the text:");
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter the index:");
		Scanner scan2=new Scanner(System.in);
		
		String text=scan.nextLine();
		
		int num=Integer.parseInt(scan2.nextLine());
		
		System.out.println(text);
	
		System.out.println(text.substring(0,num-1)+text.substring(num));
		
		
	}

}
