package Session5E4;

public class Engine {
	private int horsePower;
	private double price;
	private  long serialNumber;
	private static long serialNumberCtr = 100;
	
	// Constructors
	public Engine()	// default constructor 
	{
				
		horsePower = 200;
		price = 14000;
		serialNumber = serialNumberCtr++;
	}
	
	public Engine(int hp, double pr)	
	{
				
		horsePower = hp;
		price = pr;
		serialNumber = serialNumberCtr++;
	}
	
	public int getHorsePower()
	{
		return horsePower;
	}
	
	public void setHorsePower(int hp)
	{
		horsePower = hp;
	}
	
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double pr)
	{
		price = pr;
	}
	
	public double getSerialNumber()
	{
		return serialNumber;
	}
	
	public boolean equals(Object x)
	{
		if (x == null || this.getClass() != x.getClass())
			return false;
		else
		{
			// cast the passed object to an Engine object
			Engine e = (Engine)x;
			return (this.price == e.price && this.horsePower == e.horsePower);
		}
	}
	
	
	public String toString()
	{
		return "This Engine has a serial number " + serialNumber + ", its horsepower is " + horsePower + 
		" HP and it price is " + price + "$.";
	}

}
