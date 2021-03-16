package BaiTap2;

public class Executive extends Employee {
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double pay() {
		
		return super.pay() + this.bonus;
	}
	
	public void awardBonus(double bonus) {
		this.bonus = bonus;
		System.out.println("Lanh bonus = "+bonus);
	}
}
