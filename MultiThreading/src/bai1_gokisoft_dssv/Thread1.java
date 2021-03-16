package bai1_gokisoft_dssv;

public class Thread1 extends Thread {
	SharedData sharedData;

	public Thread1(SharedData sharedData) {
		super();
		this.sharedData = sharedData;
	}
	
	@Override
	public void run() {
		for(int i=0;i<sharedData.userList.length;i++)
		{
			synchronized (sharedData) {
				System.out.println("Username: "+sharedData.userList[i]);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				sharedData.notifyAll();
					try {
						sharedData.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
		}
		System.out.println("t1 die");
		super.run();
	}
	
}
