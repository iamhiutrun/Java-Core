package can_bo;

import java.util.Scanner;

public class Can_Bo {
	private String ho_ten;
	private String ngay_sinh;
	private String gioi_tinh;
	private String dia_chi;
	
	public Can_Bo(String ho_ten, String ngay_sinh, String gioi_tinh, String dia_chi) {
		super();
		this.ho_ten = ho_ten;
		this.ngay_sinh =ngay_sinh;
		this.gioi_tinh = gioi_tinh;
		this.dia_chi = dia_chi;
	}

	public Can_Bo() {
		super();
	}

	public String getHo_ten() {
		return ho_ten;
	}

	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}

	public String getNgay_sinh() {
		return ngay_sinh;
	}

	public void setNam_sinh(String ngay_sinh) {
		this.ngay_sinh = ngay_sinh;
	}

	public String getGioi_tinh() {
		return gioi_tinh;
	}

	public void setGioi_tinh(String gioi_tinh) {
		this.gioi_tinh = gioi_tinh;
	}

	public String getDia_chi() {
		return dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	};
	
	public void nhap_Thong_Tin(Scanner sc)
	{
		sc.nextLine();
		System.out.print("Nhap ho va ten: ");
		ho_ten = sc.nextLine();
		System.out.print("Nhap nam sinh: ");
		ngay_sinh = sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gioi_tinh = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		dia_chi = sc.nextLine();
	}

	@Override
	public String toString() {
		return "Can_Bo [ho_ten=" + ho_ten + ", ngay_sinh=" + ngay_sinh + ", gioi_tinh=" + gioi_tinh + ", dia_chi="
				+ dia_chi + "]";
	}
	
}
