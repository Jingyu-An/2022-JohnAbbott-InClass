package session3e3;

public class Vehicle {

    private int numOfDoor;
    private double price;

    public Vehicle() {

        System.out.println("Creating vehicle ---> This is default constructor");

        numOfDoor = 4;
        price = 10000;
    }

    public Vehicle(int numOfDoor, double price) {

        System.out.println("Creating vehicle ---> This is parameter constructor");

        this.numOfDoor = numOfDoor;
        this.price = price;
    }

    public Vehicle(Vehicle v) {

        System.out.println("Creating vehicle ---> This is copy constructor");

        numOfDoor = v.numOfDoor;
        price = v.price;
    }

    public int getNumOfDoor() {
        return numOfDoor;
    }

    public void setNumOfDoor(int numOfDoor) {
        this.numOfDoor = numOfDoor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numOfDoor=" + numOfDoor +
                ", price=" + price +
                '}';
    }
}
