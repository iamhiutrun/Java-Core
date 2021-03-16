package java_util_Date;

import java.util.Date;

public class Util_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long milisecond = System.currentTimeMillis();
		Date now = new Date(milisecond);
		System.out.println(now);
		
	}

}
