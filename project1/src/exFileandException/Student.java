package exFileandException;

import java.io.File;

public class Student {
	private String name;
	private String rollNo;
	private String phoneNo;
	private String city;
	public Student(String name, String rollNo, String phoneNo, String city) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.phoneNo = phoneNo;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(File f) {
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String toString(){ 
		 return "Name = "+name
	  +" ; rollNo = "+rollNo+" ; Phone No = "+phoneNo
	  +" ; City = "+city+";\n"; 
	
	 } 
	
	
}
