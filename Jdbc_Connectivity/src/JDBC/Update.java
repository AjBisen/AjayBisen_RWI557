package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	
	
	    private static final String url = "jdbc:mysql://localhost:3306/Railworld";
	    private static final String name = "root";
	    private static final String password = "root";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
  Class.forName("com.mysql.cj.jdbc.Driver");
	}
		catch(Exception e) {
			
		System.out.println("Drive Class......"+e);
		
		}
		
		System.out.println("Connection Created");	
				
		 try {
	            Connection connection = DriverManager.getConnection(url, name, password);
	            Statement statemenet=connection.createStatement();
	            
//	            String query= "select * from Rail";
	            String query= String.format ("INSERT INTO Rail(LastName, FirstName, Address ,  City)"
	            		+ " VALUES('%s' ,'%s' , '%s'  , '%s')","Sanjay" ,"Panday", "Indore silicon", "indore" );
	                     
	     
//	            ResultSet resultSet = statemenet.executeQuery(query);
	            
	            //Update
	           int rowsAffected = statemenet.executeUpdate(query);
	           if(rowsAffected>0) {
	        	   System.out.println("Data Sucesfully ");
	        	   
	           }
	           else {
	        	   System.out.println("Data is not Succesfully ");
	        	   
	           }
	           
	           
//                while(resultSet.next()) {               	
//                	String LastName =resultSet.getString(  "LastName");
//                	String FirstName =resultSet.getString(   "FirstName");
//                	String Address =resultSet.getString(      "Address");
//                	String City =resultSet.getString(          "City");
//                	
//                	System.out.println(LastName+     "IPS");
//                	System.out.println(FirstName+    "MEDICAPS");
//                	System.out.println(Address+      "ACROPLIS");
//                	System.out.println(City+         "SAGE");
//
//                	
//                }
//	            
                				
//	            String query = "SELECT name FROM users WHERE id = ?";
//	            PreparedStatement preparedStatement = connection.prepareStatement(query);
//	            preparedStatement.setInt(1, 1);
//	            ResultSet resultSet = preparedStatement.executeQuery();
//	            if (resultSet.next()) {
//	                String name = resultSet.getString("name");
//	                System.out.println("Name :- " + name);
//	            } else {
//	                System.out.println("Name not found!");
//	            }
	            
	            

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }

	    }
	}

