package Collection;
import java.util.ArrayList;
import java.util.Iterator;  
import java.util.List;
import java.util.ListIterator;
public class ItreratorMethod {
	static int  i=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List i=new ArrayList();
		i.add(12);
		i.add(13);
		i.add(14);
		i.add(15);
		i.add(16);
		System.out.println(i);
		
		
		
	//	i.iterator();
//		i.listIterator();
//		System.out.println(i);
		
	Iterator itr=i.iterator();
	while(	itr.hasNext()) {
		System.out.println(itr.next());
	}
		
	
	ListIterator li= i.listIterator();
	System.out.println(li.next());

	
	}

}
