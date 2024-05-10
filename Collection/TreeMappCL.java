package Collection;

import java.util.TreeMap;

public class TreeMappCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm=new TreeMap();
//		tm.put(1,"aa");
//		tm.put(2,"BB");
//		tm.put(3,"CC");
//		tm.put(4,"DD");
//		
//		System.out.println(tm);
		
		
		tm.put("aa",22);
		tm.put("BB",11);
		tm.put("CC",122);
		tm.put("DD",12);
		
		System.out.println(tm);

		System.out.println(tm.ceilingKey(22));
		

	}

}
