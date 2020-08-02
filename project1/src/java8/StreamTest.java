package java8;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		List<Integer> myList =new ArrayList<>();
		
		for(int i=0;i<100;i++) myList.add(i);
		
		Stream<Integer> singleStream = myList.stream();
		
		Stream<Integer> parallelStream = myList.parallelStream();
		
		Stream<Integer> highNums = parallelStream.filter(p -> p >90);
		
		highNums.forEach(p -> System.out.println("High nums parallel = "+p));
		
		Stream<Integer> highNumsSe = singleStream.filter(p -> p >90);
		
		highNumsSe.forEach(p -> System.out.println("High nums single = "+p));
	}

}
