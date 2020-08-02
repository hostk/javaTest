package jdbcTest;
import java.sql.*;
import java.util.Scanner;
public class InsertTest {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Statement stm = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost/football","root","minkoko");
			System.out.println("Connection is sucessfully!");
			
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Are you add team name!Y or N");
			String check = scan.nextLine();
			
			while(true) {
			if(check.equals("Y")) {
			System.out.print("Enter the foot-team's name");
			String name = scan.nextLine();
			System.out.println();
			System.out.print("Enter the football-team foundeddate");
			String fdate = scan.nextLine();
			String sql ="insert into team(id,name,foundeddate) values(null,'"+name+"','"+fdate+"')";
			
			stm = con.createStatement();
			stm.execute(sql);
			System.out.println("Sucessful insertion.");
			System.out.println();
			}else {
				System.out.println("Thank you");
			}
			}
		}catch(Exception se) {
			se.printStackTrace();
		}finally {
			if(stm != null) {
				stm.close();
			}
			if(con != null) {
				con.close();
			}
		}
			
	}

}
