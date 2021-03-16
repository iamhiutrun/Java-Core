package model;

public class BookReaderManagerment {
	private Book b;
	private Reader reader;
	private int numOfBorrow;
	private String state;
	private int totalBorrowed;
	public BookReaderManagerment(Book b, Reader reader, 
			int numOfBorrow, String state, int totalBorrowed) {
		super();
		this.b = b;
		this.reader = reader;
		this.numOfBorrow = numOfBorrow;
		this.state = state;
		this.totalBorrowed = totalBorrowed;
	}
	public BookReaderManagerment() {
		super();
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public int getNumOfBorrow() {
		return numOfBorrow;
	}
	public void setNumOfBorrow(int numOfBorrow) {
		this.numOfBorrow = numOfBorrow;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getTotalBorrowed() {
		return totalBorrowed;
	}
	public void setTotalBorrowed(int totalBorrowed) {
		this.totalBorrowed = totalBorrowed;
	}
	
	
}
