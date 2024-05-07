package World;

import java.io.File;
import java.io.IOException;
import java.io.*;

public class FileH {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			//Create
			
			File f=new File("C:\\Users\\hp\\desktop\\ff.text");
			try {
				if(f.createNewFile()) {
					System.out.println("File Sucessfully Create");
				}
			else {
					System.out.println("File Already exist..");
				}
				
			}
		catch(IOException i)
			{
				System.out.println("Exception Handled..!");
						}
		
			//Method 
			
//							File f=new File("C:\\Users\\Dell\\desktop\\newcase.txt");
			
							if(f.exists())
							{
								System.out.println("File Name ="+f.getName());
								System.out.println("File Path="+f.getAbsolutePath());
								System.out.println("File write ="+f.canWrite());
								System.out.println("File length ="+f.length());
								System.out.println("File Read ="+f.canRead());								
								System.out.println("File Remove ="+f.delete());
								
						}else {
								
								System.out.println("File does not exist" );
							}						
		}
}
						
          
	
