package person_employee_customer;

public abstract class Person {

	private String name;
	private String address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public abstract void display();
}
