package jdbc_Connectivity;

// step 1 import packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		// step 2 register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step 3 Open Connection
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/poojaa","root","root");
		
		// step 4 create statement
		// Prepared statement is used for insert
		
		PreparedStatement ps_ins1 = con.prepareStatement("insert into employee (ename,job_desc,salary,br_id) values(?,?,?,?)");
		ps_ins1.setString(1, "Ganesh");
		ps_ins1.setString(2, "Analyst");
		ps_ins1.setInt(3, 500000);
		ps_ins1.setInt(4, 1);
		
				
		ps_ins1.executeUpdate();
		
		// Prepared statement is used for update
		
		PreparedStatement ps_up = con.prepareStatement("Update employee set ename=? where id=?");
		ps_up.setString(1, "Durga");
		ps_up.setInt(2, 5);
		ps_up.executeUpdate();
		
		// Prepared statement is used for delete
		
		PreparedStatement ps_del = con.prepareStatement("delete from employee where id=?");
		ps_del.setInt(1, 15);
		ps_del.executeUpdate();
		
			
				
		Statement st = con.createStatement();
		
		// statement is used for select Query
		ResultSet rs = st.executeQuery("select * from employee");
		System.out.println("Id"+"\t"+"Name"+"\t"+"Job"+"\t"+"Salary"+"\t"+"Branch_Id");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5));
		}
		
		
		


	}

}

