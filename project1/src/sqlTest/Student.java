package sqlTest;

public class Student {
	private String name;
	private String rollNo;
	private String phoneNo;
	public Student(String name, String rollNo, String phoneNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
