package BaiTap2;

public class Main {

	public static void main(String[] args) {
		Staff st = new Staff();
		Employee teo = new Employee();
		teo.setName("Nguyen Van Teo");
		teo.setAddress("Quan 1");
		teo.setPhone("123");
		teo.setPayRate(0.12);
		teo.setSocialSecurityNumber("SEC123");
		st.addStaffMember(teo);
		
		Employee ty = new Employee();
		ty.setName("Nguyen Van Ty");
		ty.setAddress("Quan 2");
		ty.setPhone("456");
		ty.setPayRate(0.14);
		ty.setSocialSecurityNumber("SEC456");
		st.addStaffMember(ty);
		
		Executive an = new Executive();
		an.setName("Ho Van An");
		an.setAddress("Quan 3");
		an.setPhone("789");
		an.setPayRate(0.17);
		an.setSocialSecurityNumber("SEC789");
		an.awardBonus(100);
		st.addStaffMember(an);
		st.payday();
	}

}
