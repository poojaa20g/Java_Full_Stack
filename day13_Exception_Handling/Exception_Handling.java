package day13_Exception_Handling;
import java.util.*;
public class Exception_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number a : ");
		int a = sc.nextInt();
		System.out.println("Enter number b : ");
		int b = sc.nextInt();
		
		System.out.println("Enter a String : ");
		String s2 = sc.next();
				
		String s1 = "12345";
		System.out.println(s1+6);
		int n1 = Integer.parseInt(s1);
		System.out.println(n1);
		
		//nested Exception
		try {
			try {
				int c = a/b;
				System.out.println(c);
			}
			catch(Exception e){
				System.out.println("Invalid number");
			}
			int n2 = Integer.parseInt(s2);
			System.out.println(n2);
		}
		catch(Exception e){
			System.out.println("Invalid String");
		}
		finally {
			System.out.println("Program printed");
		}

	}

}
