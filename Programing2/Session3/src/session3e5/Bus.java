package session3e5;

public class Bus extends Vehicle{

    private int passengerCapacity;

    public Bus() {

        System.out.println("Creating bus ---> This is default constructor");

        passengerCapacity = 20;
        numOfDoor = 2;
        super.price = 300000;
    }

    public Bus(int numOfDoor, double price, int passengerCapacity) {

        System.out.println("Creating bus ---> This is parameter constructor");
        this.numOfDoor = numOfDoor;
        this.price = price;
        this.passengerCapacity = passengerCapacity;
    }

    public Bus(Bus b) {

        System.out.println("Creating bus ---> This is copy constructor");

        passengerCapacity = b.passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }
}
