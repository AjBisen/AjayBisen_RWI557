package Collection;
import java.util.Map;
import java.util.HashMap;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map m=new HashMap();
	
	m.put(121,"ajju");
	
	m.put(123,"Ajay");

	m.put(124,"Aman");

	m.put(125,"Gagan");
	
	m.put("null", "null"); 
	
	m.put("null", "Mohal");

	
	

	System.out.println(m);
	System.out.println("________________________________");
	
	
	System.out.println(m.containsKey(123));
	System.out.println(m.containsValue("Aman"));
    System.out.println(m.get(123));
    
    System.out.println(m.replace(123 ,"AAAA"));
    System.out.println(m.size());

	
	}

}
