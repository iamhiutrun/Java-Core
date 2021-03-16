package can_bo;

public class Cong_Nhan extends Can_Bo{
	
	String bac_luong;

	public String getBac_luong() {
		return bac_luong;
	}

	public void setBac_luong(String bac_luong) {
		this.bac_luong = bac_luong;
	}

	public Cong_Nhan(String ho_ten, String ngay_sinh, String gioi_tinh, String dia_chi, String bac_luong) {
		super(ho_ten, ngay_sinh, gioi_tinh, dia_chi);
		this.bac_luong = bac_luong;
	}

	public Cong_Nhan(String ho_ten, String ngay_sinh, String gioi_tinh, String dia_chi) {
		super(ho_ten, ngay_sinh, gioi_tinh, dia_chi);
	}
	
	public Cong_Nhan() {}

	@Override
	public String toString() {
		return "Cong_Nhan [ho_ten=" + ho_ten + ", ngay_sinh=" + ngay_sinh + ", gioi_tinh=" + gioi_tinh + ", dia_chi="
				+ dia_chi + ", bac_luong=" + bac_luong + "]";
	}

	
	
	
		
}
