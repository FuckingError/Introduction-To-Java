package 图书管理系统;

public class Book {
	private String bookName;
	private String writer;
	private String publister;
	private String price;
	private String number;
	private String dath;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublister() {
		return publister;
	}
	public void setPublister(String publister) {
		this.publister = publister;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDath() {
		return dath;
	}
	public void setDath(String dath) {
		this.dath = dath;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.bookName+"  "+this.writer+"  "+this.publister+"  "+this.price+"  "+this.number+"  "+this.dath;
	}
	
	
	
	
	
	

}
