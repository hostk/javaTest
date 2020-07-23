package bank;

import java.util.Scanner;

public class ComputeDemo {

	public static void main(String[] args) {	
		
		
		Account one=new Account1(1,"Min Ko Ko",300.0);
		Account two=new Account2(2,"Ko Ko",100.0);
		
		/*System.out.print("Enter the id:");
		Scanner scan = new Scanner(System.in);
		int id=Integer.parseInt(scan.nextLine());
		System.out.print("Enter the name:");
		String name=scan.nextLine();
		System.out.print("Enter the amount:");
		double amount=scan.nextDouble();*/
		
		System.out.println("Compute Balance");
		for(int i=1;i<3;i++) {
		if(one.getId()==i) {
			one.Credit();
			System.out.println("Credit Balance1:"+one.getBalance());
		}else {
			two.Debit(200.00);
			System.out.println("Credit Balance2:"+two.getBalance());
		}
		}
		
		
	}

}
