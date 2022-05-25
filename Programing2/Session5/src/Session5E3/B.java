package Session5E3;

class B implements Inter2, Inter3
{
	public void fun3()
	{
		System.out.println("I can define fun3 for my both interfaces! ");
	}
}

/* This call cannot implement Inter3 and Inter4 as these are inconsistent interfaces
class C implements Inter3, Inter4
{
	public int fun3()
	{
		System.out.println("I can define fun3 for my both interfaces! ");
		return 10;
	}
	
}
*/
