package Test;

import Abstract.NhanVienChinhThuc;
import Abstract.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1, "Teo Theo");
		teo.tinhluong();
		NhanVienThoiVu ty = new NhanVienThoiVu(2, "Ty Suu");
		ty.tinhluong();
	}

}
