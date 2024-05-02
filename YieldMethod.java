package hello;

public class YieldMethod extends Thread{
	public void run() {
		for(int i=1;i<3;i++) {
	
		System.out.println(Thread.currentThread().getId()+    "Railworld");
		}
	}
	
//jiski privrty jyada hoti hai usko pahale print....
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldMethod ym=new YieldMethod();
		YieldMethod ym1=new YieldMethod();

		ym.start();      //0
		ym1.start();   
		
		for(int i=1;i<3;i++) {
          ym.yield();   //1
            System.out.println(Thread.currentThread().getId()+    "    Railworld_557");

		}
	}

}
