package Demos;

class ThreadJoin extends Thread{
	
	public void run() {
		
		for(int i =0; i<5; i++) {
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread name: "+ Thread.currentThread().getName());
			System.out.println(i);
		}
		
	}
}

public class ThreadJoinDemo {
	public static void main(String[] args) {
		
		ThreadJoin tj = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();
		
		tj.start();
		
		try {
			tj.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
		tj2.start();
		tj3.start();
		
	}

}
