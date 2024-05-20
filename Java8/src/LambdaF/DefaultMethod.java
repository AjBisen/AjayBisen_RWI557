package LambdaF;
interface Parenttt{
	default void H() {
		
		System.out.println("Railworld");
	}
}

class Childt implements Parenttt{
	
}
public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childt c=new Childt();
		c.H();
		
	}

}
