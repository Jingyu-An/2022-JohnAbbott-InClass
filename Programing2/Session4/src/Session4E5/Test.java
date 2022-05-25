package Session4E5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v1 = new Vehicle();
		Bus b1 = new Bus();
		Car c1 = new Car();
		SportCar sc = new SportCar();
		RaceCar rc = new RaceCar();
		Vehicle v2 = new Vehicle(2 , 5000);
		
		Vehicle[]  vehicleInventory = new Vehicle[6];
		vehicleInventory[0] =  v1;
		vehicleInventory[1] =  v2;
		vehicleInventory[2] =  b1;
		vehicleInventory[3] =  c1;
		vehicleInventory[4] =  sc;
		vehicleInventory[5] =  rc;
		
		
		
		
	}
	
	
	public static void showVehicleInfo(Vehicle v) {
		System.out.println(v);
	}
	
	
	public static Vehicle[] inventorycopy(Vehicle[] myarray) {
		
		Vehicle[] vehcop = myarray;
		return vehcop;
		
		
	}
	
	public static Vehicle[] inventorycopy2(Vehicle[] myarray) {
		
		Vehicle[] vehcop = new Vehicle[myarray.length];
		
		for(int i = 0 ; i < myarray.length ; i++ ) {
			vehcop[i] = myarray [i];
		}
		
		return vehcop;
		
	}	

	public static Vehicle[] inventorycopy3(Vehicle[] myarray) {
		
		Vehicle[] vehcop = new Vehicle[myarray.length];
		
		for(int i = 0 ; i < myarray.length ; i++ ) {
			vehcop[i] = myarray [i].clone();
		}
		
		return vehcop;
		
	
	}

}
