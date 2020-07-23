package exe1;

public class showNumber {

	public static void main(String[] args) {

		for(int i=1;i<=100;i++) {
			for(int j=i;j<=100;j++) {
				j*=i;
			System.out.print(j+ "\t");
			if(j%10==0) {
				System.out.println();
			}
			}
			
		}
	}

}
