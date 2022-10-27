package session1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Vehicle car = new Vehicle(4, 300, 1000);
        Vehicle car2 = new Vehicle(4, 300, 1000);

        car.showInfo();

        car.setMaxSpeed(250);
        car.setPrice(45000);
        car.setNumOfDoor(5);

        car.showInfo();

        Scanner input = new Scanner(System.in);
        Vehicle car1 = new Vehicle();

        double car1Price;
        int car1Doors;
        int car1MaxSpeed;

        System.out.println("Enter the number of doors, maximum speed, price you want");
        car1Doors = input.nextInt();
        car1MaxSpeed = input.nextInt();
        car1Price = input.nextDouble();

        car1.setNumOfDoor(car1Doors);
        car1.setMaxSpeed(car1MaxSpeed);
        car1.setPrice(car1Price);

        car1.showInfo();
    }
}
