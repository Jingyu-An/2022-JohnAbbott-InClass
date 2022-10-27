package session4e1;

public class TestObj {

    public static void main(String[] args) {

        System.out.println("These are my vehicles");
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(4, 5000);

        v1.setNumOfDoor(2);
        v1.setPrice(1000);

        System.out.println("These are my buses");
        Bus b1 = new Bus();
        Bus b2 = new Bus(2,20000,50);

        b1.setNumOfDoor(2);
        b1.setPrice(400000);
        b1.setPassengerCapacity(60);

        System.out.println("These are my cars");
        Car c1 = new Car(2,300000,2);

        System.out.println("These are my sport cars");
        SportCar sc1 = new SportCar();
        SportCar sc2 = new SportCar(2,400000,2,5);

        sc1.setNumOfDoor(2);
        sc1.setPrice(250000);
        sc1.setNumOfSeat(2);
        sc1.setGasConsumption(4);

        System.out.println("These are my race cars");
        RaceCar rc1 = new RaceCar();
        RaceCar rc2 = new RaceCar(1,900000,1,4,600);

        rc1.setNumOfDoor(1);
        rc1.setPrice(880000);
        rc1.setNumOfSeat(1);
        rc1.setGasConsumption(4);
        rc1.setHorsePower(550);

        Book book1 = new Book();
        Painting painting1 = new Painting();
        Phone phone1 = new Phone();

        showMeVehicle(v1);
        showMeVehicle(v2);

        showMeVehicle(b1);
        showMeVehicle(b2);

        showMeVehicle(c1);

        showMeVehicle(sc1);
        showMeVehicle(sc2);

        showMeVehicle(rc1);
        showMeVehicle(rc2);

        showMeVehicle(book1);
        showMeVehicle(painting1);
        showMeVehicle(phone1);

    }

    public static void showMeVehicle(Object x){

        if (x instanceof Vehicle) {
            System.out.println("here is the info");
            System.out.println(x);
        } else {
            System.out.println("this object is not vehicle");
        }
    }
}
