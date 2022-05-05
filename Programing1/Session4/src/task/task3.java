package task;

        /*Write a program to prompt user to enter the following information
        1-	“Please Enter your first name”
        2-	Take user’s first name
        3-	show a message “Please Enter your last name”
        4-	Take user’s last name
        5-	show a message “Please Enter your age”
        6-	Take user’s age
        7-	Show the user a message that uses those values => Hello : last name, you have year’s old; nice to meet you! -> use printf
        8-	Create a random number between 1 and 50
        9-	Show a message “Please guess a number between 1 and 50”
        10-	After user entered the number, check If the number is equal print message “you are lucky”
        11-	if the number is greater than the generate number, then message the user => “Choose a smaller one you, you were unlucky”
        12-	if the number is smaller than the generate number, then message the user => “Choose a bigger one, you were unlucky”*/


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        String fistName = "";
        String lastName = "";
        int age = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your first name");
        fistName = input.nextLine();
        System.out.println("Please Enter your last name");
        lastName = input.nextLine();
        System.out.println("Please Enter your age");
        age = input.nextInt();

        System.out.printf("Hello %s.\nYou have %d year's old.\nNice to meet you!\n", lastName, age);

        int number = (int)(Math.random()*50 + 1);
        int guessNum;
        System.out.println("Please guess a number between 1 and 50");
        guessNum = input.nextInt();

        while (true){
            if (guessNum == number) {
                System.out.println("You are lucky");
                break;
            } else if (guessNum > number){
                System.out.println("Choose a smaller one you, you were unlucky. Try again.");
                guessNum = input.nextInt();
            } else {
                System.out.println("Choose a bigger one, you were unlucky. Try again.");
                guessNum = input.nextInt();
            }
        }
    }
}
