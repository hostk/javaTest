package collection;
import java.util.*;

import collection.Studentdd;
public class MapTest {

	public static void main(String[] args) {
		Studentdd std1=new Studentdd("Min Ko Ko","09969237161");
		Studentdd std2=new Studentdd("Ko Ko","0978998989");
		Map<String,Studentdd> stud= new HashMap<String,Studentdd>();
		 
		stud.put("5cs-178",std1);
		stud.put("5c1-181", std2);
		
		
		for(String key : stud.keySet()) {
			System.out.println(key+"\t"+stud.get(key).name+"\t"+stud.get(key).getPhone());
			if(stud.get(key).name=="Min Ko Ko") {
				System.out.println("Found the specified key and values.\t"+stud.get(key).name+"\t"+stud.get(key).getPhone());
				break;
			}
		}
		
		
	}

}
