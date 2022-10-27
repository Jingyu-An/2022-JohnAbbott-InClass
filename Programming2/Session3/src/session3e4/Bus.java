package session3e4;

public class Bus extends Vehicle {

    private int passengerCapacity;

    public Bus() {

        System.out.println("Creating bus ---> This is default constructor");

        passengerCapacity = 20;
    }

    public Bus(int passengerCapacity) {

        System.out.println("Creating bus ---> This is parameter constructor");

        this.passengerCapacity = passengerCapacity;
    }

    public Bus(Bus b) {

        System.out.println("Creating bus ---> This is copy constructor");

        passengerCapacity = b.passengerCapacity;
    }

    public Bus(int numOfDoor, double price, int passengerCapacity) {
        super(numOfDoor, price);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setPrice(int price){
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "This bus has "+ getNumOfDoor() + " door and the price is " +
                getPrice() + "$  and the passenger capacity is "
                + passengerCapacity;
    }
}
