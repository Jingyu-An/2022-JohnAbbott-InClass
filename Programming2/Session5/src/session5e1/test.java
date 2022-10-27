package Session5E1;

public class test {

	public static void showVehicleInfo(Vehicle v)
	{
		System.out.println();
	}
	

	public static Vehicle[] copyInventory(Vehicle[] va)
	{
		Vehicle[] vecarr = new Vehicle[va.length];	
										
		for (int i = 0; i < vecarr.length; i++)		
		{
			vecarr[i] = va[i].clone();		
		} 
		return vecarr;
	}
	
	// A method that displays the contents of an inventory
	public static void displayInventoryInfo(Vehicle[] va)
	{
		String s;
		System.out.println("\nHere is the information of vehicles in that inventory");
		for (int i = 0; i < va.length; i++)
		{
			s = va[i].getClass().toString();
			
			System.out.print((i+1) + ". " + s + " with serial number " + va[i].getSerNumber() + ". ");
			System.out.println(va[i]);

		}
	}
	public static void main(String[] args) {
		
		// The following would be illegal now since you can NOT create objects 
		// from an abstract class
		// Vehicle v1 = new Vehicle();
		
		

		Bus b1 = new Bus(2, 55000, 37);
		Bus b2 = new Bus(3, 62000, 55);
		Bus b3 = new Bus(b1);
		
		

		Car c1 = new Car(4, 12000, 5);
		Car c2 = new Car(2, 26000, 2);
		

		SportCar sc1 = new SportCar(4, 12000, 5, 3);
		SportCar sc2 = new SportCar(3, 18500, 4, 4);
		SportCar sc3 = new SportCar(2, 15000, 5, 4);
	
		

		RaceCar rc1 = new RaceCar(4, 67000, 2, 4, 400);
		RaceCar rc2 = new RaceCar(3, 85000, 4, 4, 450);
	
		
		
		Vehicle[] vecInv1 = new Vehicle[6];
		vecInv1[0] = c1;
		vecInv1[1] = b1;
		vecInv1[2] = b2;
		vecInv1[3] = sc1;
		vecInv1[4] = sc2;
		vecInv1[5] = rc1;
				
		System.out.print("Inventory vecInv1: ");
		displayInventoryInfo(vecInv1);//display
		
		Vehicle[] vecInv2 = new Vehicle[4];
		vecInv2[0] = c2;
		vecInv2[1] = sc3;
		vecInv2[2] = rc2;
		vecInv2[3] = b3;
		
		System.out.print("Inventory vecInv2: ");
		displayInventoryInfo(vecInv2);
		
		// Now copy these inventories using the correct copyInventory method
		Vehicle[] vecInv3 = copyInventory(vecInv1);
		Vehicle[] vecInv4 = copyInventory(vecInv2);
		
		System.out.print("\nInventory vecInv3 (should be a COPY of vecInv1): ");
		displayInventoryInfo(vecInv3);
		
		System.out.print("\nInventory vecInv4 (should be a COPY of vecInv2): ");
		displayInventoryInfo(vecInv4);
	}


}
