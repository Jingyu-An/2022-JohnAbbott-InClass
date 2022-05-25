package Session4E5;

public class Bus extends Vehicle{

private int passengerCapacity;
	
	// Constructors
	public Bus()	// default constructor 
	{
		//System.out.println("Creating a bus object using default constructor ....");
		
		passengerCapacity = 10;
	}
	
	public Bus(int pc)	
	{
		//System.out.println("Creating a bus object using parameterized constructor ....");
		
		passengerCapacity = pc;
	}
	
	public Bus(Bus b)	
	{
		//System.out.println("Creating a bus object using copy constructor ....");
		
		setNumOfDoors(b.getNumOfDoors());
		setPrice(b.getPrice());
		passengerCapacity = b.passengerCapacity;
	}
	
	
	// A constructor that would allow the setting of the price and the number of doors
	// and the passenger capacity
	public Bus(int nd, double pr, int pc)	
	{
		
		this(pc); 	// Call the constructor that sets the passenger capacity 
	
	//	System.out.println("Creating a bus object using parameterized constructor for full settings....\n");
		
		// Notice that we now cannot call super to set the other two attributes 
		// (i.e. super(nd, pr);) since either "this" or 'super" must be the first 
		// statement, and it is not possible to have both of them as such!
		setPrice(pr);		
		setNumOfDoors(nd); 
		
	}

	
	public int getPassangerCapacity()
	{
		return passengerCapacity;
	}
	
	public void setPassengerCapacity(int pc)
	{
		passengerCapacity = pc;;
	}
	
	public void setPrice(double pr)
	{
//		if(pr < getPrice())
//			System.out.println("The price of this bus will be reduced from " + getPrice() + "$ to " + pr + "$.");
//		else if (pr > getPrice())
//			System.out.println("The price of this bus will be increased from " + getPrice() + "$ to " + pr + "$.");
//		else
//			System.out.println("No change will be applied to this price of the bus.");
//		
		super.setPrice(pr);		
		
	}
	public double getPrice() {
		
		String s = this.getClass().toString();
	//	System.out.println("exceuting getprice from  " + s);
		//return price;
		return price;
	}
	
	public String toString()
	{
		return "This Bus has " + getNumOfDoors() + " doors price is: " + getPrice() +"$.Thecapacity is " 
				+ passengerCapacity; 
	}
	
	// Override the setPrice() method
	
	
	
//	public boolean equals(Bus b) {
//		return (this.getNumOfDoors() == b.getNumOfDoors() && this.getPrice() == b.getPrice() && this.passengerCapacity == b.passengerCapacity);
//	}
	
	public boolean equals(Object x) {
		
		if(x == null || this == null || !(x instanceof Bus)) {
			return false;
		}else {
			
			Bus b = (Bus) x ; //casting
			return(this.getNumOfDoors()==b.getNumOfDoors() && this.getPrice() == b.getPrice() && this.passengerCapacity == b.passengerCapacity);
		}
	}
	
	public Bus clone() {
		
		return new Bus(this);
	}
	

}
