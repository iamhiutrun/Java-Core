
public abstract class HinhHoc {
	private int chieudai;
	private int chieurong;
	
	public HinhHoc(int chieudai, int chieurong) {
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}
	public HinhHoc() {
		super();
	}
	public int getChieudai() {
		return chieudai;
	}
	public void setChieudai(int chieudai) {
		this.chieudai = chieudai;
	}
	public int getChieurong() {
		return chieurong;
	}
	public void setChieurong(int chieurong) {
		this.chieurong = chieurong;
	}
	public abstract double tinhChuVi();
	public abstract double tinhDienTich();
}
