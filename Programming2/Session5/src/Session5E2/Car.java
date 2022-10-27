package Session5E2;

public class Car extends Vehicle implements Comparble {
	// Attributes
		private int year;
		
		// Constructors
		public Car()	// default constructor 
		{
			year = 2019;
		}
		
		public Car(int nd, double pr, int yr)	
		{
			super(nd, pr);
			year = yr;
		}
		
		public Car(Car c)	
		{
			price = c.price;
			numOfDoors = c.numOfDoors;
			year = c.year;
		}
		
		
		public int getYear()
		{
			return year;
		}
		
		public void setYear(int yr)
		{
			year = yr;
		}
		
		public String toString()
		{
			return "This Car has " + numOfDoors + " doors and its price is: " + price +
			"$. The car was manufactured in: " + year + "."; 
		}
			
		public boolean equals(Object x)
		{
			if (x == null || this == null || this.getClass() != x.getClass())
				return false;
			else
			{
				// cast the passed object to a Car object
				Car c = (Car)x;

				return (this.getNumOfDoors() == c.getNumOfDoors() &&
					this.getPrice() == c.getPrice() &&
					this.year == c.year);
			}
		}
		
		public int smallerBy(Object x)
		{
	
			
			if(x == null || x.getClass() != this.getClass())
				return -1;
			
			Car c = (Car)x;
			if (this.year < c.year)
				return (c.year - this.year);
			else 
				return -1;
			
		}
		
		public int largerBy(Object x)
		{
		
			
			if(x == null || x.getClass() != this.getClass())
				return -1;
			
			Car c = (Car)x;
			if (this.year > c.year)
				return (this.year - c.year);
			else 
				return -1;
			
		}
	

}
