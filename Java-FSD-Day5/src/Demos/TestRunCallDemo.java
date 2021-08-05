package Demos;

class TestRunCall extends Thread{
	
	@Override
	public void run() {
		for(int i =0; i<5; i++) {
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			
			}
			System.out.println(i);
		}
	}
}

public class TestRunCallDemo {
	public static void main(String[] args) {
		
		TestRunCall tr = new TestRunCall();
		TestRunCall tr2 = new TestRunCall();
		
		//tr.start();
		//tr2.start();
		
		tr.run();
		tr2.run();
		
	}

}
