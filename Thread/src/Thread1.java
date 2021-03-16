
public class Thread1 extends Thread{
	 @Override
	public void run() {
		 System.out.println("T1 is running");
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread1 >  "+i);
		}
	 }
}
