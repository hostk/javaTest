package exe1;

public class ArrayMaxMin {

	public static void main(String[] args) {

		int arr[]= {23,12,13,44,22,1,4};
		
		int max=0,min=0,j=0,i;
		//max
		max=arr[0];
		min=arr[0];
		for(i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else {
				min=arr[i];
			}
			
		}
		System.out.println("Max value: "+max);
		
		//min
		min=arr[0];
		for(i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min value: "+min);
		System.out.println("Average value:"+(min+max)/2);
	}

}
