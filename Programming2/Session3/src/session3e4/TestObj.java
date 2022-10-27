package session3e4;

public class TestObj {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(6, 50000);

        System.out.println("=====================================");
        System.out.println("Let's create buses");
        Bus b1 = new Bus();
        Bus b2 = new Bus(50);
        Bus b3 = new Bus(b1);
        Bus b4 = new Bus(8, 10000, 25);

        System.out.println("=====================================");
        System.out.println("Let's create Cars");
        Car c1 = new Car();
        Car c2 = new Car(5,30000,6);
        Car c3 = new Car(c1);

        System.out.println("=====================================");
        System.out.println("Let's create Sport Cars");
        SportCar sc1 = new SportCar();
        SportCar sc2 = new SportCar(2, 400000, 2, 2);
        SportCar sc3 = new SportCar(sc1);

        System.out.println("=====================================");
        System.out.println("Let's create Race Cars");
        RaceCar rc1 = new RaceCar();
        RaceCar rc2 = new RaceCar(2, 120000, 2, 4, 600);
        RaceCar rc3 = new RaceCar(rc1);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(sc1);
        System.out.println(sc2);
        System.out.println(sc3);
        System.out.println(rc1);
        System.out.println(rc2);
        System.out.println(rc3);

        showMeVehicle(b2);
    }

    public static void showMeVehicle(Vehicle v){
        System.out.println(v);
    }
}
