package Collection;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack <String> s=new Stack<String>();
   
   
   s.push("rohan");
   s.push("pushpa");
   s.push("chaman");
   s.push("naveen");
   s.push("kumar");
   System.out.println(s);
   System.out.println("............................");
   
   s.pop();
   System.out.println(s);
   
   s.pop();
   System.out.println(s);
   
   
   System.out.println(s.search("pushpa"));
   
   System.out.println(s.empty());

		s.peek();
      System.out.println(s);
   
	}

}
