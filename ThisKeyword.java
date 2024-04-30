package hello;

public class ThisKeyword {
	
	int x=10;
	void show(int x) {
		this.x=x;        
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword th=new ThisKeyword();
           System.out.println("value of x=>  "   +th.x);				
		
	}

}
