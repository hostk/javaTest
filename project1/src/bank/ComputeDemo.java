package bank;

import java.util.Scanner;

public class ComputeDemo {

	public static void main(String[] args) {	
		
		
		Account one=new Calculator(1,"Min Ko Ko",300.0);
		Account two=new Calculator(2,"Ko Ko",100.0);
		
		one.transferAnother(two,100);
		System.out.println(one.balance);
		
		System.out.println(two.balance);
		
		
		
		System.out.println("Compute Balance");
		
		
		
	}

}
