package FilesIO;

import java.io.*;

public class ByteStreamTest {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out =null;
		
		try {
			in = new FileInputStream("/home/minko/Desktop/InternJavaProject/javaTest/project1/input.txt");
			out = new FileOutputStream("output1.txt");
			
			int c;
			while((c= in.read())!=-1) {
				out.write(c);
			}
		
			
			
		}finally {
			if(in !=null) {
				in.close();
			}
			if(out !=null) {
				out.close();
			}
		}
			FileReader fin = null;
			FileWriter fout =null;
			
			try {
				fin = new FileReader("/home/minko/Desktop/tt.txt");
				fout = new FileWriter("/home/minko/Desktop/out.txt");
				
				int c;
				while((c= fin.read())!=-1) {
					fout.write(c);
				}
			
				
				
			}finally {
				if(fin !=null) {
					fin.close();
				}
				if(fout !=null) {
					fout.close();
				}
			
		}
		
		
	

	}
}
