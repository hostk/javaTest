package shop;

import java.util.Date;

public class Shop extends Customer {
	private Date date;
	private double serviceExpense;
	private double productExpense;
	public Shop(String name,Date d) {
		super(name);
		this.date=d;
	}
	public double getTotalExpense() {
		return 0.0;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	

}
