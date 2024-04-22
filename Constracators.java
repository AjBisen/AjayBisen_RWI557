package hello;

public class Constracators {
		
		String name;
		int id;
		
		Constracators(String name,int id){
			
			this.id=121;
			this.name="railword";
			
		}
	public static void main(String args[]) {
		 
		Constracators con=new Constracators("railwiold",123);
		System.out.println(con.id);
		System.out.println(con.name);
		
	}

	}