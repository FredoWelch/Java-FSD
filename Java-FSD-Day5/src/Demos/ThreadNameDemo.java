package Demos;

class ThreadName extends Thread{
	
	@Override
	public void run() {
		System.out.println("thread is running...");
	}
	
}

public class ThreadNameDemo {
	public static void main(String[] args) {
		
		ThreadName tn = new ThreadName();
		ThreadName tn2 = new ThreadName();
		
		System.out.println("Name of tn: " + tn.getName());
		System.out.println("Name of tn2: "+ tn2.getName());
		
		tn.start();
		tn2.start();
		
		 tn.setName("New name tn");
	     tn2.setName("New name tn2");

	        System.out.println("After changing name of tn: "+ tn.getName());
	        System.out.println("After changing name of tn2: "+ tn2.getName());
	}

}
