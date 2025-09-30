package day14_Multithreading;

class Printable{
	public synchronized void printable(int n) throws InterruptedException{
		for(int i=1;i<=5;i++) {
			System.out.println("Thread "+i+" : "+n*i);
			Thread.sleep(3000);
		}
	}
}

class Thread1 extends Thread {
	Printable pt;
	Thread1(Printable pt){
		this.pt=pt;
	}
	public void run() {
		try {
			pt.printable(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class Thread2 extends Thread{
	Printable pt;
	Thread2(Printable pt){
		this.pt=pt;
	}
	public void run() {
		try {
			pt.printable(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Synchronization {
	
	public static void main(String[]args) {
		Printable p = new Printable();
		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);
		t1.start();
		t2.start();
		
	}
}
