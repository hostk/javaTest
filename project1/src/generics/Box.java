package generics;

public class Box<R>{
	private R r;
	public void add(R r) {
		this.r=r;
	}
	public R get() {
		return r;
	}
	public static void main(String args[]) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		
		integerBox.add(new Integer(10));
		stringBox.add("Hello World");
		
		System.out.printf("Integer value : %d \n\n",integerBox.get());
		System.out.printf("String box is %s \n\n ",stringBox.get());
		
	}
	
}