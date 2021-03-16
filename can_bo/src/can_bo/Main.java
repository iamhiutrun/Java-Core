package can_bo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Menu(sc);
	}
	
	static void Menu(Scanner sc)
	{
			int lc;
			QLCB qlcb = new QLCB();
			while(true) {
			System.out.println("=============MENU=============\n");
			System.out.println("1. Nhap thong tin moi cho can bo.\n");
			System.out.println("2. Tim kiem theo theo ho ten.\n");
			System.out.println("3. Hien thi danh sach can bo.\n");
			System.out.println("0. Thoat.\n");
			System.out.println("-------------------------------");
			System.out.println("Lua chon: ");
			lc = sc.nextInt();
			switch (lc) {
			case 1:
				qlcb.nhap_Ds_Can_Bo(sc);
				break;
			case 2: 
				sc.nextLine();
				System.out.println("Nhap ho ten can tim kiem: ");
				String hoten = sc.nextLine();
				qlcb.tim_Kiem_Theo_Ten(hoten);
				break;
			case 3: 
				qlcb.xuat_Danh_Sach();
				break;
			case 0: System.out.println("PIPE");
				System.exit(1);
				break;
			default:
				break;
			}
		}
	}

}
