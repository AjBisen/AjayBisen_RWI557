package hello;

public class GruopThreadConstrutor extends  Thread {
	
	@Override
	public void run() {
		
		
		
		try {
			Thread.sleep(3000);
		System.out.println(Thread.currentThread()	.isAlive());
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	
		
		
		
		
		// TODO Auto-generated method stub
//		System.out.println(Thread.currentThread()	.getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GruopThreadConstrutor gtc=new GruopThreadConstrutor();
		
		 ThreadGroup tg1=new ThreadGroup("Parent Thread");
		 Thread tg2=new  Thread(tg1, gtc, "start");
		 tg2.start();
		 
		 Thread tg3=new Thread(tg1, gtc, "week");
		 tg3.start();
		 
		 Thread tg4=new Thread(tg1, gtc, "working");
		 tg4.start();
		 
		 System.out.println("Thread Group Name:........."+tg1.getName());
		 tg1.list();


//		Thread th1=new Thread(th,gth,"start);
//		Thread th2= new Thread();
		

		
		
		
	}

	
}
