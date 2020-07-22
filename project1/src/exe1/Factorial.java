package exe1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.print("Enter the number you want to covert to factorial:");
		
		Scanner scan = new Scanner(System.in);
		
		int num =Integer.parseInt(scan.nextLine());
		int output=1;
		if(num!=0) {
			System.out.print("Factorial Numbers:");
			for(int i=1;i<=num;i++) {
				output*=i;
				System.out.print(i+" ");

			}
			System.out.println();
			System.out.println("Factorial is:"+output);
		}

	}

}
