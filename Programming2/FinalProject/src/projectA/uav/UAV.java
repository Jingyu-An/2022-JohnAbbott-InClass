package projectA.uav;

import java.util.Objects;

public class UAV {

    protected double weight;
    protected double price;

    public UAV() {

        weight = 10;
        price = 2000;
    }

    public UAV(double weight, double price) {

        this.weight = weight;
        this.price = price;
    }

    public UAV(UAV uav){

        this.weight = uav.weight;
        this.price = uav.price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        UAV uav = (UAV) o;
        return weight == uav.weight && price == uav.price;
    }

    @Override
    public String toString() {
        return getClass() + "\nWeight : " + weight + "Kg" +
                ", Price : " + price + "$";
    }
}
