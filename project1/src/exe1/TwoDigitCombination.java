package exe1;

import java.util.Scanner;

public class TwoDigitCombination {

	public static void main(String[] args) {
		System.out.println("Enter the first digit:");
		Scanner d1=new Scanner(System.in);
		
		System.out.println("Enter the second digit:");
		Scanner d2 = new Scanner(System.in);
		
		int num1=Integer.parseInt(d1.nextLine());
		
		int num2=Integer.parseInt(d2.nextLine());
		
		if(num1 != 0 && num2 !=0) {
			int i,j;
			for(i=1;i<=num2;i++) {
					System.out.println("\t"+num1+"\t * \t"+i+"\t=\t"+num1*i);
			}
		}
		
	}

}
