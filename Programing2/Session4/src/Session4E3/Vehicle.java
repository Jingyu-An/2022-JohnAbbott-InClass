package Session4E3;

public class Vehicle {
	
		protected int numOfDoors;
		protected double price;
		
		
		public Vehicle()	// default constructor 
		{
			System.out.println("\nCreating a vehicle object using default constructor ....");
			
			numOfDoors = 4;
			price = 10000;
		}
		
		public Vehicle(int nd, double pr)	
		{
			System.out.println("\nCreating a vehicle object using parameterized constructor ....");
			
			numOfDoors = nd;
			price = pr;
		}
		
		public Vehicle(Vehicle vec)	// copy constructor 
		{
			System.out.println("\nCreating a vehicle object using copy constructor ....");
			
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
			String s = this.getClass().toString();
			System.out.println("exceuting getprice from " + s);
			return price;
		}
		
		public void setPrice(double pr)
		{
			price = pr;
		}
		
		public String toString()
		{
			return "This Vehicle has " + numOfDoors + " doors and it price is " + price + "$.";
		}
		
		public boolean isCheaper(Vehicle v) {
			
			String s1 = this.getClass().toString();
			String s2 = v.getClass().toString();
			
			if(getPrice() < v.getPrice()) {
				System.out.println(" the price of " + s1 + "is cheper than " + s2);
				return true;
			}
			else {
				System.out.println(" the price of " + s1 + "is more expensive than " + s2);
				return false;
			}
			
		}
		
		
//		
		public boolean equals(Object x) {
			
			if(x == null || this == null || !(x instanceof Vehicle)) {
				return false;
			}else {
				Vehicle v = (Vehicle)x;//casting
				return (this.numOfDoors == v.numOfDoors && this.price ==v.price);
			}
		}
		
		
}
