package Session5E1;

public class Car extends Vehicle{
	
		private int numOfSeats;
		private long serialNum;
		private static long serialNumCtr = 3000;
		
		// Constructors
		public Car()	// default constructor 
		{
		//	System.out.println("Creating a car object using default constructor ....");
			
			numOfSeats = 5;
			serialNum = serialNumCtr++;
		}
		
		public Car(int nd, double pr, int ns)	
		{
			super(nd, pr);
		//	System.out.println("Creating a car object using parameterized constructor ....");
			
			numOfSeats = ns;
			serialNum = serialNumCtr++;
		}
		
		public Car(Car c)	
		{
		//	System.out.println("Creating a car object using copy constructor ....");
			setNumOfDoors(c.getNumOfDoors());
			setPrice(c.getPrice());
			numOfSeats = c.numOfSeats;
			serialNum = serialNumCtr++;
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
			return "This Car has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
			"$. The number of seats of this car is " + numOfSeats + "."; 
		}
				
		public double getPrice()
		{
			return price;
		}

		public long getSerNumber()
		{
			return serialNum;
		}
		
		public Car clone()
		{
			return new Car(this);	// Create and return a new Car using the copy constructor
		}

}
