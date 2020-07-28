package FilesIO;
import java.io.*;
import java.nio.file.Paths;
public class CreateReadDir {

	public static void main(String[] args) {
		String[] paths =null;
		String dname ="/home/minko/Desktop/minko123";
		
		File d =new File(dname);
		try {
		File re=new File("/home/minko");
		paths = re.list();
			for(String path:paths) {
				System.out.println(path);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		d.mkdir();
	}

}
