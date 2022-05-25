package Session5E1;

public class SportCar  extends Car{
	
	private double gasConsumption;
	private long serialNum;
	private static long serialNumCtr = 4000;
	
	// Constructors
	public SportCar()	// default constructor 
	{
	//	System.out.println("Creating a sport car object using default constructor ....");
		
		gasConsumption = 4;
		serialNum = serialNumCtr++;
	}
	
	public SportCar(int nd, double pr, int ns, double gc)	
	{
		super(nd, pr, ns);
	//	System.out.println("Creating a sport car object using parameterized constructor ....");
		gasConsumption = gc;
		serialNum = serialNumCtr++;
	}
	
	public SportCar(SportCar sc)	
	{
		//System.out.println("Creating a sport car object using copy constructor ....");
		
		setNumOfDoors(sc.getNumOfDoors());
		setPrice(sc.getPrice());
		setNumOfSeats(sc.getNumOfSeats());
		
		gasConsumption = sc.gasConsumption;
		serialNum = serialNumCtr++;
	}
	
	
	public double getGasConsumption()
	{
		return gasConsumption;
	}
	
	public void setGasConsumption(double gc)
	{
		gasConsumption = gc;;
	}
	
	public String toString()
	{
		return "This Sport Car has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
		"$. The number of seats of this Sport Car is " + getNumOfSeats() + 
		"\nand its gas consumption is " + gasConsumption + " gallons/100-mile."; 
	}
		
	public double getPrice()
	{
		return price;
	}
	
	public long getSerNumber()
	{
		return serialNum;
	}
	
	public SportCar clone()
	{
		return new SportCar(this);	// Create and return a new SportCar using the copy constructor
	}

}
