package task;

        /*Write a program to enter your name and family name in the first line by asking from user(you)
        you get the information from input and use it to print the result in the output
        and in the second line you will print, I love programming
        and in the third line you will print, I study in JohnAbbott

        -----

        Write a program to print the result of 100 * 200*/

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        String name;
        System.out.println("What is your name");
        Scanner scanName = new Scanner(System.in);
        name = scanName.nextLine();

        System.out.println("Your name : " + name);
        System.out.println("I love programming");
        System.out.println("I study in JohnAbbott");
        System.out.println("The result of 100 * 200 : " + (100 * 200));
    }
}
