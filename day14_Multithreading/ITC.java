package day14_Multithreading;
import java.util.Scanner;
public class ITC {
	
	int amount=10000;
	public synchronized void withdraw(int amount) {
		System.out.println("going to withdraw");
		if(this.amount<amount) {
			System.out.println("Less balance : so wait");
			try {
				wait();
			}
			catch(InterruptedException e){ e.printStackTrace();}
		}
		
		this.amount-=amount;
		System.out.println("withdraw completed : "+this.amount);
		
	}
	public synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount+=amount;
		System.out.println("deposit completed : "+this.amount);
		notify();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the w_amount : ");
		int amount1 = sc.nextInt();
		System.out.println("Enter the d_amount : ");
		int amount2 = sc.nextInt();
		ITC itc = new ITC();
		new Thread() { public void run() { itc.withdraw(amount1);}}.start();
		new Thread() { public void run() { itc.deposit(amount2);}}.start();
		
		
		

	}

}
