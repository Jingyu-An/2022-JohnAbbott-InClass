package assign1;

        /*(Health application: computing BMI) Body Mass Index (BMI)
        is a measure of health on weight. It can be calculated by taking
        your weight in kilograms and dividing by the square of your height in
        meters. Write a program that prompts the user to enter a weight in
        pounds and height in inches and displays the BMI.
        Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
        If BMI is less than 18.5 you are underweight -> if clause if (X < 18.5)
        If BMI is less than 25 you are normal
        If BNI is less than 30 you are overweight
        Otherwise you are obess
        Else if*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        double weightInPound;
        double heightInInches;
        double weightInKilograms;
        double heightInMeters;
        double bmi;

        System.out.println("Enter your weight in pounds");
        Scanner inputWeight = new Scanner(System.in);
        weightInPound = inputWeight.nextDouble();

        System.out.println("Enter your height in inches");
        Scanner inputHeight = new Scanner(System.in);
        heightInInches = inputHeight.nextDouble();

        weightInKilograms = weightInPound * 0.45359237;
        heightInMeters = heightInInches * 0.0254;

        bmi = weightInKilograms / Math.pow(heightInMeters, 2);
        System.out.println("Your BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight. You need to eat more.");
        } else if (bmi < 25) {
            System.out.println("You are normal. Keep your weight.");
        } else if (bmi < 30) {
            System.out.println("You are overweight. You need to workout.");
        } else {
            System.out.println("You are obese. You need to diet and workout.");
        }
    }
}
