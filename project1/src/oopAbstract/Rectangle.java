package oopAbstract;

public class Rectangle extends Shape{
	private double width = 1.0;
	private double height = 1.0;
	private double result=0.0;
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
		super();
		}
	public Rectangle(String color, Boolean filled,double w,double h) {
		super(color, filled);
		
		setWidth(w);
		setHeight(h);
	}
	@Override
	double getArea() {
		result = width*height;
		return result;
	}
	@Override
	double getPerimeter() {
		result = (2*width)+(2*height);
		return result;
	}
	
	
}
