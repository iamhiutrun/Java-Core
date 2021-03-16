import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> dssp = new ArrayList<SanPham>();
		dssp.add(new SanPham(1,"Coca",25));
		dssp.add(new SanPham(2, "Pepsi", 15));
		dssp.add(new SanPham(3, "Redbull", 20));
		for(SanPham x: dssp) {
			System.out.println(x);
		}
		Collections.sort(dssp);
		System.out.println("\n");
		for(SanPham x: dssp) {
			System.out.println(x);
		}
	}

}
