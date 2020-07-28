package collection;

public class Studentdd {
	private String name;
	private String phone;
	private String city;
	private String rollNo;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Studentdd(String name, String phone,String rollNo,String city) {
		super();
		this.name = name;
		this.city=city;
		this.rollNo=rollNo;
		this.phone = phone;
		
	}
	public Studentdd() {
		// TODO Auto-generated constructor stub
	}
	

}
