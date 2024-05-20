package Jdbc;




public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
  Class.forName("com.mysql.cj.jdbc.Driver");
	}
		catch(Exception e) {
			
		System.out.println("Drive Class......"+e);
		}
		System.out.println("connection succes");
		}
}
