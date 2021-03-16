package BaiTap2;

public class Hourly extends Employee {
	private int hoursWorked;
	
	public void addHours(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double pay() {
		return super.pay() + this.hoursWorked*50;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
