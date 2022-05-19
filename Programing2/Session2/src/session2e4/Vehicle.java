package session2e4;

public class Vehicle {

    private int numOfDoor;
    private double price;
    private int maxSpeed;
    // int age - this.age
    private int serialNumber;
    private static int serialNumberCounter = 100000;

    public Vehicle() {
        System.out.println("The Object created");
        this.numOfDoor = 4; // numOfDoor = 4;
        this.price = 10000; // price = 10000;
        this.maxSpeed = 280;
        serialNumber = serialNumberCounter;
        serialNumberCounter++;
    }

    public Vehicle(int numOfDoor, double price, int maxSpeed) {
        this.numOfDoor = numOfDoor;
        this.price = price;
        this.maxSpeed = maxSpeed;
        serialNumber = serialNumberCounter;
        serialNumberCounter++;
    }

    public Vehicle(Vehicle v) {

        numOfDoor = v.numOfDoor;
        price = v.price;
        maxSpeed = v.maxSpeed;
        serialNumber = serialNumberCounter;
        serialNumberCounter++;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void showInfo() {
        System.out.println("The number of door is " + numOfDoor +
                ", the price is " + price + ", the maximum speed is " + maxSpeed +
                ", the serial number is " + serialNumber);
    }
}
