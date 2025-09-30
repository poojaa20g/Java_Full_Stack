package day10_search;
import java.util.*;
public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size :");
		int n=sc.nextInt();
		System.out.println("Enter the elements :");
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			 a[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be found :");
		int key = sc.nextInt();
		
		boolean found = false;
		
		for(int i:a) {
			if(i==key) {
				System.out.println("Element found at index :"+i);
				found = true;
				break;	
			}
		}
		if(!found) {
			System.out.println("Element not found");
		}
	}

}
