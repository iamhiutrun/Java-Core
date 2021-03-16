package random_integer_character;

public class main {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		// Hien thi ket qua 
		System.out.println("Hien thi ket qua sinh ngau nhien cua 2 Thread 1 va Thread 2");
		
		System.out.println("THREAD 1");
		
		for(int i=0;i< t1.list.size(); i++)
		{
			System.out.print(" "+ t1.list.get(i));
		}
		System.out.println("\nTHREAD 2");
		
		for(int i=0;i< t2.list.size(); i++)
		{
			System.out.print(" "+ t2.list.get(i));
		}
	}

}
