package day9_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length :");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		
		//inbuilt method
		Arrays.sort(a);
		System.out.println("Using inbuilt method");
		for(int no:a) {
			System.out.println(no);
		}
		
	
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Using manual logic");
		for(int no:a) {
			System.out.println(no);
		}
		
	}

}
