package bookInfo;

public class Book{
	private String bookName;
	private double bPrice;
	private int bQty;
	Author a=new Author();
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
	public Book(String bName,double bPrice,int qty,Author a) {
		this.a=a;
		this.bookName=bName;
		this.bPrice=bPrice;
		this.bQty=qty;
	}
	public void showInfo() {
		System.out.println("Book Information");
		System.out.println("Author : "+a.getName());
		System.out.println("Book Name : "+bookName);
		System.out.println("Book Price : "+bPrice);
		System.out.println("Book Qty : "+bQty);
	}
	
	

}
