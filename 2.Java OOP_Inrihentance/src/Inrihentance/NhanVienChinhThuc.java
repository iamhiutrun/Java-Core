package Inrihentance;

public class NhanVienChinhThuc extends NhanVien {
	
	public NhanVienChinhThuc() {
			super();
	}
	
	public NhanVienChinhThuc(int ma, String ten) {
			super(ma,ten);
	}
	
	public void tinhluong() {
		super.tinhluong();
		System.out.println("===>Day la nhan vien chinh thuc");
	}
}
