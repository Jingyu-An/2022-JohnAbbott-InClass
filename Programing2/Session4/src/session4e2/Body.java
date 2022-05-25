package Session4E2;

public class Body {
	
	public static enum availableColors {White, Red, Yellow, Blue}; 
	
	// Attributes
	private availableColors color;
	private double price;
	
	// Constructors
	public Body()	// default constructor 
	{
		System.out.println("Creating Body default constructor");
		
		color = availableColors.White;  
		price = 8000;
	}
	
	public Body(availableColors cl, double pr)	
	{
		System.out.println("Creating a Body parameterized constructor");
		
		color = cl;
		price = pr;
	}
	
	public availableColors getColor()
	{
		return color;
	}
	
	public void setColor(availableColors cl)
	{
		color = cl;
	}
	
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double pr)
	{
		price = pr;
	}
	
	
	public boolean equals(Object x)
	{
		if (x == null || this.getClass() != x.getClass())
			return false;
		else
		{
			// cast the passed object to a body object
			Body b = (Body)x;
			return (this.price == b.price && this.color ==  b.color);
		}
	}
	
	
	public String toString()
	{
		return "The color of this Body is " + color + ", and its price is " + price;
	}

}
