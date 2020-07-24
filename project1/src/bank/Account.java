package bank;

public class Account {
	private int id;
	private String name;
	public double balance;
	
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
	public void transferAnother(Account a, double i) {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
