package Session4E5;

public class RaceCar extends SportCar{
private int horsePower;
	
	// Constructors
	public RaceCar()	// default constructor 
	{
	//	System.out.println("Creating a race car object using default constructor ....");
		
		horsePower = 400;
	}
	
	public RaceCar(int nd, double pr, int ns, double gc, int hp)	
	{
		super(nd, pr, ns, gc);
	//	System.out.println("Creating a race car object using parameterized constructor ....");
		horsePower = hp;
	}
	
	public RaceCar(RaceCar rc)	
	{
	//	System.out.println("Creating a race car object using copy constructor ....");
		
		setNumOfDoors(rc.getNumOfDoors());
		setPrice(rc.getPrice());
		setNumOfSeats(rc.getNumOfSeats());
		setGasConsumption(rc.getGasConsumption());
		
		horsePower = rc.horsePower;
	}
	
	
	public int getHorsePower()
	{
		return horsePower;
	}
	
	public void setHorsePower(int hp)
	{
		horsePower = hp;
	}
	
	public double getPrice() {
		
		String s = this.getClass().toString();
		System.out.println("exceuting getprice from " + s);
		//return price;
		return price;
	}
	
	public String toString()
	{
		return "This Race Car has " + getNumOfDoors() + " doors price is: " + getPrice() +
		"number of seats is " + getNumOfSeats() + "and gas consumption is " + getGasConsumption()+
		"The horse poweris: " + horsePower + "."; 
	}
	
	public RaceCar clone() {
		
		return new RaceCar(this);
	}
	
	
	public boolean equals(Object x) {
		
		if(x == null || this == null || !(x instanceof RaceCar)) {
			return false;
		}else {
			RaceCar c = (RaceCar)x ; 
			return (this.getNumOfDoors() == c.getNumOfDoors() && this.getPrice() == c.getPrice() && this.getNumOfSeats() == c.getNumOfSeats()
					&& this.getGasConsumption() == c.getGasConsumption() && this.horsePower == c.horsePower);
	}

	}

}
