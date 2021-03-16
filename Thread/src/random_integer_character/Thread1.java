package random_integer_character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread1 extends Thread {
	 List<Integer> list = new ArrayList<>();

	@Override
	public void run() {
		Random rd = new Random();
		for(int i=0;i<10;i++)
		{
			int number = rd.nextInt(101);
			list.add(number);
			//System.out.println("t1 > "+ number);
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
}
