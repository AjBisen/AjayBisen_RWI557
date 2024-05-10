package Collection;


import java.util.ArrayList;
public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();

		
		al.add("ronam");
		al.add("IPS");
		al.add("SAGE");
		al.add("SAGAR");
		al.add("MEDICAPS") ;
		System.out.println(al);

		System.out.println(al.add("name"));	
		System.out.println(al);
		System.out.println(al.contains("IPS"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());

		al.remove(1);
		System.out.println(al);
		
		al.add(2,"sonam");
		System.out.println(al);
		
//		al.clear();
//		System.out.println(al);

//		ArrayList<String> al2=new ArrayList<String>();
//        al2.addAll("aaa");
//        System.out.println(al2);

	}

}
