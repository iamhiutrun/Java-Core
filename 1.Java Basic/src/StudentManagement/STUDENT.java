package StudentManagement;

public class STUDENT {
	private String StudentID;
	private String name;
	private String Address;
	private int age;
	private double GPA;
	
	//Constructor
	
	public STUDENT() {
		// TODO Auto-generated constructor stub
	}
	
	public STUDENT(String StudentID, String name, String Address, int age, double GPA) {
		this.StudentID = StudentID;
		this.name = name;
		this.Address = Address;
		this.age = age;
		this.GPA = GPA;
	}
	
	//Setter && Getter
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	//Procedure
	public void AddStudent(STUDENT A) {
		
	}
	
	public void EditStudentbyID(String StudentID) {
		
	}
	
	public void DeleteStudentbyGPA(double GPA) {
	
	}
	
	public void SortStudentbyName(String name) {
		
	}
	
	public void ShowStudent(STUDENT A) {
		
	}
	
}
