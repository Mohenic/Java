package sub4;

public class SubThread extends Thread {
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Sub Thread 실행...");
			
		}
		
	}

}
