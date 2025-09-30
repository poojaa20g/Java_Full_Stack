package day6_loops;
import java.util.Scanner;

public class pattern1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = s.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=n;k>i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i=n;i>=-n;i--) {
			for(int j=n;j>=Math.abs(i);j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
