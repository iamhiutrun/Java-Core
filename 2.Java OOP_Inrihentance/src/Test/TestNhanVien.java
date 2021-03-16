package Test;

import Inrihentance.NhanVienChinhThuc;
import Inrihentance.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1,"Nguyen Van Teo");
		NhanVienThoiVu 	ty = new NhanVienThoiVu(2, "Tran Thi Ty");
		teo.tinhluong();
		ty.tinhluong();
	}

}
