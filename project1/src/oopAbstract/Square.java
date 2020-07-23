package oopAbstract;

public class Square extends Shape {
	private double side =2.3;
	private double result=0.0;
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public Square(double side, double result) {
		super();
		this.side = side;
		this.result = result;
	}
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Square(String color, Boolean filled,double side) {
		super(color, filled);
		// TODO Auto-generated constructor stub
		setSide(side);
	}
	@Override
	double getArea() {
		result = 4*side;
		return result;
	}
	@Override
	double getPerimeter() {
		result = side*side;
		return result;
	}
	
	
}
