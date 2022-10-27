package Session5E1;

public class RaceCar extends SportCar{
	private int horsePower;
	private long serialNum;
	private static long serialNumCtr = 5000;
	
	// Constructors
	public RaceCar()	// default constructor 
	{
		//System.out.println("Creating a race car object using default constructor ....");
		
		horsePower = 400;
		serialNum = serialNumCtr++;
	}
	
	public RaceCar(int nd, double pr, int ns, double gc, int hp)	
	{
		super(nd, pr, ns, gc);
	//	System.out.println("Creating a race car object using parameterized constructor ....");
		horsePower = hp;
		serialNum = serialNumCtr++;
	}
	
	public RaceCar(RaceCar rc)	
	{
	//	System.out.println("Creating a race car object using copy constructor ....");
		
		setNumOfDoors(rc.getNumOfDoors());
		setPrice(rc.getPrice());
		setNumOfSeats(rc.getNumOfSeats());
		setGasConsumption(rc.getGasConsumption());
		
		horsePower = rc.horsePower;
		serialNum = serialNumCtr++;
	}
	
	
	public int getHorsePower()
	{
		return horsePower;
	}
	
	public void setHorsePower(int hp)
	{
		horsePower = hp;
	}
	
	public String toString()
	{
		return "This Race Car has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
		"$. The number of seats of this Race Car is " + getNumOfSeats() + 
		"\nand its gas consumption is " + getGasConsumption() + " gallons/100-mile." +
		"The horse power of this Race Car is: " + horsePower + "."; 
	}
		
	public double getPrice()
	{
		return price;
	}
	
	public long getSerNumber()
	{
		return serialNum;
	}
	
	public RaceCar clone()
	{
		return new RaceCar(this);	// Create and return a new RaceCar using the copy constructor
	}

}
