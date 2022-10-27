package session3e3;

public class Bus  extends Vehicle{

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

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "This bus has "+ getNumOfDoor() + " door and the price is " +
                getPrice() + "$  and the passenger capacity is "
                + passengerCapacity;
    }

    public void setPrice(double price) {

        if (price < getPrice()) {
            System.out.println("The price of the bus will reduced to " + price);

        } else if (price > getPrice()){
            System.out.println("The price of the bus will increase to " + price);
        } else {
            System.out.println("The price didn't change.");
        }

        super.setPrice(price);
    }
}
