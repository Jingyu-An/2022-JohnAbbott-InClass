package Session5E3;

class A implements Inter1, Inter2
{
	public void fun1()
	{
		System.out.println("fun1 Defined!");
	}
	
	public String fun2()
	{
		return ("Greetings from fun2!");
	}
	
	public void fun3()
	{
		System.out.println("Defined fun3 as well!");
	}
	
	public void DisplayVal()
	{
// System.out.println("x is: " + x); // This would be ambiguous and
                                     // won't compile
		System.out.println("x from Inter1 is: " + Inter1.x);
		System.out.println("x from Inter2 is: " + Inter2.x);
		System.out.println("d is: " + d);    // This is okay as there is no ambiguity here 
		
	}
}


