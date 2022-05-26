package Session6E1;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		double d1;
		double d2;
		
		System.out.print("Please enter two values ");
		d1 = kb.nextDouble();
		d2 = kb.nextDouble();
		
		//divide1(d1,d2);
		try {
			divide2(d1,d2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			String s = e.getMessage();
			System.out.print(s);
		}
		
		
	}
	
	
//	public static double divide1(double x , double y ) {
//		double result = x/y;
//		System.out.println(result);
//		return result;
//	}
	
	public static void divide2(double x , double y) throws Exception{
		double result;
		
	
			if(y == 0)
				throw new Exception("this is exception result");
			else {
				result = x/y;
				System.out.println(result);
				
			}
		}
		
		
	}	
	

class divisionException extends Exception{
	
	public divisionException() {
		super("this is first constructor");
	}
	
	public divisionException(String s) {
		super(s);
	}
	
}



