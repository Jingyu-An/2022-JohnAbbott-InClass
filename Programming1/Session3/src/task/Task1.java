package task;

    /*
    * three-digit integer and determines whether it is a palindrome number. A
    * number is palindrome if it reads the same from right to left and from left to
    * right. Here is a sample run of this program:
    * <p>
    * Enter a three-digit integer: 121 121 is a palindrome*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int number;
        boolean palindrome;

        System.out.println("Enter the three-digit number");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        palindrome = (number/100 == number%10);

        if (palindrome){
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is NOT a palindrome.");
        }
    }
}
