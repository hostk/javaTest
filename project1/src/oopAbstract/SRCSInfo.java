package oopAbstract;

public class SRCSInfo extends Shape{

	public static void main(String[] args) {
		SRCSInfo info=new SRCSInfo();
		System.out.println("Shape Information:");
		System.out.println("Color : "+info.getColor());
		System.out.println("Filled : "+info.getFilled());
		System.out.println();

		Shape circle =new Circle(4.2,info.getColor(),info.getFilled());
		System.out.println("Circle Information");
		System.out.println("Color : "+info.getColor());
		System.out.println("Filled : "+info.getFilled());
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
		System.out.println();


		Shape rect = new Rectangle(info.getColor(),info.getFilled(),2,2);
		System.out.println("Rectangle Information");
		System.out.println("Color : "+info.getColor());
		System.out.println("Filled : "+info.getFilled());
		System.out.println("Rectangel Area: "+rect.getArea());
		System.out.println("Rectangle Perimeter : "+rect.getPerimeter());
		System.out.println();
		
		Shape square = new Square(info.getColor(),info.getFilled(),6);
		System.out.println("Square Information");
		System.out.println("Color : "+info.getColor());
		System.out.println("Filled : "+info.getFilled());
		System.out.println("Square Area: "+square.getArea());
		System.out.println("Square Perimeter : "+square.getPerimeter());
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
