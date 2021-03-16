
public class Thread2 extends Thread{
	 Thread1 t1;
	
	
	public Thread2() {
	}


	public Thread2(Thread1 t1) {
		this.t1 = t1;
	}


	@Override
	public void run() {
		System.out.println("T2 is running");
		try {
			System.out.println("Join T1 into T2");
			t1.join();
			System.out.println("T1 is finished");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread2 <  "+i);
		}
		
	}
}
