

public class Thread2 extends Thread{
	SharedData sharedData;
	
	public Thread2(SharedData sharedData) {
		
		this.sharedData = sharedData;
	}
	
	@Override
	public void run() {
			for(int i=0;i<10000;i++)
			{
				synchronized (sharedData) {
					try {
						sharedData.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					int result = sharedData.rad*sharedData.rad;
					System.out.println("thread 2 < "+ result);
					sharedData.notifyAll();
				}
			}
	}
}
