package day8_Strings;
import java.util.Scanner;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		char [] c = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			c[i] = str.charAt(i);
		}
		
		boolean[] visited = new boolean[c.length];
		for(int i=0;i<c.length;i++) {
			if(visited[i]==true) {
				continue;
			}
			int count = 0;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(c[i]+"->"+count);
		}
	}

}
