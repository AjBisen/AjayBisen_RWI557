package World;
import java.util.ArrayList;
public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
				
				ArrayList<String> name=new ArrayList<String>();
						
						name.add("mohan");
						name.add("rohan");
						name.add("ramm");
						name.add("kanak");
				        name.add("Aman");
						System.out.println(name);
						
						name.add("sonam");
						System.out.println(name);
						
						name.set(1,"ajju");
						System.out.println(name);
						
						name.remove(3);
						System.out.println(name);
						
						name.clear();
						System.out.println(name);
					
						name.removeAll(name);
						System.out.println(name);
						
						name.clone();
						System.out.println(name);

					}

				}
