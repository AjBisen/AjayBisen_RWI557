package LambdaF;

public class Anonymous  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpAnonymou emp=new EmpAnonymou() {

			@Override
			public String getSalary() {
				// TODO Auto-generated method stub
				return "100";
			}

			@Override
			public String getDesignature() {
				// TODO Auto-generated method stub
				return "Software";
			}
			
		};
		
			System.out.println(emp.getSalary());
			System.out.println(emp.getDesignature());

      }
}
