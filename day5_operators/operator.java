package day5_operators;

import java.util.Scanner;

public class operator {
	@SuppressWarnings("resource")
	public static void main(String []args) {
		@SuppressWarnings("unused")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=s.nextInt();
		System.out.println("Enter b number :");
		int b=s.nextInt();
		
		System.out.println("add "+(a+b));
		System.out.println("sub "+(a-b));
		System.out.println("mul "+a*b);
		System.out.println("div "+a/b);
		System.out.println("mod "+a%b);
		System.out.println("and "+(a&b));
		System.out.println("or "+(a|b));
		System.out.println("xor "+(a^b));
		System.out.println("tenary "+ ((a+b==0) ? true:false));
		
		if(a>b && a==b) {
			System.out.println( "logic and true");
		}
		else {
			System.out.println("logic and false");
		}
		
		if(a<b || a==b) {
			System.out.println("logic or true");
		}
		else {
			System.out.println("logic or false");
		}
		
	}

}
