package LambdaF;
import java.util.function.Predicate;
public class Predicatee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Integer> pre= x -> x > 100;

Predicate<String >pree= x-> x.toLowerCase().charAt(0)=='v';


        System.out.println(pree.test("Hello"));
        System.out.println(pre.test(10000));
	}

}
