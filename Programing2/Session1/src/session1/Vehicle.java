package session1;

import java.util.Objects;

public class Vehicle {

    //Attributes
    private int numOfDoor;
    private double price;
    private int maxSpeed;

    //constructor
    public Vehicle() {
        System.out.println("new object created");
        this.numOfDoor = 4;
        this.maxSpeed = 200;
        this.price = 10000;
    }

    public Vehicle(int numOfDoor, int maxSpeed, int price) {
        System.out.println("new object created");
        this.numOfDoor = numOfDoor;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    //Methods
    public void setNumOfDoor(int numOfDoor) {
        if (numOfDoor >= 2 && numOfDoor <= 6) {
            this.numOfDoor = numOfDoor;
        } else {
            System.out.println("this is not valid number of the door");
        }
    }
    public int getNumOfDoor() {
        return numOfDoor;
    }

    public void setPrice(double price) {
        if (price > 1000 && price <= 60000) {
            this.price = price;
        } else {
            System.out.println("this is not valid price");
            this.price = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 80 && maxSpeed <= 300) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("this is not valid maximum speed");
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void showInfo() {
        System.out.println("The vehicle has " + numOfDoor + " doors.");
        System.out.println("The vehicle has " + maxSpeed + "Km/s maximum speed.");
        System.out.println("The vehicle has " + price + "$.");
    }
}
