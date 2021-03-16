package bai1_gokisoft_dssv;

public class main {
	public static void main(String[] args) {
		SharedData sharedData = new SharedData();
		Thread1 t1 = new Thread1(sharedData);
		Thread2 t2 = new Thread2(sharedData);
		
		t2.start();
		t1.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
