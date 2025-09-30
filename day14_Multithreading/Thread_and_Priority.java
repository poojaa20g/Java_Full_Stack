package day14_Multithreading;

class Star extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("*");
		}
	}
}

class Dollar extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("$");
		}
	}
}

class Letter extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("A");
		}
	}
}


public class Thread_and_Priority{
	public static void main(String[] args) {
		Star s = new Star(); //thread in new state
		//s.start(); //start the thread
		System.out.println(s.getState()); //runnable or running
		
		Dollar d = new Dollar();
		//d.start();
		
		Letter l = new Letter();
		System.out.println(" Get Priority");
		System.out.println(s.getPriority());
		System.out.println(d.getPriority());
		System.out.println(l.getPriority());
		
		System.out.println(" Set Priority");
		s.setPriority(Thread.MAX_PRIORITY);
		d.setPriority(Thread.NORM_PRIORITY);
		l.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(" Get Priority");
		System.out.println(s.getPriority());
		System.out.println(d.getPriority());
		System.out.println(l.getPriority());
		
		
		d.start();
		l.start();
		s.start();
	}
}
