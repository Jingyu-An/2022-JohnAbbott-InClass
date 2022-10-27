package projectA.helicopter;

import java.util.Objects;

public class Quadcopter extends Helicopter {

    protected int maxFlyingSpeed;

    public Quadcopter() {

        super();
        maxFlyingSpeed = 100;
    }

    public Quadcopter(String brand, double price, int horsePower, int numOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {

        super(brand, price, horsePower, numOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    public Quadcopter(Quadcopter quadcopter){

        super(quadcopter);
        this.maxFlyingSpeed = quadcopter.maxFlyingSpeed;
    }

    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        Quadcopter quadcopter = (Quadcopter) o;
        return maxFlyingSpeed == quadcopter.maxFlyingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Maximum Flying Speed : " + maxFlyingSpeed + "Km/h";
    }
}
