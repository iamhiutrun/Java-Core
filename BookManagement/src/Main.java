import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		ArrayList<Author> authorList = new ArrayList<Author>();
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		Scanner sc = new Scanner(System.in);
		int choose;
		int n;
		do {
			
			System.out.println("1.Nhập thông tin sách: ");
			System.out.println("2.Hiển thị tất cả sách ra màn hình: ");
			System.out.println("3.Nhập thông tin tác giả: ");
			System.out.println("4.Tìm kiếm sách theo bút danh: ");
			System.out.println("0.Thoát");
			System.out.print("Lua chon chuc nang: ");
			choose = sc.nextInt();
		switch(choose) {
			case 1:{
				System.out.println("Nhap so sach can them: ");
				n = sc.nextInt();
				for(int i=0;i<n;i++) {
					Book book = new Book();
					book.input();
					boolean isFind = false;
					for(int j=0;j<authorList.size();j++) {
						if(authorList.get(j).getNickname().equalsIgnoreCase(book.getNickName())) {
							isFind = true;
							break;
						}
						if(!isFind) {
							Author author = new Author(book.getNickName());
							author.input();
							authorList.add(author);
						}
					}
					bookList.add(book);
					
				}
				break;
			}
			case 2:{
				for(Book book:bookList) {
					book.display();
				}
				break;
			}
			case 3:{
				System.out.println("Nhap so tac gia can them: ");
				n = sc.nextInt();
				for(int i=0;i<n;i++) {
					Author author = new Author();
					author.input(authorList);
					authorList.add(author);
				}
				
				break;
			}
			case 4:{
				System.out.println("Nhap ten but danh can tim kiem");
				String nickname = sc.nextLine();
				for(Book i : bookList) {
					if(i.getNickName().equalsIgnoreCase(nickname)) {
						i.display();
					}
					else {
						System.out.println("Khong tim thay tac gia");
					}
				}
				break;
			}
			case 0:{
				System.out.println("Goodbye");
				System.exit(0);
			}
			default:{
				System.err.println("Error. Vui long nhap lai.");
				break;
			}
		} 
	} while(choose!=5);
 }
}
