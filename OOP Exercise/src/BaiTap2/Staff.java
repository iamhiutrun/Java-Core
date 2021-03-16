package BaiTap2;

import java.util.ArrayList;

public class Staff {
	
	private ArrayList<StaffMember> staffList;
	
	public ArrayList<StaffMember> getStaffList() {
		return staffList;
	}
	public Staff() {
		super();
		staffList = new ArrayList<>();
	}
	public void setStaffList(ArrayList<StaffMember> staffList) {
		this.staffList = staffList;
	}
	
	public void addStaffMember(StaffMember sm) {
		staffList.add(sm);
	}
	public void payday() {
		for(StaffMember sm: staffList) {
			System.out.println(sm);
		}
	}

}
