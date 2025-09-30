package day14_Multithreading;

public class Join_threads extends Thread {
	 public void run() {
		 for(int i=1;i<=5;i++) {
			 System.out.println(i);
		 }
	 }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Join_threads t1 = new Join_threads();
		Join_threads t2 = new Join_threads();
		t1.start();
		t1.join();//  join is specified so it will execute first then only final print statement is printed
		t2.start();
		t2.join();
		System.out.println("finally printed");
		
	}

}
