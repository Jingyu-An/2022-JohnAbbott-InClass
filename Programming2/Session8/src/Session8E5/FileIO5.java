package Session8E5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintWriter pw = null;
		Scanner kb = new Scanner(System.in);
		Scanner sc = null;
		
		System.out.println("Give me the name of the file you want to make a copy of?");
		String s1 = kb.next();
		
		System.out.println("what is the name of the file you want to create?");
		String s2 = kb.next();
		
		
		try {
			
			sc = new Scanner(new FileInputStream(s1));
			pw = new PrintWriter(new FileOutputStream(s2));
		
			
		}catch(FileNotFoundException e){
			
			System.out.println("there is a problem");
			System.exit(0);
		}
		
		copyFile(sc , pw);

	}
	
	
	public static void copyFile(Scanner s , PrintWriter p) {
		String str;
		
		while(s.hasNextLine()) {
			str = s.nextLine();
			p.println(str);
		}
		s.close();
		p.close();
	}

}
