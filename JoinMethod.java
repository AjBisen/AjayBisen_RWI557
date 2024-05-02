package hello;

public class JoinMethod extends Thread {
	
	public void run() 
    { 
        for (int i = 0; i < 2; i++) 
        { 
            try
            { 
//                Thread.sleep(1000); 
                
                System.out.println(" Thread: class " + Thread.currentThread().getName()); 
            } 
  
            catch(Exception ex) 
            { 
               System.out.println("Railworld" + ex); 
            	
            } 
            System.out.println(i); 
        } 
    } 

    public static void main (String[] args) 
    { 
      	JoinMethod t1 = new JoinMethod(); 
    	JoinMethod t2 = new JoinMethod(); 
    	JoinMethod t3 = new JoinMethod(); 
  
        t1.start(); 
        t2.start();
         try
        { 
            System.out.println("Current Thread: " + Thread.currentThread().getName()); 
            t1.join();
            t2.join();
        } 
        catch(Exception ex) 
        { 
//            System.out.println("thread////////" + ex); 
        } 
           t3.start();
         
      
//         
//          t2.start(); 
//          try
//        { 
//            System.out.println("Current Thread: "
//                 + Thread.currentThread().getName()); 
//            t2.join(); 
//        } 
//  
//        catch(Exception ex) 
//        { 
//            System.out.println(" Thread....      " + ex); 
//        } 
//  
//        t3.start(); 
    } 
} 
