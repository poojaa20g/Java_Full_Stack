package day10_search;
import java.util.*;
public class Binary_search {
	
	public static int binarySearch(int[]arr,int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key){
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n=sc.nextInt();
		System.out.println("Enter the sorted array :");
		int []a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched :");
		int key = sc.nextInt();
		int result = binarySearch(a,key);
		if(result == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at : "+result);
		}
	}

}






