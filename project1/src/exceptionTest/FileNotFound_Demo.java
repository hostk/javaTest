package exceptionTest;
import java.io.*;
public class FileNotFound_Demo {

	public static void main(String[] args) throws FileNotFoundException {
	try {
	FileInputStream f = new FileInputStream("input.txt");
	FileInputStream ff =new FileInputStream("output");
	System.out.println(f);

	System.out.println(ff);
	
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
