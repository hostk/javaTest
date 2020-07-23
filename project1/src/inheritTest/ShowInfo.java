package inheritTest;

public class ShowInfo {

	public static void main(String[] args) {
		
		Person student = new Student("Min Ko","Sagaing","Computer Science",5,20000.0);
		student.showInfo();
		
		System.out.println();
		System.out.println();
		
		Person staff =new Staff("AG Myo","Mandalay","Monywa Computer University",320000.0);
		staff.showInfo();
	}

}
