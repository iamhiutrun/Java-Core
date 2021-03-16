
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h;
		h = new HinhChuNhat(4, 5);
		System.out.println("Chu vi  = "+h.tinhChuVi());
		System.out.println("Dien tich = "+h.tinhDienTich());
		h = new HinhVuong(5);
		System.out.println("Chu vi  = "+h.tinhChuVi());
		System.out.println("Dien tich = "+h.tinhDienTich());
		
		IDoAble x;
		x = new NhanVien();
		x.doSomething();
		x= new SinhVien();
		x.doSomething();
	}

}
