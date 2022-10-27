package Session5E1;

abstract class Vehicle {
	
	protected int numOfDoors;
	protected double price;
	private long serialNum;
	private static long serialNumCtr = 1000;
	
	
	// Constructors
	public Vehicle()	// default constructor 
	{
		//System.out.println("Creating a vehicle default constructor");
		
		numOfDoors = 4;
		price = 10000;
		serialNum = serialNumCtr++;
	}
	
	public Vehicle(int nd, double pr)	
	{
		//System.out.println("Creating a vehicle  parameterized constructor");
		
		numOfDoors = nd;
		price = pr;
		serialNum = serialNumCtr++;
	}
	
	
	public Vehicle(Vehicle vec)	// copy constructor 
	{
		//System.out.println("Creating a vehicle copy constructor");
		
		numOfDoors = vec.numOfDoors;
		price = vec.price;
		serialNum = serialNumCtr++;		
	}
	
	public int getNumOfDoors()
	{
		return numOfDoors;
	}
	
	public void setNumOfDoors(int nd)
	{
		numOfDoors = nd;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double pr)
	{
		price = pr;
	}
	
	// Find out if that vehicle has a cheaper price than the passed vehicle 
	public boolean isCheaper(Vehicle v)
	{
		// Obtain the class names just for display purposes
		String s1 = this.getClass().toString(), s2 = v.getClass().toString();

		
		if(getPrice() < v.getPrice())
		{
			
			System.out.println("The price of  " + s1 + " cheaper than " +s2);
			return true;
		}
		else
		{
			System.out.println("The price of" + s1 + "is NOT cheaper  " +s2 );
			return false;
		}
	}
	
	// Some abstract methods that MUST be defined by derived classes
	
	abstract public String toString();
	
	
	// abstract can also be specified as follows 
	public abstract long getSerNumber();
	
	
	abstract public Vehicle clone();


}
