package random_integer_character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread2 extends Thread {
	 List<Character> list = new ArrayList<>();

	@Override
	public void run() {
		Random random = new Random();
		int min = (int) 'a';
		int max = (int) 'z';
		int limit = max - min;
		for(int i=0;i<10;i++)
		{
			int number = random.nextInt(limit) + min;
			char c = (char)number;
			list.add(c);
			//System.out.println("t2 > " + c);
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
