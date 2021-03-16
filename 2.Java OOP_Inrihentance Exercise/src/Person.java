import java.util.Scanner;

public class Person {
	protected String name;
	protected String sex;
	protected String address;
	protected String birthday;
	
	//Constructor
	public Person() {};
	public Person(String name, String sex, String address, String birthday) {
		super();
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday;
	}
	
	//Setter Getter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	// Procedure
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Your Name: ");
		this.name = sc.nextLine();
		System.out.print("Your Sex: ");
		this.sex = sc.nextLine();
		System.out.print("Your Address: ");
		this.address = sc.nextLine();
		System.out.print("Your Birthday: ");
		this.birthday = sc.nextLine();
		sc.close();
	}
		
	public void outputInfo() {
		System.out.println("Your Name: "+this.name); 
		System.out.println("Your Sex: "+this.sex);
		System.out.println("Your Address: "+this.address);
		System.out.println("Your Birthday: "+this.birthday);
	}
	
	
}
