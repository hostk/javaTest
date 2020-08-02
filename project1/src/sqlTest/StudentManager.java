package sqlTest;
import java.util.*;
import java.sql.*;
import java.io.*;
public class StudentManager {
	static Student std ;
	static StudentDaoImpl sdim;
	public static void main(String[] args) {
		sdim = new StudentDaoImpl();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 :Insert | 2: Update | 3: Delete");
		String choose = scan.nextLine();
		
		switch(choose) {
		case "1":
			System.out.print("Enter the student's name : ");
			String name = scan.nextLine();
			System.out.print("Enter the student's rollNo : ");
			String roll = scan.nextLine();
			System.out.print("Enter the student's phoneNo : ");
			String phone = scan.nextLine();
			
			std = new Student(name,roll,phone);

			sdim.saveStudent(std);
			sdim.getStudentList();
			break;
			
		case "2":
			System.out.print("Enter the student's name : ");
			String name1 = scan.nextLine();
			System.out.print("Enter the student's phoneNo : ");
			String phone2 = scan.nextLine();
			std = new Student(name1,null,phone2);
			sdim.updateStudent(std);
			sdim.getStudentList();
			break;
			
		case "3":
			System.out.print("Enter the you want to delete id : ");
			int id  = scan.nextInt();
			sdim.deleteStudent(id);
			sdim.getStudentList();
			break;
		default:
			sdim.getStudentList();
			break;
		}
		if(scan != null) {
			scan.close();
		}
		
	}

}
