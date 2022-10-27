package projectA.helicopter;

import projectA.airplane.Airplane;

import java.util.Objects;

public class Helicopter extends Airplane {

    protected int numOfCylinders;
    protected int creationYear;
    protected int passengerCapacity;

    public Helicopter() {

        super();
        numOfCylinders = 5;
        creationYear = 2020;
        passengerCapacity = 5;
    }

    public Helicopter(String brand, double price, int horsePower, int numOfCylinders, int creationYear, int passengerCapacity) {

        super(brand, price, horsePower);
        this.numOfCylinders = numOfCylinders;
        this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;
    }

    public Helicopter(Helicopter helicopter){

        super(helicopter);
        this.numOfCylinders = helicopter.numOfCylinders;
        this.creationYear = helicopter.creationYear;
        this.passengerCapacity = helicopter.passengerCapacity;
    }

    public int getNumOfCylinders() {
        return numOfCylinders;
    }

    public void setNumOfCylinders(int numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        Helicopter helicopter = (Helicopter) o;
        return numOfCylinders == helicopter.numOfCylinders && creationYear == helicopter.creationYear &&
                passengerCapacity == helicopter.passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number Of Cylinders : " + numOfCylinders +
                ", Creation Year : " + creationYear +
                ", Passenger Capacity : " + passengerCapacity;
    }
}
