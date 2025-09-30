package day14_Multithreading;

public class Runnable_interface implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable_interface r = new Runnable_interface();
		Thread t = new Thread(r);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("*");
		}
		
	}

}
