package Abstract;

public abstract class NhanVien {
	protected int ma;
	protected String ten;
	
	//Constructor
	public NhanVien() {
		
	}
	
	public NhanVien(int ma, String ten) {
		this.ma = ma;
		this.ten = ten;
	}

	//Setter && Getter
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	//Procedure
	public abstract void tinhluong();
	
}