package bank;

public class Calculator{
	
	public double balance;
	public Calculator(double bal) {
		setBalance(bal);
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance>=0.0) {
		this.balance = balance;
		}
	}
	
	public void Credit() {
		balance+=balance;
		System.out.println("Credit Balance:"+balance);
	}
	public void Debit(double debit) {
		balance-=debit;
		System.out.println("Debit Balance:"+balance);
	}

}
