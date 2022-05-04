package task;

    /*generate two random numbers between 1 and 100
    ask user to guess the sum of them. if it was correct then print You are correct!*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int guessNumber;
        System.out.println("Enter the expected sum of the two numbers");
        Scanner input = new Scanner(System.in);
        guessNumber = input.nextInt();

        int number1 = (int)(Math.random()*100);
        int number2 = (int)(Math.random()*100);
        int sumOfNumber = number1 + number2;

        if (guessNumber == sumOfNumber) {
            System.out.println("You are correct! It is " + sumOfNumber);
        }
        else {
            System.out.println("You are NOT correct! It is " + sumOfNumber);
        }
    }
}
