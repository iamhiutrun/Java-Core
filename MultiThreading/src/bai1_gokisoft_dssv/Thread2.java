package bai1_gokisoft_dssv;

public class Thread2 extends Thread{
	SharedData sharedData;

	public Thread2(SharedData sharedData) {
		super();
		this.sharedData = sharedData;
	}
	@Override
	public void run() {
		for(int i=0;i<sharedData.addressList.length;i++)
		{
			synchronized (sharedData) {
				sharedData.notifyAll();
				try {
					sharedData.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Address: "+sharedData.addressList[i]);
				
			}
		}
		synchronized (sharedData) {
			sharedData.notifyAll();
		}
		super.run();
	}

}
