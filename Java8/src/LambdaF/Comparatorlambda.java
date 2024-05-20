package LambdaF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparatorlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<>();
		list.add(12);
		list.add(21);
		list.add(51);
		list.add(61);
		list.add(71);
		list.add(81);
		list.add(1);
		Collections.sort(list,  (a, b) -> b-a);//Lambda
		System.out.println(list);
		
		

	}

}
