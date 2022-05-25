package Session4E4;

public class SportCar extends Car{
private double gasConsumption;
	
	// Constructors
	public SportCar()	// default constructor 
	{
	//	System.out.println("Creating a sport car object using default constructor ....");
		
		gasConsumption = 4;
	}
	
	public SportCar(int nd, double pr, int ns, double gc)	
	{
		super(nd, pr, ns);
	//	System.out.println("Creating a sport car object using parameterized constructor ....");
		gasConsumption = gc;
	}
	
	public SportCar(SportCar sc)	
	{
	//	System.out.println("Creating a sport car object using copy constructor ....");
		
		setNumOfDoors(sc.getNumOfDoors());
		setPrice(sc.getPrice());
		setNumOfSeats(sc.getNumOfSeats());
		
		gasConsumption = sc.gasConsumption;
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
		return "This Sport Car has " + getNumOfDoors() + " doors price is: " + getPrice() +
		"$.numberofseats is " + getNumOfSeats() + "gas consumption is " + gasConsumption; 
	}
	public double getPrice() {
		
		String s = this.getClass().toString();//
		System.out.println("exceuting getprice from " + s);
		//return price;
		return price;
	}
	
	
	public boolean equals(Object x) {
		
		if(x == null || this == null || !(x instanceof SportCar)) {
			return false;
		}else {
			SportCar c = (SportCar)x ; 
			return (this.getNumOfDoors() == c.getNumOfDoors() && this.getPrice() == c.getPrice() && 
					this.getNumOfSeats() == c.getNumOfSeats() && this.gasConsumption == c.gasConsumption);
	}

	}
	
//	public boolean equals(Object x) {
//		if(x == null || this == null || this.getClass() != x.getClass()) {
//			return false;
//	}else {
//			SportCar c = (SportCar)x ; 
//			return (this.getNumOfDoors() == c.getNumOfDoors() && this.getPrice() == c.getPrice() && 
//					this.getNumOfSeats() == c.getNumOfSeats() && this.gasConsumption == c.gasConsumption);
//		}
//	}

}
