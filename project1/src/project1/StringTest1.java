package project1;

public class StringTest1 {

	public static void main(String[] args) {
		
		//concat
		String test=" Hello World!";
		test=test.concat(" Thanks You!");
		System.out.println(test);
		
		//substring
		System.out.println(test.substring(0,10));
		
		//trim
		System.out.println(test.trim());
	}

}
