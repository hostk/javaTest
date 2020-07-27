package bookInfo;

public class bookInformation{

	public static void main(String[] args) {
		Author a= new Author();
		a.setName("Min Ko Ko");
		a.setGender("M");
		a.setEmail("minkoko123mon@gmail.com");
		Book b1 = new Book("Booking",21.00,3,a);
		
	/*	b1.setBookName("Booking");
		b1.setbPrice(20.0);
		b1.setbQty(2);
		b1.showInfo(); */
		b1.showInfo();
		System.out.println();
		a.showInfo();
	}

}
