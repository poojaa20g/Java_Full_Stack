package day6_loops;
import java.util.Scanner;
public class Fibannoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		int a=0;
		int b=1;
		System.out.println(a+"\n"+b);
		for(int i=0;i<n;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}

	}

}
