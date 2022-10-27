package task;

      /*Write a program that prompts the user to enter
        the minutes (e.g., 1 billion), and displays the number
        of years and days for the minutes. For simplicity, assume
        a year has 365 days.
        *use long type as identifer

        ------------
        Ask user to enter a value in feet use double for input
        Ask user to enter a value in pound use double for input
        convert the values to meter and kilogram
        One foot is 0.305 meter
        One pound is 0.454 kilograms
        and print the result in the output
        * use double for the identifiers

        -------------
        Reads Celsius in double value from the console and converts it to Fahrenheit*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double feet;
        double pound;
        double meter;
        double kilograms;

        System.out.println("Enter a value in feet");
        Scanner scanFeet = new Scanner(System.in);
        feet = scanFeet.nextDouble();
        System.out.println("Enter a value in pound");
        Scanner scanPound = new Scanner(System.in);
        pound = scanPound.nextDouble();

        meter = feet * 0.305;
        kilograms = pound * 0.454;

        System.out.println(feet + " feet = " + meter + " meter");
        System.out.println(pound + " pound = " + kilograms + "kilograms\n");
    }
}
