package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/Railworld","root","root");
		
		System.out.println("Driver Connected");
		
		String mobile = "12345";
 		
		PreparedStatement ps = con.prepareStatement("Delete from emp where mobile=?");
		ps.setString(1, mobile);
		int count = ps.executeUpdate();
		
		if(count>0) {
			System.out.println("Record Deleted Succesfully");
		}
		else {
			System.out.println("Record Already Deleted");
		}
		con.close();
		System.out.println("Connection Closed");

	}

}
