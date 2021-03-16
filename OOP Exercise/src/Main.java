import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1, nv2;
		System.out.println("Moi ban nhap thong tin nv1:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho:");
		String ho1 = sc.nextLine();
		System.out.println("Nhap ten:");
		String ten1 = sc.nextLine();
		System.out.println("So san pham: ");
		int sp1 = sc.nextInt();
		nv1 = new NhanVien(ho1, ten1, sp1);
		
		
		System.out.println("\n\nMoi ban nhap thong tin nv2:");
		System.out.println("Nhap ho:");

		sc.nextLine();
		String ho2 = sc.nextLine();
		System.out.println("Nhap ten:");
		String ten2 = sc.nextLine();
		System.out.println("So san pham: ");
		int sp2 = sc.nextInt();
		
		nv2 = new NhanVien(ho2, ten2, sp2);
		sc.close();
		
		System.out.println("Luong NV1 = "+nv1.getLuong());
		System.out.println("Luong NV2 = "+nv2.getLuong());
		
		if(nv1.LonHon(nv2)) {
			System.out.println("Nhan Vien [" + nv1.getHo() +" "+nv1.getTen()+"] co nhieu san pham hon nv2");
			System.out.println("Cu the:"+ (nv1.getSp() - nv2.getSp()) +" san pham");
		}
		else {
			System.out.println("Nhan Vien [" + nv2.getHo() +" "+nv2.getTen()+"] co nhieu san pham hon nv1");
			System.out.println("Cu the:"+ (nv2.getSp() - nv1.getSp()) +" san pham");
		}
	}

	public Main() {
	}

}
