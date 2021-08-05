package Demos;

class ThreadPriority extends Thread{
	
	@Override
	public void run() {
		System.out.println("running thread name is " + Thread.currentThread().getName());
		System.out.println("running thread priority is " + Thread.currentThread().getPriority());
	}
}

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		
		ThreadPriority tp = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		
		tp.setPriority(Thread.MAX_PRIORITY);
		tp2.setPriority(Thread.MIN_PRIORITY);
		
		tp.start();
		tp2.start();
	}

}
