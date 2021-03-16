package can_bo;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	private ArrayList<Can_Bo> dscb;


	public QLCB() {
		dscb = new ArrayList<Can_Bo>();
	}
	
	public void them_Can_Bo(Can_Bo cb) {
		dscb.add(cb);
	}
	
	public void nhap_Ds_Can_Bo(Scanner sc)
	{
		Can_Bo cb = null;
		System.out.println("Nhap so luong can bo: ");
		int n = sc.nextInt();
		System.out.println("Nhap thong tin can bo: \n");
		for(int i=0;i<n;i++)
		{
			System.out.println("Chon can bo (1-ky su, 2-cong nhan, 3- nhan vien)");
			
			int x = sc.nextInt();
			switch (x) {
			case 1:
				cb = new Ky_Su();
				break;

			case 2:
				cb = new Cong_Nhan();
				break;
			case 3:
				cb = new Nhan_Vien();
				break;
			default: break;
			}
			cb.nhap_Thong_Tin(sc);
			them_Can_Bo(cb);
		}
		
	}
	
	public void tim_Kiem_Theo_Ten(String hoten)
	{
		for (Can_Bo can_Bo : dscb) {
			if(hoten.equalsIgnoreCase(can_Bo.getHo_ten())) {
				System.out.println(can_Bo.toString());
			} 
		}
	}
	
	public void xuat_Danh_Sach()
	{
		for(int i=0;i<dscb.size();i++)
		{
			System.out.println(dscb.get(i).toString());
		}
	}
}

