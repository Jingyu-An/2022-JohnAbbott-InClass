package Session6E5;

import java.util.Scanner;

public class EsxceptionHandling5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double d1;
		double d2;
		
		System.out.println("Please enter two values ");
		d1 = kb.nextDouble();
		d2 = kb.nextDouble();
		
		try {
			divide(d1 , d2);
		}
		catch(DivideByZeroException e) {
			String s = e.getMessage();
			System.out.println(s);
			System.out.println("try again one more time");
			try {
				System.out.print("Please enter two values ");
				d1 = kb.nextDouble();
				d2 = kb.nextDouble();
				divide(d1 , d2);
			}
				catch(DivideByZeroException e2) {
					String s2 = e2.getMessage();
					System.out.println(s2);
				}
				
				catch(ResultZero e2) {
					String s2 = e2.getMessage();
					System.out.println(s2);
				}
			
				finally {
					System.out.println(" terminated inside nested try and catch");
				}
			
		}
		
		catch(ResultZero e) {
			String s = e.getMessage();
			System.out.println(s);
		}
		
		
		finally {
			System.out.println("Program terminated Normally");
		}
		
		
	}
	
	
	
	public static double divide(double x , double y) throws  ResultZero ,DivideByZeroException
	{
	
		double result;
		if(x == 0) {
			throw new ResultZero();
		}else if(y == 0) {
			throw new DivideByZeroException("this is wrong you cant do divide by 0 Second constructor");
		}
		else {
			result = x/y;
			System.out.println(result);
			return result;
		}
		
	}

}


class DivideByZeroException extends Exception{
	
	public DivideByZeroException() {
		super("divide by zero is not ok (first constr)");
	}
	
	public DivideByZeroException(String s) {
		super(s);
	}
}

class ResultZero extends Exception{
	
	public ResultZero() {
		super("zero divide by anyything is zero (first const)");
	}
	
	public ResultZero(String s) {
		super(s);
	}
	
}

