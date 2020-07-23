package bank;

public class Account1 extends Account{
	
	private double balance=0.0;
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance>0.0) {
		this.balance += balance;
		System.out.println("SetBalance : "+balance);
		}
	}

	public Account1(int id, String name, double balance) {
		super(id, name);
		setBalance(balance);
	}
	
}
