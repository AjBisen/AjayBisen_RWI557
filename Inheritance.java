package hello;

public class Inheritance {

	// Superclass
	    void eat() {
	        System.out.println("Animal is eating.");
	    }
	}

	class Dog extends Inheritance {
	    void bark() {
	        System.out.println("Dog is barking.");
	    }
	

//	public class Main {
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.eat(); 
	        dog.bark(); 
	        
	    }
	}

