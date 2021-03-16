
public class NhanVien {
	private String ho;
	private String ten;
	private int sp;
	
	public NhanVien(String ho, String ten, int sp) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.sp = sp;
		if(this.sp <0) this.sp = 0;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}
	
	public double getLuong() {
		double dongia = 0;
		if(this.sp <=199 && this.sp>=1)
			dongia=0.5;
		else if(this.sp>199 && this.sp<=399)
			dongia=0.55;
		else if(this.sp>399 && this.sp<600)
			dongia=0.6;
		else
			dongia=0.65;
		return dongia*this.sp;
	}
	
	boolean LonHon(NhanVien nv2) {
		return this.sp > nv2.sp;
	}

	
	
}
