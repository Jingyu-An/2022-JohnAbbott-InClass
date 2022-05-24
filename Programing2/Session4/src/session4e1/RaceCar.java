package session4e1;

public class RaceCar extends SportCar{

    private int horsePower;

    public RaceCar() {

        System.out.println("Creating race car ---> This is default constructor");
        horsePower = 400;
    }

    public RaceCar(int numOfDoor, double price, int numOfSeat, double gasConsumption, int horsePower) {

        super(numOfDoor, price, numOfSeat, gasConsumption);
        System.out.println("Creating race car ---> This is parametrized constructor");

        this.horsePower = horsePower;
    }

    public RaceCar(RaceCar rc) {

        System.out.println("Creating race car ---> This is copy constructor");

        setNumOfDoor(rc.getNumOfDoor());
        setPrice(rc.getPrice());
        setNumOfSeat(rc.getNumOfSeat());
        setGasConsumption(rc.getGasConsumption());

        this.horsePower = rc.horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "The Race Car has "+ getNumOfDoor() + " door and the price is " +
                getPrice() + "$  and the the number of seat is "
                + getNumOfSeat() + " seat and the gas consumption is " + getGasConsumption() +
                " and horse power is " + horsePower + ".";
    }
}
