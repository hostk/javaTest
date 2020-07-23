package oop;

public class EmployeePoly {
	private String name;
	private String address;
	private int number;
	public EmployeePoly(String n,String add,int num) {
		this.name=n;
		this.address=add;
		this.number=num;
	}
	public void mailCheck() {
		System.out.println("Mail a check to "+this.name+" "+this.address);
	}
	public String toString() {
		return this.name+" "+this.address+" "+this.number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
