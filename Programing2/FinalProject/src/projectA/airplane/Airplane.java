package projectA.airplane;

import java.util.Objects;

public class Airplane {

    protected String brand;
    protected double price;
    protected int horsePower;

    public Airplane() {

        brand = "JingyuAirplane";
        price = 200000;
        horsePower = 10;
    }

    public Airplane(String brand, double price, int horsePower) {

        this.brand = brand;
        this.price = price;
        this.horsePower = horsePower;
    }

    public Airplane(Airplane airplane) {

        this.brand = airplane.brand;
        this.price = airplane.price;
        this.horsePower = airplane.horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Airplane airplane = (Airplane) o;
        return price == airplane.price && horsePower == airplane.horsePower && brand.equals(airplane.brand);
    }

    @Override
    public String toString() {
        return getClass() + "\nBrand : " + brand +
                ", Price : " + price + "$" +
                ", HorsePower : " + horsePower;
    }
}
