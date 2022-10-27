package projectA.multirotor;

import projectA.helicopter.Helicopter;

import java.util.Objects;

public class Multirotor extends Helicopter {

    protected int numOfRotors;

    public Multirotor() {

        super();
        numOfRotors  = 6;
    }

    public Multirotor(String brand, double price, int horsePower, int numOfCylinders, int creationYear, int passengerCapacity, int numOfRotors) {

        super(brand, price, horsePower, numOfCylinders, creationYear, passengerCapacity);
        this.numOfRotors = numOfRotors;
    }

    public Multirotor(Multirotor multirotor){

        super(multirotor);
        this.numOfRotors = multirotor.numOfRotors;
    }

    public int getNumOfRotors() {
        return numOfRotors;
    }

    public void setNumOfRotors(int numOfRotors) {
        this.numOfRotors = numOfRotors;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        Multirotor multirotor = (Multirotor) o;
        return numOfRotors == multirotor.numOfRotors;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number Of Rotors : " + numOfRotors;
    }
}
