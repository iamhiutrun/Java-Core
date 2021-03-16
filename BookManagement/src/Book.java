import java.util.Scanner;

public class Book {
	private String bookName;
	private String createdAt;
	private String nickName;
	
	
	public Book() {
		super();
	}

	public Book(String bookName, String createdAt, String nickName) {
		super();
		this.bookName = bookName;
		this.createdAt = createdAt;
		this.nickName = nickName;
	}


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@SuppressWarnings("resource")
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten sach: ");
		bookName = sc.nextLine();
		System.out.println("Ngay xuat ban: ");
		createdAt = sc.nextLine(); 
		System.out.println("Nhap but danh:");
		nickName = sc.nextLine();
	}
	
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", createdAt=" + createdAt + ", nickName=" + nickName + "]";
	}
	
}
