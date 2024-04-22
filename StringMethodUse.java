package hello;

public class StringMethodUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String str = "Hello, World!";
		        
		        int length = str.length();
		        System.out.println("Length of the string: " + length);
		        
		        String upperCaseStr = str.toUpperCase();
		        System.out.println("Uppercase string: " + upperCaseStr);
		        
		        String lowerCaseStr = str.toLowerCase();
		        System.out.println("Lowercase string: " + lowerCaseStr);
		        
		        boolean containsHello = str.contains("Hello");
		        System.out.println("Does the string contain 'Hello'?: " + containsHello);
		        
		        String substring = str.substring(7);
		        System.out.println("Substring from index 7: " + substring);
		        
		        String replacedStr = str.replace('l', 'z');
		        System.out.println("String after replacing 'l' with 'z': " + replacedStr);
		        
		        String[] splitStr = str.split(",");
		        System.out.println("Splitting the string by comma:");
		        for (String s : splitStr) {
		            System.out.println(s);
		        }
		        
		        String stringWithSpaces = "   Trim me   ";
		        String trimmedStr = stringWithSpaces.trim();
		        System.out.println("String after trimming: '" + trimmedStr + "'");
		    }
		}

