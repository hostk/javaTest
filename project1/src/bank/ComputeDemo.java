package bank;

import java.util.Scanner;

public class ComputeDemo {

	public static void main(String[] args) {	
		
		Calculator c= new Calculator(0, null, 0);
		System.out.println("Before Transfer");
		Account one=new Calculator(1,"Min Ko Ko",300.0);
		one.show();
		System.out.println();
		Account two=new Calculator(2,"Ko Ko",100.0);
		two.show();
		
		System.out.println();
		System.out.println("After Successful Transfer");
		one.transferAnother(two,100);
		System.out.println();
		one.show();
		System.out.println();
		two.show();
		System.out.println();				
		
		
	}

}
