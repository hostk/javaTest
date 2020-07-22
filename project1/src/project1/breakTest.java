package project1;

public class breakTest {

	public static void main(String[] args) {

		boolean t= true;
		
		first:{
			second:{
				third:{
					System.out.println("Break before execute.");
					if(t) break second;
					System.out.println("This won't execute!.");
				}
				System.out.println("This won't execute.");
		}
			System.out.print("This is after second block.");
		}
	}

}
