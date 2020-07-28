package bank;

import java.util.Scanner;

public class Calculator{
	Account a =new Account();
	/*
	 * public double balance;
	 * 
	 * public double getBalance() { return balance; }
	 * 
	 * public void setBalance(double balance) { this.balance = balance; }
	 * 
	 * public Calculator(int id, String name,double balance) { super(id, name);
	 * setBalance(balance); }
	 */
	
	/*
	 * public void Credit(double amt) { if(balance==0.0) { balance+=amt;
	 * System.out.println("Credit Balance:"+balance); } }
	 */

	/*
	 * public void Debit(double debit) { if(debit<=balance) { balance-=debit;
	 * System.out.println("Main Balance : "+balance);
	 * System.out.println("Depit money : "+debit); }else {
	 * System.out.println("Debit is exceed over main balance."); } }
	 */
	/*
	 * public void transferAnother(Account a,double debit) { if(debit<=balance) {
	 * balance-=debit; a.Credit(balance); System.out.print(this.balance); }else {
	 * System.out.println("Failed to transfer check your main balance."); }
	 * System.out.println("Success to transfer:"+balance); }
	 */
	public String toString() {
		return "Account {id:"+a.getName()+",name:"+a.getName()+",balance: "+a.getBalance();
	}
	public void show() {
		Account a =new Account();
		System.out.println("Id: "+a.getId());
		System.out.println("Name : "+a.getName());
		System.out.println("Balance :"+a.getBalance());

	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Calculator c= new Calculator();
		
		System.out.print("Enter the account1 name:");
		String name1 = scan.nextLine();
		
		System.out.print("Enter the acount1 id:");
		int id1 =scan.nextInt();
		
		
		System.out.print("Enter the account1 amount:");
		double amount1 = scan.nextDouble();
		
		System.out.print("Enter the account2 name:");
		String name2 = scan.nextLine();
		
		System.out.print("Enter the acount2 id:");
		int id2 =scan.nextInt();
		
		System.out.print("Enter the account2 amount:");
		double amount2 = scan.nextDouble();
		
		System.out.print("Transfer Amount:");
		double transfer=scan.nextDouble();
		
		System.out.println("Before Transfer");
		Account one=new Account(id1,name1,amount1);
		one.show();
		System.out.println();
		Account two=new Account(id2,name2,amount2);
		two.show();
		System.out.println("Transfer Money: "+transfer);
		System.out.println();
		System.out.println("After Successful Transfer");
		one.transferAnother(two,transfer);
		System.out.println();
		one.show();
		System.out.println();
		two.show();
		System.out.println();	
	}

}
