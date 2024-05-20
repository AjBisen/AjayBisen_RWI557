package LambdaF;
import java.util.ArrayList;
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> num = new ArrayList<Integer>();
		    num.add(5);
		    num.add(9);
		    num.add(8);
		    num.add(1);
		    num.forEach( (n) -> { System.out.println(n); } );
		  }
		}
	