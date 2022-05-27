package Session7E3;



public class Car {
	private int numOfDoors;
	private double price;
	private int numOfSeats;
	
	// Constructors
	public Car()	// default constructor 
	{
		numOfDoors = 4;
		price = 10000;
		numOfSeats = 5;
	}
	
	public Car(int nd, double pr, int ns)	
	{
		numOfDoors = nd;
		price = pr;
		numOfSeats = ns;
	}
	
	public Car(Car c)	
	{
		numOfDoors = c.numOfDoors;
		price = c.price;
		numOfSeats = c.numOfSeats;
	}
	
	public int getNumOfDoors()
	{
		return numOfDoors;
	}
	
	public void setNumOfDoors(int nd)
	{
		numOfDoors = nd;
	}
	

	public int getNumOfSeats()
	{
		return numOfSeats;
	}
	
	public void setNumOfSeats(int ns)
	{
		numOfSeats = ns;;
	}
	
	public void setPrice(double pr)
	{
		price = pr;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return "This Car has " + getNumOfDoors() + " Door and  price is: " + getPrice() +" number of seats is " + numOfSeats; 
	}

	public boolean equals(Object x) {
		Car c = (Car) x; 
		System.out.print("test");
		return(this.price == c.price && 
				this.numOfDoors == c.numOfDoors &&
				this.numOfSeats ==c.numOfSeats);
		
	
	}

}
