package Session8E1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		PrintWriter pw = null;
		
		try {
			 pw  = new PrintWriter(new FileOutputStream("test.txt")); 
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("file didnt found");
			System.exit(0);
			
		}
		
		System.out.println("Give me your name?");
		String n = kb.nextLine();
		
		pw.println(n);
		
		System.out.println("Give me your address?");
		String a =  kb.nextLine();
		
		pw.println(a);
		
		
		pw.close();
		
	}

}
