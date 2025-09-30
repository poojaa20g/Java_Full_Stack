package day13_Exception_Handling;
import java.util.Scanner;
public class Throws_throw {
	
	 static void employeeAge(int age)throws MyOwnException,ArithmeticException{
	
		if (age<0) {
			MyOwnException obj1= new MyOwnException("Age cant be negative");
			ArithmeticException obj2= new ArithmeticException("Hello");
			throw obj1;
		}
		else {
			System.out.println("Input is invalid");
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		try {
			employeeAge(age);
		}
		catch(MyOwnException e) {
			System.out.println(e);
		}
	}

}
