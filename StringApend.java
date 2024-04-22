package hello;

public class StringApend {

	 public static void main(String[] args) {
	        // Create a StringBuilder object
	        StringBuilder sb = new StringBuilder("helloWord");
	        
	        // Append "java" to the StringBuilder object
	        sb.append("java");
	        
	        // Convert StringBuilder to String and print
	        System.out.print(sb.toString());
	    }
	}