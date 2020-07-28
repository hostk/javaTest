package bank;

public class Account {
	private int id;
	private String name;
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Account(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void Credit(double amt) {
		this.balance+=amt;
	}
	public void transferAnother(Account a, double i) {
		// TODO Auto-generated method stub
		if(balance>=i) {
			this.balance-=i;
			a.Credit(i);
		}
	}
	public void show() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(balance);
		
	}
	
}
