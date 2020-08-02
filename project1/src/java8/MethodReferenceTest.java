package java8;
import java.util.*;
public class MethodReferenceTest {

	public static void main(String[] args) {
		List names = new ArrayList();
		
		names.add("Min Ko Ko");
		names.add("Ko Ko");
		names.add("Min Ko");
		names.add("Aung Myo Thu");
		names.add("Min Min");

		names.forEach(System.out::println);
	}

}
