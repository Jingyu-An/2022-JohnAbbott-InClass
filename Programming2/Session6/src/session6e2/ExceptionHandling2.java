package Session6E2;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double d1;
		double d2;
		
		System.out.print("Please enter two values ");
		d1 = kb.nextDouble();
		d2 = kb.nextDouble();
		
		try {
			divide2(d1,d2);
		} catch (Exception e) {
			String s = e.getMessage();
			System.out.println(s);
		}
		
	}

	
	public static void divide2(double x , double y) throws Exception{
		double result;
		
	
			if(y == 0)
				throw new Exception("this is second constr");
			else {
				result = x/y;
				System.out.println(result);
				
			}
		
	}	
}
