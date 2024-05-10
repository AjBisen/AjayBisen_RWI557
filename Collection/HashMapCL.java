package Collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap  hm=new HashMap();
  hm.put(12, "Indore");
  
  hm.put(13, "Raipur");
  
  hm.put(14, "Bhopal");
  
  hm.put(15, "Balaghat");
  
  hm.put(16, "Jabalpur");
  
  
  System.out.println(hm);
   
  Set  set=hm.entrySet();
  System.out.println(set);


        
		}

}
