package interface_employee;

public class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
		// TODO Auto-generated constructor stub
	}
	
	public int calculateSalary()
	{
		return 8* getPaymentPerHour();
	}
}
