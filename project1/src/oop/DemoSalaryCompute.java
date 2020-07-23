package oop;

public class DemoSalaryCompute {

	public static void main(String[] args) {
		SalaryPoly salary= new SalaryPoly("Min Ko Ko","Sagaing",2,240.00);
		EmployeePoly e=new SalaryPoly("Ko Ko","Mandalay",2,170.00);
		
		System.out.println("Call mailCheck using Salary references --");
		
		salary.mailCheck();
		
		System.out.println("Call mailCheck using Eployee references --");
		e.mailCheck();
	}

}
