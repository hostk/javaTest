package exFileandException;
import java.util.*;
import java.io.*;
public class StudentManager {
	Student std =new Student();
	static Scanner read =null;
	static FileWriter file = null;

	public static void add() throws IOException {
		Scanner tt = new Scanner(System.in);
		System.out.println("Do You Want Add");
		File f = new File("std.txt");
		FileWriter file = null;
		String check = tt.nextLine();
			
			System.out.print("Enter the student's name : ");
			String name = tt.nextLine();
			
			System.out.print("Enter the student's phone number : ");
			String phone = tt.nextLine();
			
			System.out.print("Enter the student's rollNo : ");
			String roll = tt.nextLine();
			
			System.out.print("Enter the student's city : ");
			String city = tt.nextLine();
			ArrayList<Student> student =new ArrayList<Student>();
			student.add(new Student(name,roll,phone,city));
			try {
				StringBuffer sb = new StringBuffer();
				
				student.forEach(st ->{
					sb.append(st.toString());
					sb.append(" ");
				});
				System.out.println("Writing successful:");
				f.createNewFile();
				file =new FileWriter(f,true);
				for(int i =0;i<sb.length();i++) {
					file.write(sb.charAt(i));
				}
				
				}catch (Exception e) {
					
				}finally {
					if(file != null) {
						file.close();
			
					}
					if(read != null) {
						file.close();
					
				}
					tt.close();
				}
		
			
	}
	public static void show() throws IOException {
		try{
			read =new Scanner(new File("std.txt"));
		
		read.useDelimiter("=");
		String str=" ";
		System.out.println("Student Lists");
		ArrayList<String> stdNew = new ArrayList<>();
		while(read.hasNextLine()) {
			stdNew.add(read.nextLine());
			
		}
		System.out.println(stdNew);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(file != null) {
				file.close();
			}
			if(read != null) {
				read.close();
			}
		}
	}
	public void select() {
		
	}
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Select Yes Or No");
		String quest = input.nextLine();
		
			if(quest.equals("Yes") || quest.equals("Y")) {
				add();
			}else {
				show();
			}
		
		
		
	}
	

}
