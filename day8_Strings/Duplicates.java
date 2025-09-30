package day8_Strings;
import java.util.Scanner;
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		String result = "";
		String duplicate="";
		for(int i=0;i<str.length();i++) {
			char current = str.charAt(i);
			boolean found = false;
			
			for(int j=0;j<result.length();j++) {
				if(result.charAt(j)==current) {
					found=true;
					break;
				}
			}
			if(!found) {
				result+=current;
			}
			else {
				if(duplicate.indexOf(current)==-1) {
				duplicate+=current;
				}
			}
		}
		System.out.println("Original String :"+str);
		System.out.println("Non duplicate String :"+result);
		System.out.println("Duplicates are :"+duplicate);
	}

}
