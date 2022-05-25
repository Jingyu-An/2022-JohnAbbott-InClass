package Session5E4;

public class Car {
	private Engine eng;
	private Body bdy;
	private double price;
	private int year;
	private int maxSpeed;
	private int numberOfDoors;
	private double width;
	private double length;
	private int numberOfSeats;
	private int numberOfLights;
	private int serialNumber;
	private static int serialNumberCtr = 3000;
	
	
	
	// Constructors
	public Car()	// default constructor 
	{
		eng = new Engine();
		bdy = new Body();
		price = (eng.getPrice() + bdy.getPrice()) ;
		year = 2022;
		
		maxSpeed = 180;
		numberOfDoors = 4;
		width = 1.8;
		length = 2.2;
		numberOfSeats = 5;
		numberOfLights = 8;
		
		serialNumber = serialNumberCtr++;
		
	}
	
	public Car(int hp, double wg, double epr, double bpr, int yr, int ms, int nd, 
                 double wd, double ln, int ns, int nl)	
	{
		
		eng = new Engine(hp, epr);
		bdy = new Body(wg, bpr);
		
		price = (epr + bpr) ;
		year = yr;
		maxSpeed = ms;
		numberOfDoors = nd;
		width = wd;
		length = ln;
		numberOfSeats = ns;
		numberOfLights = nl;
		
		serialNumber = serialNumberCtr++;
		
	}
	
	
	public int getHorsePower()
	{
		return eng.getHorsePower();
	}
	
	public void setHorsePower(int hp)
	{
		eng.setHorsePower(hp);
	}
	
	
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double pr)
	{
		if(pr < (eng.getPrice() + bdy.getPrice()) )
		{
			System.out.println("Sorry, price does not cover cost. No change will be made.");	
		}
		else
		{
			price = pr;
		}
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setyear(int yr)
	{
		year = yr;
	}
	
	public String toString()
	{
		return "This Car has serial number " + serialNumber + 
       ". \nIts horsepower is " + eng.getHorsePower() + 
			" HP, \nits weight is " +	bdy.getWeight() + 
			". The manufacturing year of the car is " + year +
			", \nits price is " + price + "$. Its maxSpeed is " + maxSpeed +
			", \nits number of doors is " + numberOfDoors +
			", \nits number of lights is " + numberOfLights +
			", \nits width is " + width +
				", \nits length is " + length + 
				", \nand its number of seats is " + numberOfSeats  + 
				"\n======================================\n"  +
				"Here is the information of its engine\n" + 
				eng.toString() + 
				"\nHere is the information of its body\n" + 
				bdy.toString() ;

	}
		
	
	
	public Car clone()
	{
		try
		{
			Car c = (Car)super.clone();
			return c;
		}catch(CloneNotSupportedException e)
		{
			System.out.println("Cannot Clone! Clone Not Supported!");
			return null; // needed for the compiler!
		}
	}

}
