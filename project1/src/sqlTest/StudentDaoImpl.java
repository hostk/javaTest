package sqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
	String conName ="jdbc:mysql://localhost:3306/StudentManagment";
	
	Connection con =null;
	Statement stm = null;
	@Override
	public boolean saveStudent(Student student) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection(conName,"root","minkoko");
				
				stm = con.createStatement();
				String sql ="insert into student values(null,'"+student.getName()+
						"','"+student.getRollNo()+"','"+student.getPhoneNo()+"')";
			
				stm.executeUpdate(sql);
				System.out.println("Successfully inserting");
				
			}catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
			}finally {
				try {
					if(stm != null) {
						stm.close();
					}
					if(con != null) {
						con.close();
					}
					}catch(SQLException e) {
						e.printStackTrace();
					
					}
				}
		
		return true;
	}

	@Override
	public boolean updateStudent(Student std) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(conName,"root","minkoko");
			
			stm = con.createStatement();
			String update ="update student set phoneNo='"+std.getPhoneNo()
			+"' where name='"+std.getName()+"'";
		
			stm.executeUpdate(update);
			System.out.println("Successfully updating");

		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}finally {
			try {
			if(stm != null) {
				stm.close();
			}
			if(con != null) {
				con.close();
			}
			}catch(SQLException e) {
				e.printStackTrace();
			
			}
		}
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(conName,"root","minkoko");
			
			stm = con.createStatement();
			String delete ="delete  from student where id='"+id+"'";
		
			stm.executeUpdate(delete);
			System.out.println("Successfully deleting");

			
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}finally {
			try {
			if(stm != null) {
				stm.close();
			}
			if(con != null) {
				con.close();
			}
			}catch(SQLException e) {
				e.printStackTrace();
			
			}
		}
		return false;
	}

	@Override
	public List<Student> getStudentList() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(conName,"root","minkoko");
			
			stm = con.createStatement();
			String select ="select * from student";
		
			ResultSet set=stm.executeQuery(select);
			while(set.next()) {
				System.out.println("Student ID: "+set.getInt("id")+
						"\tName : "+set.getString("name")+
						"\tRoll No : "+set.getString("rollNo")+"\tPhone No : "+set.getString("phoneNo"));
			}
			System.out.println("Successfully getList");

			
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}finally {
			try {
			if(stm != null) {
				stm.close();
			}
			if(con != null) {
				con.close();
			}
			}catch(SQLException e) {
				e.printStackTrace();
			
			}
		}
		return null;
	}

}
