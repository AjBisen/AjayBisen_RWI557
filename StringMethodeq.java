package hello;

public class StringMethodeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//== method check refrence scp memory
		String sb1="railwoid";
		String sb2=new String("Railwoid");
		//check value.........
//		if(sb1==(sb2)) {
//			System.out.println("true");
//			
//		}
//		else {
//			System.out.println("false");
//
//			
//		}
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

		
		

		
	}

}
