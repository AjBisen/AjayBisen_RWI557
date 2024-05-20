package LambdaF;

public class StaticMethod implements Static,A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		StaticMethod sm=new StaticMethod ();
		sm.Say();   //default method 

		Static.S();// interface name se hi call kar sakte hai only Static Method ko

	}

}
