package Demos;

class SleepThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
	}
}

public class SleepThreadDemo {
	
	public static void main(String[] args) {
		
		SleepThread st = new SleepThread();
		SleepThread st1 = new SleepThread();
		
		st.start();
		st1.start();
		
	}

}
