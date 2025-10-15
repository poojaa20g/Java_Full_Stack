package jdbc_Connectivity;
import java.io.*;
import java.sql.*;

public class jdbc_image_handling {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		// register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poojaa","root","mysql");
		
		
		// specify image path 
		File imageFile = new File("C:\\Users\\DELL\\Downloads\\Krishna_image.jpg");
		
		// to store the image as binary data
		FileInputStream inputStream  = new FileInputStream(imageFile);
		
		byte[] imageData = new byte[inputStream.available()]; // available method is used to specify the required length that the array should be created to store the iputstream data
		
		inputStream.read(imageData);
		
		// Prepared Statement to execute insert query
		PreparedStatement image_ps = con.prepareStatement("insert into image_table(image_data)values(?)");
		
		// set image data for that setBinaryStream is used
		
		//image_ps.setBinaryStream(1, inputStream, (int) imageFile.length());
		image_ps.setBytes(1, imageData);
		
		// execute the Query
		
		int rowsAffected  = image_ps.executeUpdate();
		
		// if inserted successfully it will return 1 or number greater than 1 to insert multiple statements so it is checked > 0 or not
		
		if(rowsAffected > 0) {
			System.out.println("Image stored sucessfully");
			
		}
		else {
			System.out.println("failed");
		}
		
		

	}

}
