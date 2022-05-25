package Session4E4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v1 = new Bus();
		v1.numOfDoors = 4;
		v1.price = 12000;
		
		System.out.println(v1);
		
		
		Vehicle v2 = new Bus(12);
		
		System.out.println(v2);
		
		Car c1 = new SportCar();
		System.out.println(c1);
		
		
		//SportCar sp1 = (SportCar) new Car(); this is baddddddddd
		
	}
		



}
