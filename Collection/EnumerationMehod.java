package Collection;
import java.util.Enumeration;
import java.util.Vector;


public class EnumerationMehod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Vector<Comparable> v=new Vector<Comparable>();
         v.add(2321);
         v.add("Railworld");
         v.add("Company");
//         System.out.println(v);
         
         
         
         Enumeration<Comparable> e=v.elements();
         
         
         
         while(e.hasMoreElements()){
        	 System.out.println(e.nextElement());
         }
 
	}

}
