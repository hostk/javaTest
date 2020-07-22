package project1;

class Student1{
	int id;
	String name;
	static String collage="UCSMonywa";
	
	Student1(int i,String n) {
		id=i;
		name=n;
	}
	
	void display(){
		System.out.println(id+"\n"+name+"\n"+collage);
	}
}
public class StaticVariableTest {
	public static void main(String args[]) {
		Student1 s1=new Student1(1,"Min Ko");
		s1.display();
	}

}
