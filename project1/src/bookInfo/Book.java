package bookInfo;

public class Book{
	private String bookName;
	private double bPrice;
	private int bQty;
	
	public Book() {
		
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getbPrice() {
		return bPrice;
	}
	public void setbPrice(double bPrice) {
		this.bPrice = bPrice;
	}
	public int getbQty() {
		return bQty;
	}
	public void setbQty(int bQty) {
		this.bQty = bQty;
	}
	public Book(String bName,double bPrice,int qty) {
		setBookName(bName);
		setbPrice(bPrice);
		setbQty(qty);
	}
	public void showInfo() {
		Author a =new Author();
		a.setName("Min Ko");
		System.out.println("Author : "+a.getName());
		System.out.println("Book Name : "+bookName);
		System.out.println("Book Price : "+bPrice);
		System.out.println("Book Qty : "+bQty);
	}
	
	

}
