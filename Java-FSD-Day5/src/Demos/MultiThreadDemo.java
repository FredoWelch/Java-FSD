package Demos;


class MultiThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("thread is running");
	}
	
}

public class MultiThreadDemo{
public static void main(String[] args) {
	
	MultiThread1 td = new MultiThread1();
	td.start();
	
	}
}




