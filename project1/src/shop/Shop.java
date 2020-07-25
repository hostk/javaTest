package shop;

import java.util.Date;
import java.util.Scanner;

public class Shop{
	private Date date = new Date();
	Customer c=new Customer();
	DiscountRate d=new DiscountRate();
	private double serviceExpense;
	private double productExpense;
	
	public Shop(Customer c,Date d,double serviceAmount,double productAmount) {
		this.c=c;
		this.date=d;
		this.serviceExpense=serviceAmount;
		this.productExpense=productAmount;
	}
	
	public double getTotalExpense() {
		double totalExp=0.0;
		if(c.isMember()) {
			totalExp = (serviceExpense+productExpense)-((serviceExpense*d.getServiceDiscountRate(c.getMemberType())+(productExpense*d.getProductDiscountRate(c.getMemberType()))));
		}else {
			totalExp = serviceExpense + productExpense;
		}
		return totalExp;
	}
	public void show() {
		System.out.println(c.toString());
		System.out.println("Service Expense: "+serviceExpense);
		System.out.println("Product Expense : "+productExpense);
		System.out.println("Total Expense : "+getTotalExpense());
		System.out.println("Date : "+date);
		System.out.println();
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		
		Customer customer =new Customer("Min Ko Ko","Sliver");
		Customer cc= new Customer();
		System.out.print("Enter the Customer Name : ");
		cc.setName(scan.nextLine());
		
		System.out.println();
		System.out.print("Enter the member type : ");
		cc.setMemberType(scan.nextLine());
	
		System.out.println();
		System.out.print("Enter the Customer Name : ");
		double service= Double.parseDouble(scan.nextLine());

		System.out.print("Enter the Customer Name : ");
		double product = Double.parseDouble(scan.nextLine());
		Shop shop =new Shop(customer,new Date(),22.00,11.00);
		shop.show();
		System.out.println();
		Shop ss= new Shop(cc,new Date(),service,product);
		
		ss.show();
	}

}
