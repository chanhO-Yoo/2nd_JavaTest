package ncs.test10;

public class BookUpdate {
	//field
	private Book bookData;
	
	//constructor
	public BookUpdate() {
		
	}
	public BookUpdate(Book bookData) {
		this.bookData = bookData;
	}
	
	//getter & setter
	public Book getBookData() {
		return bookData;
	}
	
	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}
	
	//method
	public void updateBookPrice() {
		bookData.setBookPrice(bookData.getBookPrice()*(1-bookData.getBookDiscountRate()/100));
	}
}
