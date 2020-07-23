package inheritTest;

public class Person {
	private String name;
	private String address;
	public Person(String name2, String address2) {
		this.name=name2;
		this.address=address2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return this.name+" "+this.address;
	}
	public void showInfo() {
		// TODO Auto-generated method stub
		
	}
}
