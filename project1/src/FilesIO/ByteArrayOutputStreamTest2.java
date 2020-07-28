package FilesIO;
import java.io.*;
public class ByteArrayOutputStreamTest2 {

	public static void main(String[] args) throws IOException {

		ByteArrayOutputStream out = new ByteArrayOutputStream(12);
		
		while(out.size() != 10) {
			out.write("hello".getBytes());
		}
		
		byte b[] = out.toByteArray();
		System.out.println("Print the content");
		
		for(int x  = 0;x<b.length;x++) {
			System.out.print((char) b[x] + " ");
		}
		System.out.println(" ");
		
		int c;
		ByteArrayInputStream in = new ByteArrayInputStream(b);
		System.out.println("Converting characters to Upper Case");
		
		for(int i=0;i<1;i++) {
			while((c= in.read()) != -1) {
				System.out.println(Character.toUpperCase((char)c));
			}
			in.reset();
		}

		
	}

}
