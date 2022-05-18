package session1e2;

import java.util.Objects;

public class Vehicle {

    private double price;
    private int numberOfDoors;
    private int maxSpeed;

    public Vehicle(double price, int numberOfDoors, int maxSpeed) {
        this.price = price;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void showVehicleInfo(){
        System.out.println("===========================================");
        System.out.println("The vehicle has " + price + "$.");
        System.out.println("The vehicle has " + numberOfDoors + " doors.");
        System.out.println("The vehicle has " + maxSpeed + "Km/s maximum speed.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.price, price) == 0 && numberOfDoors == vehicle.numberOfDoors && maxSpeed == vehicle.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, numberOfDoors, maxSpeed);
    }

    @Override
    public String toString() {
        return "Vehicle which has " +
                "price=" + price +
                ", numberOfDoors=" + numberOfDoors +
                ", maxSpeed=" + maxSpeed +
                '.';
    }
}
