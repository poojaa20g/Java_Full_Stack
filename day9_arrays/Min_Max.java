package day9_arrays;

import java.util.Scanner;

public class Min_Max {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length :");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The array values");
		int max = a[0];
		int min = a[0];
		for(int no:a) {
			System.out.println(no);
			if(max <= no) {
				max=no;
			}
			else if(min > no) {
				min=no;
			}
		}
		System.out.println("Max value :"+max);
		System.out.println("Min value :"+min);
	}

}
