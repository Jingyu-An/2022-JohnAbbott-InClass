package session1e2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Vehicle car1 = new Vehicle(40000, 4, 180);
        Vehicle car2 = new Vehicle(80000,2,350);
        Vehicle car3 = new Vehicle(50000,5, 250);

        car1.showVehicleInfo();
        car2.showVehicleInfo();
        car3.showVehicleInfo();

        double price;
        int doors;
        int speed;

        System.out.println("===========================================");
        System.out.println();
        System.out.println("Enter the price, number of doors, maximum speed you want");
        price = input.nextDouble();
        doors = input.nextInt();
        speed = input.nextInt();

        Vehicle userCar = new Vehicle(price, doors, speed);

        if (userCar.equals(car1)) {
            System.out.println("We have a " + car1.toString());
        }else if (userCar.equals(car2)) {
            System.out.println("We have a " + car2.toString());
        }else if (userCar.equals(car3)) {
            System.out.println("We have a " + car3.toString());
        }else {
            System.out.println("We don't have any car as same you want");
        }
    }
}
