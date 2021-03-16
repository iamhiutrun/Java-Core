import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv.add(new SinhVien("Hieu", 5.0));
		dssv.add(new SinhVien("Tan", 9));
		dssv.add(new SinhVien("Q", 5));
		
		for(SinhVien x:dssv) {
			System.out.println(x);
		}
	}

}
