package collection;
import java.util.*;
import collection.Studentdd;;
public class ExCollection {

	public static void main(String[] args) {
		Map<Integer,Studentdd> studMap = new HashMap<Integer,Studentdd>();
		
		studMap.put(1,new Studentdd("Min Ko","0997043222","5cs-178","Sagaing"));
		studMap.put(2,new Studentdd("Aung Myo Thu","0997043222","5cs-178","Mandalay"));
		studMap.put(3,new Studentdd("Min Lay","0997043222","5cs-178","Yae Oo"));
		studMap.put(4,new Studentdd("Aung Thant Myo","0997043222","5cs-178","Monywa"));
		studMap.put(5,new Studentdd("Zin Zin Mg","0997043222","5cs-178","Monywa"));
		studMap.put(6,new Studentdd("Khant Zaw Latt","0997043222","5cs-178","Nyi Pyi Taw"));

		Scanner scan = new Scanner(System.in);
		int key = scan.nextInt();
		
		for(int kk:studMap.keySet()) {
			if(kk==key) {
				System.out.println("Key :"+kk);
				System.out.println("Name : "+studMap.get(kk).getName());
				System.out.println("Phone : "+studMap.get(kk).getPhone());
				System.out.println("Roll No : "+studMap.get(kk).getRollNo());
				System.out.println("City : "+studMap.get(kk).getCity());
			}
		}
	}

}
