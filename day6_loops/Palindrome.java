package day6_loops;
import java.util.Scanner;
public class Palindrome {
	
	

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String n = s.nextLine();
		String ans = "";
		
		for(int i=n.length()-1;i>=0;i--) {
			ans=ans+n.charAt(i);
		}
		System.out.println("original :"+n);
		System.out.println("reverse :"+ans);
		
		if(n.equals(ans)) {
		
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
