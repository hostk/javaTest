package bank;

public class Calculator extends Account{
	public double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Calculator(int id, String name,double balance) {
		super(id, name);
		this.balance=balance;
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
	public void transferAnother(Account a,double debit) {
		if(debit<=balance) {
			balance-=debit;
				a.Credit();
		}else {
			System.out.println("Failed to transfer check your main balance.");
		}
		System.out.println("Success to transfer:"+balance);
	}
	public String toString() {
		return "Account {id:"+super.getId()+",name:"+super.getName()+",balance: "+balance;
	}
	public void show() {
		System.out.println("Id: "+super.getId());
		System.out.println("Name : "+super.getName());
		System.out.println("Balance :"+balance);

	}

}
