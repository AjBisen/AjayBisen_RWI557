 package hello;

public class SleepMethod extends Thread {
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("Railworld");
		
		
		try {
			
			Thread.sleep(2000);
			
//			Thread.yield();
	}
		catch(Exception e) {
			e.getSuppressed();
		}
			System.out.println(i);
		
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepMethod am=new SleepMethod();
//		SleepMethod am1=new SleepMethod();

		am.start();
//		am1.start();

	}

}
