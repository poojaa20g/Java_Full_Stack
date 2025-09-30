package day6_loops;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number: ");
		int n=s.nextInt();
		int a=n;
		int rev=0;
		while(a>0) {
			int d=a%10;
			rev=rev*10+d;
			a/=10;
		}
		System.out.println("Original number: "+n);
		System.out.println("Reversed number: "+rev);
		
		if(n==rev) {
			System.out.println("Is palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
