package hello;

public class ThredDemo extends Thread {

	@Override
	public void run() {
		// TOO Auto-generated method stub	
		System.out.println("this is a thread class 1");	
}
	class ThredDm extends Thread{
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("this is a thread class 2");		
   }
	}	
//		public class Threadd{
			
 	public static void main  (String[] args) {
 		
 		ThredDemo dm=new ThredDemo();
 		dm.start();
 		
// 		ThredDm d= new ThredDe();
    ThredDm d = new ThredDemo().new ThredDm();
		d.start();
        	
	   }
	}
	
	


//		// TODO Auto-generated method stub
// 		ThredDemo th=new ThredDemo();
// 		Thread th1=new Thread(th);
// 		th1.run();
//}
//}

	

