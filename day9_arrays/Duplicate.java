package day9_arrays;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length :");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate value :"+a[i]);
				}
			}
		}
	}

}
