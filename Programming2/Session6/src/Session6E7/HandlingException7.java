package Session6E7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingException7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		double d1 = 0;
		double d2 = 0;
		boolean done = false;
		boolean valueisNumber = true;
		
		while(!done) {
			
			while(!valueisNumber) {//if the vlue is letter or not
				
				try {
					System.out.println("put 2 num");
					d1 = kb.nextDouble();
					d2 = kb.nextDouble();
					valueisNumber = true;
					
				}catch(InputMismatchException e) {
					kb.nextLine();
					System.out.println("Not a number Try again : ");
				}
			}
				try { // 0/something or something /0
					divide(d1 , d2);
					done = true; 
					
				}catch(ResultZero e) {
					String s =  e.getMessage();
					System.out.println(s);
					valueisNumber =false;
					
				}catch(DivideByZeroException e) {
					String s =  e.getMessage();
					System.out.println(s);
					valueisNumber =false;
				}
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
