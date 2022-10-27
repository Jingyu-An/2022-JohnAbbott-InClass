package assignment;

public class Computer {

    private String brand;
    private String model;
    private double price;
    private long serialNumber;

    private static long serialNumberCounter = 1000000; //Default Serial Number
    private static int createdComputerCounter = 0; //Created Computer Counter

    /* Default Constructor */
    public Computer() {

        brand = "Apple";
        model = "MacBook Air";
        price = 2000;

        serialNumber = serialNumberCounter;
        serialNumberCounter++;
        createdComputerCounter++;
    }

    /* Parametrized Constructor */
    public Computer(String brand, String model, double price) {

        this.brand = brand;
        this.model = model;
        this.price = price;

        serialNumber = serialNumberCounter;
        serialNumberCounter++;
        createdComputerCounter++;
    }

    /* Copy Constructor */
    public Computer(Computer c) {

        brand = c.brand;
        model = c.model;
        price = c.price;

        serialNumber = serialNumberCounter;
        serialNumberCounter++;
        createdComputerCounter++;
    }

    /* getters and setters */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber() {
        serialNumber = serialNumberCounter; //new serial number
        serialNumberCounter++;
    }

    /* Check how many Computer objects have been created. */
    public static int findNumberOfCreatedComputers() {
        return createdComputerCounter;
    }

    public boolean equals(Computer c) {
        return brand.contentEquals(c.brand) && model.contentEquals(c.model) && price == c.price;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + ", Model : " + model
                + ", SN : " + serialNumber + ", Price : " + price + "$\n";
    }

    public void showInfo() {
        System.out.println("Brand : " + brand + "\nModel : " + model
                + "\nSN : " + serialNumber + "\nPrice : " + price + "$");
    }
}
