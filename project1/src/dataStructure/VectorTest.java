package dataStructure;
import java.util.*;
public class VectorTest {

	public static void main(String[] args) {

		Vector v = new Vector(3,2);
		
		System.out.println("Vector size: "+v.size());
		System.out.println("Vector capacity: "+v.capacity());
		
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		
		System.out.println("after four Addition Vector capacity: "+v.capacity());

		v.addElement(new Double(4.6));
		v.addElement(new Double(8.9));
		System.out.println("Vector capacity: "+v.capacity());

		System.out.println("First Element:"+v.firstElement());
		System.out.println("Last Element:"+v.lastElement());

		if(v.contains(new Integer(3))) {
			System.out.println("Vector contain 3.");
		}
		Enumeration output =v.elements();
		
		while(output.hasMoreElements()) {
			System.out.print(output.nextElement()+" ");
		}
		
	}

}
