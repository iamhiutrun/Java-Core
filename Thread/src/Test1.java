
public class Test1 {

	public static void main(String[] args) {
		System.out.println("Thread main starts");
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2(t1);

		
		t1.start();
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread main stops");
	}

}
