package can_bo;

public class Ky_Su extends Can_Bo {
	String nganh_dao_tao;
	public Ky_Su() {};

	public Ky_Su(String ho_ten, String ngay_sinh, String gioi_tinh, String dia_chi, String nganh_dao_tao) {
		super(ho_ten, ngay_sinh, gioi_tinh, dia_chi);
		this.nganh_dao_tao = nganh_dao_tao;
	}

	public String getNganh_dao_tao() {
		return nganh_dao_tao;
	}

	public void setNganh_dao_tao(String nganh_dao_tao) {
		this.nganh_dao_tao = nganh_dao_tao;
	}

	public Ky_Su(String ho_ten, String ngay_sinh, String gioi_tinh, String dia_chi) {
		super(ho_ten, ngay_sinh, gioi_tinh, dia_chi);
	}

	@Override
	public String toString() {
		return "Ky_Su [nganh_dao_tao=" + nganh_dao_tao + ", getHo_ten()=" + getHo_ten() + ", getNgay_sinh()="
				+ getNgay_sinh() + ", getGioi_tinh()=" + getGioi_tinh() + ", getDia_chi()=" + getDia_chi() + "]";
	}
 
	
	

}
