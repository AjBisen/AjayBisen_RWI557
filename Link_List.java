package World;

import java.util.LinkedList;
public class Link_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> name =new LinkedList<String>();
		
		name.add("sage");
		name.add("ips");
		name.add("Medicaps");
		
		System.out.println(name);
		
		
		name.addFirst("vaishu");
		name.addLast("diviya");
		
		System.out.println(name);
		name.set(4,"ddd");
		
		System.out.println(name);
		System.out.println(name.contains("ajju"));

       name.remove();
       System.out.println(name);
       
       name.remove();
       System.out.println(name);
       
		
	}

}
