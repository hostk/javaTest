package dataStructure;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) {

		Properties capitals =new Properties();
		
		Set states;
		
		String str;
		
		capitals.put("Name", "Min Ko Ko");
		
		capitals.put("Id","5cs-178");
		
		states = capitals.keySet();
		
		Iterator itr = states.iterator();
		
		while(itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("Capitals of "+str+" is "+capitals.getProperty(str));
		}
		System.out.println();
		
		str = capitals.getProperty("Florida","Not Found");
		System.out.println("The captial of Florida is "+str+".");
	}

}
