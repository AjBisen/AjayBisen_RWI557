package hello;

public class StringBulderExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StringBuilder sb=new StringBuilder();    
			System.out.println(sb.capacity());    
			sb.append("Hello");    
			System.out.println(sb.capacity());   
			sb.append("Java is my favourite language");    
			System.out.println(sb.capacity());//formula (16*2)+2=34 i.e (oldcapacity*2)+2    
			}    
}
