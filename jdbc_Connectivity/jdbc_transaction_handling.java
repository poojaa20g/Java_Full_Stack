package jdbc_Connectivity;
import java.sql.*;

public class jdbc_transaction_handling {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		// register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// create connection 
		Connection con = null;
		PreparedStatement ps_ins1 = null;
		PreparedStatement ps_ins2 = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poojaa","root","mysql");
			
			// disable to auto commit
			con.setAutoCommit(false);
			
			
			
			
			// create prepared statement for update
			
//			PreparedStatement ps_withdraw = con.prepareStatement("Update accounts set balance = balance - ? where account_no = ?");
//			PreparedStatement ps_deposit = con.prepareStatement("Update accounts set balance = balance + ? where account_no = ?");
//			ps_withdraw.setDouble(1, 500);
//			ps_withdraw.setString(2, "account456");
//			int rowsAffected_withdraw = ps_withdraw.executeUpdate();
			
			// no error
//			ps_deposit.setDouble(1, 500);
//			ps_deposit.setString(2, "account456");	
			
			// error by giving wrong account_no then due to roll back the amount will not be taken even initially th amount is taken
//			ps_deposit.setDouble(1, 500);
//			ps_deposit.setString(2, "account123");
//			int rowsAffected_deposit = ps_deposit.executeUpdate();
//			
//			if(rowsAffected_withdraw>0 && rowsAffected_deposit>0) {
//				con.commit();
//				System.out.println("Transaction Successful");
//			}
//			
//			else {
//				con.rollback(); // go backs to the initial state and the amount is not taken
//				System.out.println("Transaction Failed");
//			}
			
			// checking roll back using insertion
			
			ps_ins1 = con.prepareStatement("insert into accounts values(?, ?)");
			ps_ins1.setString(1, "account912");
			ps_ins1.setDouble(2, 300.0);
			ps_ins1.executeUpdate();
			System.out.println("First insertion was successful");
			
			ps_ins2 = con.prepareStatement("insert into accounts values(?, ?)");
			ps_ins2.setString(1, "account512");
			ps_ins2.setDouble(2, 5000);
			ps_ins2.executeUpdate();
			System.out.println("Second insertion was successful");
			con.commit();
			System.out.println("Transaction committed successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Transaction failed: "+e.getMessage());
			
			try {
				if(con!=null) {
					con.rollback();
					System.out.println("Transaction rolled back");
				}
			}catch(SQLException ex) {
				System.err.println("Error during rollback: "+ ex.getMessage());
				
			}
		}
		
	
		
		
		
		
		
			
	}

}
