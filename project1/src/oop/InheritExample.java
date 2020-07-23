package oop;

class Calculation {
	int z;
	public void Addition(int x,int y) {
		z=x+y;
		System.out.println("Sum: "+y);
	}
	public void Subtraction(int x,int y) {
		z=x-y;
		System.out.println("Subtraction: "+z);
	}
}

public class InheritExample extends Calculation {

	public void Multipulation(int x,int y) {
		z=x*y;
		System.out.println("Multipulation: "+z);
	}
	public static void main(String[] args) {
		
		InheritExample ex=new InheritExample();
		ex.Multipulation(2, 4);
		ex.Addition(20, 80);
		ex.Subtraction(40, 4);

		
	}

}
