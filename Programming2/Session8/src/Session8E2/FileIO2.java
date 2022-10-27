package Session8E2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		PrintWriter pw = null;
//		File f = new File("/Users/pargol/dev/Session-8/nupur/pargol.txt");
//		
//		if(f.exists()) {
		
			
			try {
				 pw  = new PrintWriter(new FileOutputStream("nupur/pargol.txt")); 
			}
			
			catch(FileNotFoundException e)
			{
				System.out.println("file didnt found");
				System.exit(0);
				
			}
			
			System.out.println("Give me your name?");
			String n = kb.nextLine();
			
			pw.println("Name is: " + n);
			
			System.out.println("Give me your address?");
			String a =  kb.nextLine();
			pw.println("Address is  : " + a);
			
			
			System.out.println("Give me your school name?");
			String sn =  kb.nextLine();
			pw.println("School name is  "+sn);
			
			
			pw.close();
		
		}
//		
//		else {
//			System.out.println("file didnt found");
//		}
//	
//	}

}
