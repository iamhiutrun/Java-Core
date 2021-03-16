package vemaybay;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLyBay {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		List<VeMayBay> list = new ArrayList<VeMayBay>();
		int choose;
		do {
			showMenu();
			choose = sc.nextInt();
			switch (choose) {
			case 1:
				input(list);
				break;
			case 2:
				save(list, "DuLieuBay.txt");
				break;
			case 3:
				list = read("vietnamAirline.txt");
				for(int i=0;i<list.size();i++)
				{
					System.out.println(list.get(i));
				}
				break;
			case 4:
				sort(list);
				break;
			case 5:
				saveByAirline(list);
				break;
			case 6:
				System.out.println("Thoat!");
				break;
			default:
				System.out.println("Input failed!");
				break;
			}
		}while(choose!=6);
	}
	
	static void input(List<VeMayBay> list)
	{
		System.out.println("Nhap so ve may bay");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			VeMayBay  vemaybay = new VeMayBay();
			vemaybay.input();
			list.add(vemaybay);
		}
	}
	
	static void save(List<VeMayBay> list, String filename)
	{
		FileOutputStream out = null;
		ObjectOutputStream oos = null;
		try {
			out = new FileOutputStream(filename);
			oos = new ObjectOutputStream(out);
			oos.writeObject(list);
		}catch(Exception e) {
			
		}finally {
			if(out!=null)
			{
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(oos!=null)
			{
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	
	}
	static List<VeMayBay> read(String filename)
	{
		List<VeMayBay> list = new ArrayList<>();
		FileInputStream in = null;
		ObjectInputStream ois = null;
		try {
			in = new FileInputStream(filename);
			ois = new ObjectInputStream(in);
			list = (List<VeMayBay>) ois.readObject();
		}catch(Exception e) {
			
		}finally {
			if(in!=null)
			{
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ois!=null)
			{
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	
	static void sort(List<VeMayBay> list)
	{
		Collections.sort(list, new Comparator<VeMayBay>() {
		@Override
		public int compare(VeMayBay o1, VeMayBay o2) {
			if(o1.getPrice() > o2.getPrice())
			{
				return -1;
			}
			return 1;
		}
		});
		for(int i=0;i<list.size();i++)
		{
			list.get(i).display();
		}
	}
	
	static void saveByAirline(List<VeMayBay> list)
	{
		List<VeMayBay> vietjetAirList = getAirLine(list, "VJ");
		save(vietjetAirList,"vietjetAir.txt");
		
		List<VeMayBay> vietnamAirList = getAirLine(list, "VN");
		save(vietjetAirList,"vietnamAirline.txt");
		
		List<VeMayBay> jetstarAirList = getAirLine(list, "JET");
		save(vietjetAirList,"jetstarAir.txt");
	}
	
	static List<VeMayBay> getAirLine(List<VeMayBay> list, String prex)
	{
		List<VeMayBay> airlineList = new ArrayList<>();
		for(VeMayBay veMayBay : list)
		{
			if(veMayBay.getID().startsWith(prex))
			{
				airlineList.add(veMayBay);
			}
		}
		return airlineList;
	}
	static void showMenu()
	{
		System.out.println("1. Nhap thong tin N chuyen bay.");
		System.out.println("2. Luu thong tin.");
		System.out.println("3. Doc thong tin.");
		System.out.println("4. Hien thi thong tin sap xep giam dan gia ve.");
		System.out.println("5. In thong tin moi hang bay.");
		System.out.println("6. Thoat");
		System.out.println("Choose: ");
	}
}
