package can_bo;

public class Nhan_Vien extends Can_Bo{
	String cong_viec;

	public Nhan_Vien(String ho_ten, String ngay_sinh, String gioi_tinh, String dia_chi, String cong_viec) {
		super(ho_ten, ngay_sinh, gioi_tinh, dia_chi);
		this.cong_viec = cong_viec;
	}

	public Nhan_Vien(String ho_ten, String ngay_sinh, String gioi_tinh, String dia_chi) {
		super(ho_ten, ngay_sinh, gioi_tinh, dia_chi);
	}

	public String getCong_viec() {
		return cong_viec;
	}

	public void setCong_viec(String cong_viec) {
		this.cong_viec = cong_viec;
	}
	
	public Nhan_Vien() {};

	@Override
	public String toString() {
		return "Nhan_Vien [ho_ten=" + ho_ten + ", ngay_sinh=" + ngay_sinh + ", gioi_tinh=" + gioi_tinh + ", dia_chi="
				+ dia_chi + ", cong_viec=" + cong_viec + "]";
	}
	
	
}
