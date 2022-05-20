package session3e4;

public class Car extends Vehicle {

    private int numOfSeat;

    public Car() {

        System.out.println("Creating car ---> This is default constructor");
        numOfSeat = 5;
    }

    public Car(int numOfDoor, double price, int numOfSeat) {

        super(numOfDoor, price);
        System.out.println("Creating car ---> This is parametrized constructor");
        this.numOfSeat = numOfSeat;
    }

    public Car(Car c){

        System.out.println("Creating car ---> This is copy constructor");
        setNumOfDoor(c.getNumOfDoor());
        setPrice(c.getPrice());
        numOfSeat = c.numOfSeat;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    @Override
    public String toString() {
        return "This car has "+ getNumOfDoor() + " door and the price is " +
                getPrice() + "$  and the the number of seat is "
                + numOfSeat + ".";
    }
}
