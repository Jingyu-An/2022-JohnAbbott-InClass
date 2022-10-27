package Session5E2;

public class Vehicle {
	 protected int numOfDoors;	// Notice the access rights of the 
		protected double price;		// class attributes
		
		// Constructors
		public Vehicle()	// default constructor 
		{
			numOfDoors = 4;
			price = 10000;
		}
		
		public Vehicle(int nd, double pr)	
		{
			numOfDoors = nd;
			price = pr;
		}
		
		
		public Vehicle(Vehicle vec)	// copy constructor 
		{
			numOfDoors = vec.numOfDoors;
			price = vec.price;
		}
		
		public int getNumOfDoors()
		{
			return numOfDoors;
		}
		
		public void setNumOfDoors(int nd)
		{
			numOfDoors = nd;
		}
		
		public double getPrice()
		{
			return price;
		}
		
		public void setPrice(double pr)
		{
			price = pr;
		}
		
		public String toString()
		{
			return "This Vehicle has " + numOfDoors + 
			"doors and it price is " + price + "$.";
		}

}
