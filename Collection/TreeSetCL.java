package Collection;
import java.util.TreeSet;
public class TreeSetCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet ts=new TreeSet();

                 ts.add(65);
                 ts.add(22);
                 ts.add(44);
                 ts.add(78);
                 ts.add(10);
                 ts.add(13);
                 System.out.println(ts);
                 
                 
                 ts.comparator();
                 System.out.println(ts);
                 
                 ts.remove(22);
                 System.out.println(ts);
                 
                 ts.clear();
                 System.out.println(ts);
                 
                 
	}

}
