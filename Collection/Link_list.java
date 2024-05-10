package Collection;

import java.util.LinkedList;

public class Link_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> ll = new LinkedList<String>(); 
		
		ll.add("AAAA");
		ll.add("BBBB");
		ll.add("CCCC");
		ll.add("DDDD");
		System.out.println(ll);
		
		
        ll.addFirst("ZZZZ");
	 	 System.out.println(ll);

		 
		  ll.addLast("YYYY");
			System.out.println(ll);
			
			 
			 ll.remove("YYYY");
			   System.out.println(ll);
			
			  
		    	ll.removeFirst();
			      System.out.println(ll);
			
			     
			     ll.size();
			        System.out.println(ll);


		        	 ll.clear();
		        	 	System.out.println(ll);

		        		
			        	  ll.contains("YYYY");
				          	 System.out.println(ll);
			  
//				        	
//			     ll.get(3);
//				 System.out.println(ll);
//					    ll.peekFirst();
//					   	 System.out.println(ll);
//	
				        	
				        	
				        	
	}

}
