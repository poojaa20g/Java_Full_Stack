package day6_loops;
import java.util.Scanner;

public class Jump_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			if(i==5) {
				continue;
			}
			if(i==7) {
				break;
			}
			else {
				System.out.println(i);
			}
		}

	}

}
