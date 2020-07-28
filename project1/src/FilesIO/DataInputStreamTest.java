package FilesIO;
import java.io.*;
public class DataInputStreamTest {
	public static void main(String args[]) throws IOException {
		DataOutputStream Dout = new DataOutputStream(new FileOutputStream("/home/minko/Desktop/tt.txt"));
		
		Dout.writeUTF("hello");
		
		DataInputStream Din = new DataInputStream(new FileInputStream("/home/minko/Desktop/tt.txt"));
		
		while(Din.available()>0) {
			String k = Din.readUTF();
			System.out.println(k);
			
		}

	}
}
