package Session4E1;

public class Car extends Vehicle{
private int numOfSeats;
	
	// Constructors
	public Car()	// default constructor 
	{
		System.out.println("Creating a car object using default constructor ....");
		
		numOfSeats = 5;
	}
	
	public Car(int nd, double pr, int ns)	
	{
		super(nd, pr);
		System.out.println("Creating a car object using parameterized constructor ....");
		
		numOfSeats = ns;
	}
	
	public Car(Car c)	
	{
		System.out.println("Creating a car object using copy constructor ....");
		setNumOfDoors(c.getNumOfDoors());
		setPrice(c.getPrice());
		numOfSeats = c.numOfSeats;
	}
	
	
	public int getNumOfSeats()
	{
		return numOfSeats;
	}
	
	public void setNumOfSeats(int ns)
	{
		numOfSeats = ns;;
	}
	
	public String toString()
	{
		return "This Car has " + getNumOfDoors() + " doors price is: " + getPrice() +"number of seats is" + numOfSeats; 
	}
	
	public boolean equals(Object x) {
		
		if(x == null || this == null || !(x instanceof Car)) {
			return false;
		}else {
			Car c = (Car)x ; 
			return (this.getNumOfDoors() == c.getNumOfDoors() && this.getPrice() == c.getPrice() && this.numOfSeats == c.numOfSeats);
	}

	}
}
