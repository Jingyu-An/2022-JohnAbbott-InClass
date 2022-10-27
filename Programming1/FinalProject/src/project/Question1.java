package project;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 2-digit numbers:\n"); //message
        // 3 integers input
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        magicNumber(n1, n2, n3); // call magicNumber method
    }

    /* magic number method generation and display  */
    public static void magicNumber(int n1, int n2, int n3){

        int magicNumber;
        int sum = n1 + n2 + n3; //variable sum of the 3 integers
        int multipleOfThree = sum % 3; //Variables to check for multiples of 3
        int multipleOfFive = sum % 5; //Variables to check for multiples of 5

        if (multipleOfThree == 0 && multipleOfFive != 0){ //A multiple of 3 but not a multiple of 5
            magicNumber = ((n2 / 10) * 100) + (n1 + n3); //first digit of n2 = (int)n1/10
        }else if (multipleOfThree != 0 && multipleOfFive == 0){ //Not a multiple of 3 but a multiple of 5
            magicNumber = ((n1 + n3) * 10) + (n2 % 10); //last digit of n2 = n2%10
        }else if (multipleOfThree == 0 && multipleOfFive == 0){ //A multiple of 3 and a multiple of 5
            magicNumber = (n2 * 1000) + (n1 * 10) + 1;
        }else {
            magicNumber = (n1 * 10000) + (n2 * 100) + n3;
        }
        System.out.println();
        System.out.println("Your magic number is " + magicNumber);

    }
}
