package Session8E4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO4 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner kb = null;
		Scanner kb2 = new Scanner(System.in);
		long id;
		String s;
		
		PrintWriter pw = null;
		
		
		System.out.println("How many student you want to print");
		int num = kb2.nextInt();
		int i = 0 ;
		
		
		try {
			kb  = new Scanner(new FileInputStream("test1.txt"));
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("file didnt found");
			System.exit(0);
			
		}
		
		kb.nextLine();
		
//		long si1 = kb.nextLong();
//		System.out.println(si1);
//		
//		kb.nextLine();
//		
//		long si2 = kb.nextLong();
//		System.out.println(si2);
//		
//		
//		kb.nextLine();
//		
//		long si3 = kb.nextLong();
//		System.out.println(si3);
		
		
		while(kb.hasNextLine() && i < num) {
			id = kb.nextLong();
			s = kb.nextLine();
			System.out.println(id);
			i++;
			
		}
		
	}

}
