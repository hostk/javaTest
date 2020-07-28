package dataStructure;
import java.util.*;
public class BitSetTest {

	public static void main(String[] args) {

		BitSet bits1= new BitSet(16);
		BitSet bits2=new BitSet(10);
		
		for(int i=0;i<16;i++) {
			if((i%2)==0) {
				bits1.set(i);
			}
			if((i%3)!=0) { bits2.set(i);}
		}
		
		System.out.println("Initial pattern in bits:1");
		System.out.println(bits1);
		
		System.out.println("Initial pattern in bits:2");
		System.out.println(bits2);
		
		bits1.and(bits2);
		System.out.println("bits1.and(bits2)");
		System.out.println(bits1);
		
		bits1.andNot(bits2);
		System.out.println(".andNot()");
		System.out.println(bits1);
		
		bits1.or(bits2);
		System.out.println(".or()");
		System.out.println(bits1);
		
		bits1.xor(bits2);
		System.out.println(".xor()");
		System.out.println(bits1);
	}

}
