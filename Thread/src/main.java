
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start");
		// cach 1:
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("Thread 1 >"+i);
				}
				
			}
		});
				t.start();
				
		Thread t2 = new Thread(new Runnable() {
					
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("Thread 2 >"+i);
				}
						
			}
		});
				t2.start();
				
		
		// Cach 2 : 
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
					}
				}).start();
				
		// Cach 3: cu phap lamda
				new Thread(() -> {
					// TODO Auto-generated method stub
					
				}).start();
		System.out.println("End");
	}

}
