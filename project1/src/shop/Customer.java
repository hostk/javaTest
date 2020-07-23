package shop;

public class Customer {
	private String name;
	private Boolean member =false;
	private String memberType;
	
	public Customer(String name) {
		this.name=name;
	}
	public void isMember() {
		if(member==true) {
			System.out.println("This is a member");
		}
	}
	public String toString() {
		return this.name+" "+this.memberType;
	}
}
