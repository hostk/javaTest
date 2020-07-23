package oop;

class Animal{
	public void move() {
		System.out.println("Animals can move.");
	}
	/*public void bark() {
		
	}*/
}
class Dog extends Animal{
	public void move() {
		System.out.println("Dogs can walk and run.");
	}
	public void bark() {
		System.out.println("Dogs can barke.");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		
		Animal a= new Animal();
		Animal b=new Dog();
		
		
		
		a.move();
		b.move();
	//	b.bark(); //error because no have bark method in super class as Animal.
		
	}

}
