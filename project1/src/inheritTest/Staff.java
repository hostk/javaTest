package inheritTest;

public class Staff extends Person{
	private String schoolName;
	private double pay;
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public Staff(String name2, String address2,String sname,double pay) {
		super(name2, address2);
		setSchoolName(sname);
		setPay(pay);
	}
	public void showInfo() {
		System.out.println("Staff Information");
		System.out.println("Staff Name : "+super.getName());
		System.out.println("Address : "+super.getAddress());
		System.out.println("School Name : "+schoolName);
		System.out.println("Pay : "+pay);

	}
	
}

