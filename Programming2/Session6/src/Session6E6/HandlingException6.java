package Session6E6;

import java.util.Scanner;

public class HandlingException6 {

	public static void main(String[] args) {
		
		
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
				try {
					
					throw new AtemptingNumber();
				}
				catch(AtemptingNumber e1) {
					e1.incNumAttemp();
				}
			//
		}
		catch(ResultZero e) {
			String s = e.getMessage();
			System.out.println(s);
		}
		finally {
			System.out.println("program done");
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

class AtemptingNumber extends Exception{
	
	private int numberofAttempt = 0 ;
	private static int MAximumallowed = 5;
	
	
	public AtemptingNumber() {
		numberofAttempt = 0 ;
	}
	
	public AtemptingNumber(String s) {
		super(s);
		numberofAttempt = 0 ;
	}
	
	
	public int getNumberofAttempt() {
		return numberofAttempt;
	}
	
	public void incNumAttemp() {
		
		Scanner kb = new Scanner(System.in);
		double d1;
		double d2;
		
		numberofAttempt++;
		
		if(numberofAttempt >= MAximumallowed ) {
			System.out.println("you are reach the maximum , no more attemt");
			System.exit(0);
		}
		else {
			System.out.println("you have entered" + numberofAttempt + "times ");
			System.out.println("Please enter two values ");
			d1 = kb.nextDouble();
			d2 = kb.nextDouble();
			try {
				HandlingException6.divide(d1 , d2);
			}
			catch(DivideByZeroException e) {
				String s = e.getMessage();
				System.out.println(s);
				try {
					throw(this);
				}catch(AtemptingNumber e2) {
					
					e2.incNumAttemp();
				}
	
			}
			catch(ResultZero e) {
				String s = e.getMessage();
				System.out.println(s);
			}
			
			
		}
	}

}


