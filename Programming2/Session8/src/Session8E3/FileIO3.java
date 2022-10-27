package Session8E3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner kb = null;
		
		PrintWriter pw = null;
		
		try {
			kb  = new Scanner(new FileInputStream("test.txt"));
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("file didnt found");
			System.exit(0);
			
		}
		
		String s = kb.nextLine();
		System.out.println(s);
		
		String s2 = kb.nextLine();
		System.out.println(s2);
		
	}

}
