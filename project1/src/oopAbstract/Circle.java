package oopAbstract;

public class Circle extends Shape{
	private double radius=1.0;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius,String color,Boolean b) {
		super(color,b);
		this.radius=radius;
	}
	
	
	@Override
	double getArea() {
		System.out.print("Circle Area: ");
		radius=3.142*radius*radius;
		return radius;
	}
	@Override
	double getPerimeter() {
		System.out.print("Circle Perimeter: ");
		radius=2*3.142*radius;
		return radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
		
		
	}
	
}
