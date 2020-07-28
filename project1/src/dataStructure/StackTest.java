package dataStructure;

import java.util.Stack;

public class StackTest {

	static void  showpush(Stack st,int a) {
		st.push(new Integer(a));
		System.out.println("push("+a+")");
		System.out.println("stack : "+st);
	}
	static void showpush(Stack st) {
		System.out.println("Pop ->");
		Integer a =(Integer) st.pop();
		System.out.println(a);
		System.out.println("Stack : "+st);
	}
	public static void main(String[] args) {
		Stack ss=new Stack();
		System.out.println("Stack : "+ss);
		
		showpush(ss,43);
		showpush(ss,21);
		showpush(ss,22);
		showpush(ss,12);
		showpush(ss,66);
		
		
		try {
			showpush(ss);
			showpush(ss);
			showpush(ss);
			showpush(ss);
			showpush(ss);
			showpush(ss);
			showpush(ss);
		}catch(Exception e) {
			System.out.println("Empty Stack");
		}
	}

}
