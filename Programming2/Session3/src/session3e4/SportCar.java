package session3e4;

public class SportCar extends Car{

    private double gasConsumption;

    public SportCar() {

        System.out.println("Creating sport car ---> This is default constructor");
        gasConsumption = 5;
    }

    public SportCar(int numOfDoor, double price, int numOfSeat, double gasConsumption) {

        super(numOfDoor,price,numOfSeat);
        System.out.println("Creating sport car ---> This is parametrized constructor");
        this.gasConsumption = gasConsumption;
    }

    public SportCar(SportCar sc) {

        System.out.println("Creating sport car ---> This is copy constructor");
        setNumOfDoor(sc.getNumOfDoor());
        setPrice(sc.getPrice());
        setNumOfSeat(sc.getNumOfSeat());
        this.gasConsumption = sc.gasConsumption;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    @Override
    public String toString() {
        return "The SportCar has "+ getNumOfDoor() + " door and the price is " +
                getPrice() + "$  and the the number of seat is "
                + getNumOfSeat() + " seat and the gas consumption is " + gasConsumption + ".";
    }
}
