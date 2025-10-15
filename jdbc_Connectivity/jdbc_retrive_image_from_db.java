package jdbc_Connectivity;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;
public class jdbc_retrive_image_from_db {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poojaa","root","mysql");
		
		// to executeQuery
		PreparedStatement ps = con.prepareStatement("select image_data from image_table where i_id = ?");
		ps.setInt(1, 1);
		ResultSet rs = ps.executeQuery();
		
		// set folder path
		String outputPath = "C:\\retrived_image\\";
		
		// if available in rs
		if(rs.next()) {
			
			// get the image as bytes and store it in image_date byte array
			byte[] image_data = rs.getBytes("image_data");
			
			// concatenate the new file name with the folder path
			String image_path = outputPath+"extractedImage.jpg";
			
			// outputStream used to write into the file
			OutputStream outputStream = new FileOutputStream(image_path);
			outputStream.write(image_data);
			System.out.println("Image extracted");
		}
		else {
			System.out.println("Image not found");
		}
		
	}

}
