package Inrihentance;

public class NhanVienThoiVu extends NhanVien {
		public NhanVienThoiVu(){
			super();
		}
		
		public NhanVienThoiVu(int ma, String ten) {
			super(ma,ten);
		}

		public void tinhluong() {
			super.tinhluong();
			System.out.println("===>Day la nhan vien thoi vu");;
		}
}
