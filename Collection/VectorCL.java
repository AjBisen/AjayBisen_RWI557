package Collection;
import java.util.Vector;

public class VectorCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
      v.add(5343);
      v.add("Name");
      v.add(23.43);
      v.add("Indore");
      System.out.println(v);
      System.out.println("....................................");
      
      
      System.out.println(v.firstElement());
      System.out.println(v.lastElement());
      System.out.println(v.capacity());
      System.out.println(v.removeElement("Indore"));
      
      System.out.println(v.elementAt(2));


		
	}

}
