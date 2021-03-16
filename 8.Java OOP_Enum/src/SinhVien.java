
public class SinhVien {
	private String name;
	private double diem;
	private XepLoai loai;
	
	
	public SinhVien(String name, double diem) {
		super();
		this.name = name;
		this.diem = diem;
		this.loai = getLoai();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	
	public XepLoai getLoai() {
		if(this.diem>=8) return loai = XepLoai.Gioi;
		else if(this.diem>=6.5) return loai = XepLoai.Kha;
		else if(this.diem>=5) return loai = XepLoai.TrungBinh;
		return XepLoai.Yeu;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +"\t"+this.diem+"\t===>"+this.loai.Description();
	}
	
}
