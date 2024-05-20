package LambdaF;

public class LambdThreada {

// LambdThreada
	
	public static void main(String[] args) {
		
		Runnable run= ()->{
			
			for(int i=1; i<10; i++) {
				
				System.out.println("Bye"+i);
			}
		};
		     
		
		Thread thread=new Thread(run);
		thread.run();
		
		
	}

}
