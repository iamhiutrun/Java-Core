
public class NhanVienChinhThuc extends NhanVien {

	@Override
	public void tinhluong(int ngaycong) {
		// TODO Auto-generated method stub
		if(ngaycong <20)
		System.out.println("5 Trieu");
		else System.out.println("20 trieu");
	}

}
