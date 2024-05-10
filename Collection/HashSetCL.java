package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add("sohan");
		al.add("Aman");
		
       HashSet hs=new HashSet();
	
        hs.addAll(al);
		hs.add("AAAAAA");
		hs.add("BBBBBB");
		hs.add("CCCCCC");
		hs.add("DDDDDD");
		hs.add(11111111);
		hs.add(22222222);
		
		
		System.out.println(hs);
		System.out.println(hs.size());
		hs.remove("sohan");
		
		
		   Iterator itr=hs.iterator();
		    while(itr.hasNext()) {
			   System.out.println(itr.next());

			
		}

	}

}
