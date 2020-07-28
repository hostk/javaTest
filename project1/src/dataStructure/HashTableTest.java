package dataStructure;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {

		Hashtable<String,Double> hash = new Hashtable<String,Double>();
		
		Enumeration names;
		
		String str;
		
		double bal;
		
		hash.put("Min Ko Ko", 3.12);
		hash.put("Min Ko", 33.23);
		hash.put("Min Ko Ko", 5.12);
		hash.put("Min Ko Ko", 7.12);

		names = hash.keys();
		
		while(names.hasMoreElements()){
			str = (String) names.nextElement();
			System.out.println(str+" : "+ hash.get(str));
		}
		System.out.println();
		
		bal =  ((Double) hash.get("Min Ko")).doubleValue();
		
		hash.put("Min Ko Ko",bal+100);
		System.out.println("Mi Ko Ko's balance: "+hash.get("Min Ko Ko"));

		
		
		
		
	}

}
