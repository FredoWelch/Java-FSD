package Demos;

class MultiThread2 implements Runnable{
	@Override
	public void run() {
		System.out.println("thread is running");
		
	}
	
}

public class MultiThreadDemo2 {
	public static void main(String[] args) {
		
		MultiThread2 td2 = new MultiThread2();
		Thread t1 = new Thread(td2);
		t1.start();
		
	}

}
