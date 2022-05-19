package activity19th;

public class CellPhone {

    private String brand;
    private long serialNumber;
    private double price;

    private static long serialNumberCounter = 100000000;

    // default constructor
    public CellPhone() {
        brand = "Apple";
        price = 2000;
        serialNumber = serialNumberCounter;
        serialNumberCounter++;
    }

    // constructor with parameters
    public CellPhone(String brand, double price) {
        this.brand = brand;
        this.price = price;
        serialNumber = serialNumberCounter;
        serialNumberCounter++;
    }

    // copy constructor
    public CellPhone (CellPhone cellPhone){
        brand = cellPhone.brand;
        price = cellPhone.price;
        serialNumber = serialNumberCounter;
        serialNumberCounter++;
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

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber() {
        this.serialNumber = serialNumberCounter;
        serialNumberCounter++;
    }

    public void showInfo() {
        System.out.println("The brand is " + brand + ", the price is " + price + "$"+
                ", the serial number is " + serialNumber);
    }

    public boolean equals(CellPhone obj) {
        if (this.brand.contentEquals(obj.brand) && this.price == obj.price){
            System.out.println("Both cell phone are the same.");
            return true;
        }else {
            System.out.println("The two phones are different.");
            return false;
        }
    }
}
