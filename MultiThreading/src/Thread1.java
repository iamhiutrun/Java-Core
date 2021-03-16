import java.util.Random;


public class Thread1 extends Thread {
	SharedData sharedData;
	
	public Thread1(SharedData sharedData) {
		this.sharedData = sharedData;
	}

	@Override
	public void run() {
		Random random = new Random();
		for(int i=0;i<10000;i++)
		{
			synchronized (sharedData) {
				
				int rad = random.nextInt(100);
				sharedData.rad = rad;
				System.out.println("thread 1 < " + rad);
				
				sharedData.notifyAll();
				
				try {
					sharedData.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				 	e.printStackTrace();
				}
			}
	
		}
	}
}
