package BaiTap3;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Person> dsPerson = new ArrayList<Person>();
		Person an = new Man();
		an.setFirstName("AN");
		Person hong = new Woman();
		hong.setFirstName("Hong");
		((Woman)hong).setWearingMakeup(true);
		
		dsPerson.add(an);
		dsPerson.add(hong);
		for(Person i : dsPerson) {
			if(i instanceof Man) {
				System.out.println(i.getFirstName()+" la Nam");
			}
			else if(i instanceof Woman) System.out.println(i.getFirstName()+" la Nu");
		}
	}
}
