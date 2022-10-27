package Session4E3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("These are my vehicles");
		Vehicle v1  = new Vehicle();
	//	Vehicle v2  = new Vehicle(4 , 5000);
		v1.setNumOfDoors(2);
		v1.setPrice(1000);
		
	//	System.out.println("These are my Buses");
		Bus b1 = new Bus();
	//	Bus b2 = new Bus(2 , 500000 , 50);
		b1.setNumOfDoors(2);
		b1.setPrice(400000);
		b1.setPassengerCapacity(60);
		
	//	Bus b3 =new Bus();
	//	b3 = null;
//		
//		System.out.println("These are my cars");
//		
//		Car c1 = new Car(4 , 13000 , 5);
//		
//		System.out.println("These are my sport cars");
//		
//		SportCar sc1 = new SportCar();
//		SportCar sc2 = new SportCar(4, 120000, 5 , 3);
//		
//		sc1.setGasConsumption(4);
//		sc1.setNumOfDoors(2);
//		sc1.setNumOfSeats(2);
//		sc1.setPrice(30000);
//		
	//	v1.isCheaper(v2);
		
		v1.isCheaper(b1);
	
	
	}
		
	
	public static void showVehicleInfo(Object x)
	{
	
		if(x instanceof Vehicle) {
			System.out.println("here is the info");
			System.out.println(x);
		}
		else {
			System.out.println("this object is not vehicle");
		}
	}
	
	
	


}
