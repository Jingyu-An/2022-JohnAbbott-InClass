package Session5E4;

public class Body {
	private double weight;
	private double price;
	private  long serialNumber;
	private static long serialNumberCtr = 500;
	
	// Constructors
	public Body()	// default constructor 
	{
				
		weight = 2000;  
		price = 8000;
		serialNumber = serialNumberCtr++;
	}
	
	public Body(double wg, double pr)	
	{
					
		weight = wg;
		price = pr;
		serialNumber = serialNumberCtr++;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight(double wg)
	{
		weight = wg;
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
			// cast the passed object to a body object
			Body b = (Body)x;
			return (this.price == b.price && this.weight ==  b.weight);
		}
	}
	
	
	public String toString()
	{
		return "This Body has a serial number " + serialNumber + ", its weight is " + weight +  ", and its price is " + price + "$.";
	}
		

}
