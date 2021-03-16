package person_employee_customer;

public class Employee extends Person {
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void display()
	{
		System.out.println("Emplyee name: " +getName());
		System.out.println("Employee address: "+getAddress());
		System.out.println("Employee salary: "+getSalary());
	}
}
