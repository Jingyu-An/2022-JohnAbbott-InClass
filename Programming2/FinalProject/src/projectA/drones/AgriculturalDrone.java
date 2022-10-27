package projectA.drones;

import projectA.uav.UAV;

import java.util.Objects;

public class AgriculturalDrone extends UAV {

    protected String brand;
    protected int carryCapacity;

    public AgriculturalDrone() {

        super();
        brand = "JinryuAgriculturalDrone";
        carryCapacity = 10;
    }

    public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {

        super(weight, price);
        this.brand = brand;
        this.carryCapacity = carryCapacity;
    }

    public AgriculturalDrone(AgriculturalDrone agriculturalDrone) {

        super(agriculturalDrone);
        this.brand = agriculturalDrone.brand;
        this.carryCapacity = agriculturalDrone.carryCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        AgriculturalDrone agriculturalDrone = (AgriculturalDrone) o;
        return carryCapacity == agriculturalDrone.carryCapacity && brand.equals(agriculturalDrone.brand);
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand : " + brand +
                ", Carry Capacity : " + carryCapacity;
    }
}
