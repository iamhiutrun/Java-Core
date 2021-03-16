
public class HinhChuNhat extends HinhHoc {

	
	public HinhChuNhat(int chieudai, int chieurong) {
		super(chieudai, chieurong);
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double tinhChuVi() {
		return (this.getChieudai() + this.getChieurong())*2;
	}

	public double tinhDienTich() {
		return this.getChieudai() * this.getChieurong();
	}

}
