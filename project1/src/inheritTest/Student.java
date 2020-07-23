package inheritTest;

public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Student(String name,String address,String p,int y,double f) {
		super(name,address);
		setProgram(p);
		setYear(y);
		setFee(f);
	}
	public void showInfo() {
		System.out.println("Student Information");
		System.out.println("Student Name : "+super.getName());
		System.out.println("Address : "+super.getAddress());
		System.out.println("Program : "+program);
		System.out.println("Year : "+year);
		System.out.println("Fee :" +fee);

	}
}
