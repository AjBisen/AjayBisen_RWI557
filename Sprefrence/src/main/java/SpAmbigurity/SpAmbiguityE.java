package SpAmbigurity;

public class SpAmbiguityE {
private int a;
private int b;

public SpAmbiguityE(int a, int b) {
	this.a=(int) a;
    this.b=(int )	b;
 System.out.println("Constructor int ... int");
}

public SpAmbiguityE(double a, double b) {
	this.a=(int) a;
    this.b=(int )b;
 System.out.println("Constructor double ... double");
 
}


public SpAmbiguityE(String a, String b) {
	this.a=Integer.parseInt (a);
	this.a=Integer.parseInt (b);
	
 System.out.println("Constructor String ... String");
}

     
public void Sun() {
	System.out.println("Sum numkber"+(this.a + this.b));
}


}
