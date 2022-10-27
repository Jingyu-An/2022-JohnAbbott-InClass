package Session5E1;

public class Bus extends Vehicle{
	
		private int passengerCapacity;
		private long serialNum;
		private static long serialNumCtr = 2000;
		
		
		public Bus()	// default constructor 
		{
		//	System.out.println("Creating a bus object using default constructor ....");
			
			passengerCapacity = 10; 
			serialNum = serialNumCtr++;
		}
		
		public Bus(int pc)	
		{
		//	System.out.println("Creating a bus object using parameterized constructor ....");
			
			passengerCapacity = pc;
			serialNum = serialNumCtr++;
		}
		
		public Bus(Bus b)	
		{
		//	System.out.println("Creating a bus object using copy constructor ....");
			
			setNumOfDoors(b.getNumOfDoors());
			setPrice(b.getPrice());
			passengerCapacity = b.passengerCapacity;
			serialNum = serialNumCtr++;
		}
		
		
		
		public Bus(int nd, double pr, int pc)	
		{
			
			this(pc); 
		
		//	System.out.println("Creating a bus object using parameterized constructor for full settings....\n");
		
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
		
		public String toString()
		{
			return "This Bus has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
			"$. The passenger capacity of this bus is " + passengerCapacity + "."; 
		}
		public void setPrice(double pr)
		{
			
			super.setPrice(pr);		
			
			
		}
		
		public double getPrice()
		{
			return price;
		}

		public long getSerNumber()
		{
			return serialNum;
		}
		
		public Bus clone()
		{
			return new Bus(this);	// Create and return a new Bus using the copy constructor
		}

}
