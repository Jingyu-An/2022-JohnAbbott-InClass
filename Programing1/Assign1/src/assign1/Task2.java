package assign1;

    /*Write a program that prompts the user to enter the
    distance to drive, the fuel efficiency of the car in miles per gallon, and
    the price per gallon, and displays the cost of the trip*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double distanceToDrive;
        double milesPerGallon;
        double pricePerGallon;
        double costOfTrip;

        System.out.println("Enter the distance to drive");
        Scanner inputDistance = new Scanner(System.in);
        distanceToDrive = inputDistance.nextDouble();

        System.out.println("Enter the fuel efficiency of car in miles per gallon");
        Scanner inputMiles = new Scanner(System.in);
        milesPerGallon = inputMiles.nextDouble();

        System.out.println("Enter the the price per gallon");
        Scanner inputPrice = new Scanner(System.in);
        pricePerGallon = inputPrice.nextDouble();

        costOfTrip = distanceToDrive / milesPerGallon * pricePerGallon;
        System.out.println("The cost of the trip : " + costOfTrip);
    }
}
