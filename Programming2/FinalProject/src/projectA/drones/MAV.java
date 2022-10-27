package projectA.drones;

import projectA.uav.UAV;

import java.util.Objects;

public class MAV extends UAV {

    protected String model;
    protected double size;

    public MAV() {

        super();
        model = "JingyuMAV";
        size = 15;
    }

    public MAV(double weight, double price, String model, double size) {

        super(weight, price);
        this.model = model;
        this.size = size;
    }

    public MAV(MAV mav) {

        super(mav);
        this.model = mav.model;
        this.size = mav.size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        MAV mav = (MAV) o;
        return size == mav.size && model .equals(mav.model);
    }

    @Override
    public String toString() {
        return super.toString() + ", Model : " + model +
                ", Size : " + size + "cm";
    }
}
