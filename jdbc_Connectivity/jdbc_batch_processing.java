package jdbc_Connectivity;
import java.sql.*;
import java.util.*;

public class jdbc_batch_processing {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poojaa","root","mysql");
		
		// disable the auto commit
		con.setAutoCommit(false);
		
		// create Statement
//		Statement st = con.createStatement();
//		st.addBatch("insert into employee (eid,ename,job,salary) values (7,'Ganesh','HR',500000)");
//		st.addBatch("insert into employee (eid,ename,job,salary) values (8,'Veera','CEO',600000)");
//		st.addBatch("insert into employee (eid,ename,job,salary) values (9,'Muthu','HR',500000)");
//		st.addBatch("insert into employee (eid,ename,job,salary) values (10,'Arun','CEO',500000)");
//		st.addBatch("insert into employee (eid,ename,job,salary) values (11,'Sundar','Analyst',500000)");
//		st.addBatch("insert into employee (eid,ename,job,salary) values (12,'Govind','HR',500000)");
//		st.executeBatch();
//		con.commit();
//		System.out.println("Batch Processing was successful");
		
		PreparedStatement ps_ins = con.prepareStatement("insert into employee(ename,job,salary) values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Enter the name: ");
			String name = sc.nextLine();
			System.out.print("Enter the job: ");
			String job = sc.nextLine();
			System.out.print("Enter the salary: ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			
			ps_ins.setString(1, name);
			ps_ins.setString(2, job);
			ps_ins.setInt(3, salary);
			
			ps_ins.addBatch();
			
			
			System.out.println("Add more values Y/N: ");
			String decision = sc.nextLine();
			
			if(decision.toUpperCase().equals("N")) {
				break;
			}
			
		}
		
		int[] BatchResults = ps_ins.executeBatch();
		con.commit();
		System.out.println("Batch processing was successful");
		
		
		
		

	}

}
