
public class main {

	public static void main(String[] args) {
		
		SharedData sharedData = new SharedData();
		CustomThread thread1 = new CustomThread(sharedData);
		CustomThread thread2 = new CustomThread(sharedData);
		CustomThread thread3 = new CustomThread(sharedData);
		CustomThread thread4 = new CustomThread(sharedData);
		CustomThread thread5 = new CustomThread(sharedData);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

	}

}
