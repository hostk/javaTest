package bank;

public class Account {
	private int id;
	private String name;
	public double balance;
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
	public double Credit() {

		return 0.0;
	}
	public void transferAnother(Account two, int i) {
		// TODO Auto-generated method stub
		
	}
	
}
