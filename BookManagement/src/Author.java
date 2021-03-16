import java.util.ArrayList;
import java.util.Scanner;

public class Author {
	private String name;
	private int old;
	private String nickname;
	private String birthday;
	private String address;
	
	
	public Author(String nickname) {
		super();
		this.nickname = nickname;
	}

	public Author(String name, int old, String nickname, String birthday, String address) {
		super();
		this.name = name;
		this.old = old;
		this.nickname = nickname;
		this.birthday = birthday;
		this.address = address;
	}

	public Author() {
		super();
	}

	public String getName() {
		return name;
	}

	public int getOld() {
		return old;
	}

	public String getNickname() {
		return nickname;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getAddress() {
		return address;
	}

	
	public void input(ArrayList<Author> authorList) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		input();
		System.out.println("Nhap but danh: ");
		while(true) {
			nickname = sc.nextLine();
			boolean isFind = false;
			for(int i=0;i<authorList.size();i++) {
				if(authorList.get(i).getNickname().equalsIgnoreCase(nickname)) {
					isFind = true;
				}
			}
			if(!isFind) {
				break;
			} else {
				System.err.println("Nhap but danh khac.");
			}
		}
	}
		
		public void input() {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ten tac gia: ");
			name = sc.nextLine();
			System.out.println("Nhap tuoi: ");
			old = sc.nextInt();
			sc.nextLine();
			System.out.println("Ngay sinh: ");
			birthday = sc.nextLine();
			System.out.println("Nhap dia chi: ");
			address = sc.nextLine();

	}
	
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", old=" + old + ", nickname=" + nickname + ", birthday=" + birthday
				+ ", address=" + address + "]";
	}
	
}
