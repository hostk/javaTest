package oop;

public class SalaryPoly extends EmployeePoly{
	private double salary;
	

	public SalaryPoly(String n, String add, int num,double salary) {
		super(n, add, num);
		setSalary(salary);
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>=0.0) {
		this.salary = salary;
		}
	}
	public void mailCheck() {
		System.out.println("Within mailCheck of salary class");
		System.out.println("Mail check to "+getName()+" with salary "+salary);
		
	}
	public double computePay() {
		System.out.println("Computing salary pay for "+getName());
		return salary/52;
	}

}
