package day3_Scanner;

import java.util.Scanner;

public class profile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = s.nextLine();
		System.out.println("Enter your phone no :");
		long phone = s.nextInt();
		System.out.println("Enter your mark :");
		double mark = s.nextDouble();
		
		System.out.println("student details");
		System.out.println("name :"+name);
		System.out.println("phone :"+phone);
		System.out.println("mark :"+mark);
		


		

	}

}
