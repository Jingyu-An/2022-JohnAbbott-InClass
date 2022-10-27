package Session4E2;

public class Engine {
	// Attributes
		private int horsePower;
		private double price;
		
		// Constructors
		public Engine()	// default constructor 
		{
			System.out.println("Creating Engine from default constructor");
			
			horsePower = 200;
			price = 14000;
		}
		
		public Engine(int hp, double pr)	
		{
			System.out.println("Creating Engine from parameterized constructor");
			
			horsePower = hp;
			price = pr;
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
			return "This Engine has " + horsePower +  " horse and price is " + price;
		}

}
