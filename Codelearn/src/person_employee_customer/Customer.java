package person_employee_customer;

public class Customer extends Person {
	private int balance;

	public Customer() {
		
	}

	public Customer(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void display() {
		System.out.println("Customer name: " +getName());
		System.out.println("Customer address: "+getAddress());
		System.out.println("Customer salary: "+getSalary());
	}
	
	
}
