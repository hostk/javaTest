package project1;

public class forloopbreak {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		
		for(int i:arr) {
			System.out.println("value is : "+i);
			sum+=i;
			if(i==5) {
				break;
			}
		}
		System.out.println("Sum : "+sum);
		
	}

}
