package generics;

public class Maximum {

	public static <T> void printArray(T[] inputArray) {
		for(T element : inputArray) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	public static <E extends Comparable<E>> E maximum(E x,E y,E z) { 
		E max = x;
		if(y.compareTo(max) >0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		if(x.compareTo(max)>0) {
			max = x;
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4,5};
		
		Double[] doubleArray = {1.9,2.4,5.3,5.6};
		
		Character[] charArray= {'H','E','L','L','O'};
		
		System.out.println("Array integerArray contains:");
		printArray(intArray);
		
		System.out.println("Array doubleArray contains:");
		printArray(doubleArray);
		
		System.out.println("Array charArray contains:");
		printArray(charArray);
		
		System.out.printf("Max of %d,%d and %d is %d\n\n",3,4,5,maximum(3,4,5));
		
		System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",4.3,2.2,5.5,maximum(4.3,2.2,5.5));

		System.out.printf("Max of %s,%s and %s is %s\n\n","apple","orange","pear",maximum("apple","orange","pear"));

	
	
	}

}
