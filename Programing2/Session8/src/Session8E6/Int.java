package Session8E6;

public class Int {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		Car c2 = new Car(120, 2500, 22000, 4000, 2021, 260, 2, 1.9, 2.3, 4, 12 ); 
						
		System.out.println("\nWill now clone the two Car objects");		
		Car c3 = (Car) c1.clone(), c4 = (Car) c2.clone();
						
					
		System.out.println("\nDisplaying information of the cars");
		System.out.println("==================================");

						
						
		System.out.println("Here is the information of c1:");	
		System.out.println(c1);
		System.out.println();
						
		System.out.println("Here is the information of c3, which is a clone of c1:");	
		System.out.println(c3);
		System.out.println();
							
		System.out.println("Here is the information of c2:");	
		System.out.println(c2);
		System.out.println();
						
		System.out.println("Here is the information of c4, which is a clone of c2:");	
		System.out.println(c4);
		System.out.println();
							

		
	}

}


class Engine {
	
	// Attributes
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
		return "serial number is " + serialNumber + " horsepower is " + horsePower + " price is " + price;
	}
	
} 


class Body
{
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
			return "serial number is " + serialNumber + "  weight is " + weight + " price is " + price;
		}
			
}


// A car is composed of Engine & Body. It also has many other attributes
class Car implements Cloneable{

	// Attributes
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
		price = (eng.getPrice() + bdy.getPrice());
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
		
		price = (epr + bpr);
		
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
		return "Serial number is " + serialNumber +  "horsepower is " + eng.getHorsePower() + 
				" weight is " +	bdy.getWeight() + " year is " + year +" price is " + price + 
				" maxSpeed is " + maxSpeed +" numberofdoors is " + numberOfDoors + " numberoflights is " + numberOfLights +
				" width is " + width + " length is " + length + "numberofseats is " + numberOfSeats  + 
				"\n======================================\n"  +
				"information of its engine:   " + eng.toString() + 
				"information of its body\n" + bdy.toString() ;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
		

/*
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
*/
}   // end of Car class


