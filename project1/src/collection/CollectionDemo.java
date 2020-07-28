package collection;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("Min Ko Ko");
		list.add("Ko Ko");
		list.add("Min Ko");
		
		System.out.println("Array List Elements:");
		
		System.out.println("\t"+list);
		
		List link =new LinkedList();
		link.add("Min Ko Ko");
		link.add("Ko Ko");
		link.add("Min Min");
		System.out.println("Linked List Elements:");
		
		System.out.println("\t"+link);
		
		Set s1 =new HashSet();
		s1.add("Min Ko Ko");
		s1.add("Ko Ko");
		s1.add("Min Min");
		
		System.out.println("Set Elements:");
		
		System.out.println("\t"+s1);
		
		
		Map m1 =new HashMap();
		m1.put("Min Ko Ko", "12");
		m1.put("Ko Ko","22");
		m1.put("Min Min","32");
		System.out.println();
		System.out.println(" Map Elements ");
		System.out.println("\t"+m1);
		
		
	}

}
