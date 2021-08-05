package Demos;


class Company{
	int item;
	
	boolean flag = false;
	
	synchronized void producer(int item) throws InterruptedException{
		if(flag) {
			wait();
		}
		this.item = item;
		System.out.println("Produced: "+ this.item);
		flag = true;
		notify();
	}
	
	synchronized int consume() throws InterruptedException{
		if(!flag) {
			wait();
		}
		System.out.println("Consume: " + item);
		flag = false;
		notify();
		return this.item;
	}
}
class Producer extends Thread{
	
	Company company;
	
	public Producer(Company company) {
		this.company = company;
		
	}
	
	@Override
	public void run() {
		int i =1;
		try {
			this.company.producer(i);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

class Consumer extends Thread{
	
	Company company;
	
	public Consumer(Company company) {
		this.company = company;
		
	}
	@Override
	public void run() {
		int i =1;
		try {
			this.company.consume();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Demo14 {
	
	public static void main(String[] args) {
		
		Company company = new Company();
		Producer pro = new Producer(company);
		Consumer con = new Consumer(company);
		
		pro.start();
		con.start();
	}

}
