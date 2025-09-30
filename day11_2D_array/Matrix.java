package day11_2D_array;
import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row size of matrix1 :");
		int r1 = sc.nextInt();
		System.out.println("Enter the column size of matrix1 :");
		int c1 = sc.nextInt();
		System.out.println("Enter the row size of matrix2 :");
		int r2 = sc.nextInt();
		System.out.println("Enter the column size of matrix2 :");
		int c2 = sc.nextInt();
		
		int arr1[][] = new int[r1][c1];
		int arr2[][] = new int[r2][c2];
		int add[][] = new int[r1][c1];
		int mul[][] = new int[r1][c2];
		int transpose[][] = new int[c1][r1];
		
		System.out.println("Enter the elements :");
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				arr1[i][j] = sc.nextInt();
			}
			//System.out.println("\n");
		}
		
		System.out.println("Enter the elements :");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				arr2[i][j] = sc.nextInt();
			}
			//System.out.println("\n");
		}
		
		System.out.println("Addition");
		if(r1==r2 && c1==c2) {
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c2;j++) {
					add[i][j] = arr1[i][j]+arr2[i][j];
					System.out.print(add[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
		else {
			System.out.println("Enter correct values");
		}
		
		System.out.println("Multiplication");
		if(c1 == r2) {
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<c1;k++) {
				mul[i][j] += arr1[i][k]*arr2[k][j];
				
			    }
			}
		}
		
	}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(mul[i][j] +" ");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				transpose[j][i] = arr1[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Transpose");
		for(int i=0;i<c1;i++) {
			for(int j=0;j<r1;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
