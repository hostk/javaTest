package bank;

public class Calculator extends Account{
	public double balance=super.getBalance();
	
	public Calculator(int id, String name,double balance) {
		super(id, name,balance);
		super.setBalance(balance);
	}
	
	public double Credit() {
		balance+=balance;
		System.out.println("Credit Balance:"+balance);
		return balance;
	}
	public void Debit(double debit) {
		if(debit<=balance) {
		balance-=debit;
		System.out.println("Main Balance : "+balance);
		System.out.println("Depit money : "+debit);
		}else {
			System.out.println("Debit is exceed over main balance.");
		}
	}
	public double transferAnother(Account a,double debit) {
		if(debit<=balance) {
			balance-=debit;
				a.Credit();
		}else {
			System.out.println("Failed to transfer check your main balance.");
		}
		return balance;
	}
	public String toString() {
		return "Account {id:"+super.getId()+",name:"+super.getName()+",balance: "+balance;
	}

}
