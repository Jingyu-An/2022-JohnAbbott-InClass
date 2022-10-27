package session2e2;

public class Vehicle {

    //Attributes
    private int numOfDoor;
    private double price;
    private int maxSpeed;
    // int age - this.age

    public Vehicle() {
        System.out.println("The Object created");
        this.numOfDoor = 4; // numOfDoor = 4;
        this.price = 10000; // price = 10000;
        this.maxSpeed = 280;
    }

    public Vehicle(int numOfDoor, double price, int maxSpeed) {
        this.numOfDoor = numOfDoor;
        this.price = price;
        this.maxSpeed = maxSpeed;
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
}
