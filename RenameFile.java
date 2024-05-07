package World;
import java.nio.file.*;
import java.io.File;
import java.io.IOException; 
  
public class RenameFile {		
		    public static void main(String[] args) {
		    	//rename				
		          File file=new File("C:\\Users\\hp\\desktop\\ff.txt");
		          
		          File rename=new File("C:\\Users\\hp\\desktop\\Railworld.txt");
		          
		          if(file.exists()){
					 
					     System.out.println(file.renameTo(rename)+" successfully changed name ");
	
					 }
					 
					 
					 else {
					     System.out.println("File doest not exits");
					 }
				}
		}
					 