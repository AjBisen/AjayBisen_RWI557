package hello;
class Test{
	static void show() {
		
		System.out.println("Dispaly Method");
	}
}
class Tes{
	static void show() {
		
		System.out.println("Dispaly Method.........");
	}
}


    public class StaticMethod {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//		Test ts=new Test();
		
		
	    Test.show();   //static method ka object nahi banta class ke name se method call ki jaati hai  
	    Tes.show();
    	  
	        }
  
	
     }
  
