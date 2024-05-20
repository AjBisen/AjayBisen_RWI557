package LambdaF;

	
public class Interfacee implements A, B {

	public static void main(String[] args) {
		Interfacee in=new Interfacee();
				in.Say();
	}

	@Override
	public void Say() {
		// TODO Auto-generated method stub
		A.super.Say();
	}

	}


