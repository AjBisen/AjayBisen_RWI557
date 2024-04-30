package hello;
class A{
	int a=23;
}
 class B extends A{
	 
	 int a=34;
	 void show(int a) {
		
	 System.out.println(a);         //............67
	 System.out.println(this.a);   //.............34
	 System.out.println(super.a); //..............23
	  
	       }
   
     }
 
 
public class SuperKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B b=new B();
         b.show(67);
	 
         
	   }

 }
