import java.util.Scanner;

public class Student extends Person {
	private String id;
	private double gpa;
	private String email;
	
	//Constructor
	public Student() {};
	//Setter && Getter
	public String getId() {
		return id;
	}
	public Student(String id, double gpa, String email) {
		this.id = id;
		this.gpa = gpa;
		this.email = email;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Procedure
	public void inputStudent() {
		inputInfo();
		Scanner sc = new Scanner(System.in);
		System.out.print("Your ID: ");
		this.id = sc.nextLine();
		System.out.print("Your GPA: ");
		this.gpa = sc.nextDouble();
		sc.nextLine();
		System.out.print("Your Email: ");
		this.email = sc.nextLine();
		sc.close();
	}
	
	public void Scholarship() {
		if(this.gpa > 8.0) {
			System.out.println("\tGET A SCHOLARSHIP");
		}
		else System.out.println("\tDON'T GET A SCHOLARSHIP");
	}
	
	public void outputStudent() {
		outputInfo();
		System.out.println("Your ID: "+this.id);
		System.out.println("Your GPA: "+this.gpa);
		System.out.println("Your Email: "+this.email);
		Scholarship();
	}
	
}
