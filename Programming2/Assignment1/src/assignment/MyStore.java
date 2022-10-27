package assignment;

import java.util.Scanner;

public class MyStore {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ComputerStore.printWelcome(); //Call printWelcome method
        System.out.print("How many could you keep computers? ");
        int numOfComputers = input.nextInt();

        Computer[] inventory = new Computer[numOfComputers]; //Create array of Computer object

        mainMenuSelection(inventory); //Call mainMenuSelection method
    }

    /* main menu method */
    public static void mainMenuSelection(Computer[] inventory) {

        Scanner input = new Scanner(System.in);

        while (true) {
            ComputerStore.printMainMenu(); //Call printMainMenu method
            int option = input.nextInt();
            switch (option) {
                case 1:
                    ComputerStore.optionOne(inventory); //Call optionOne method
                    break;
                case 2:
                    ComputerStore.optionTwo(inventory); //Call optionTwo method
                    break;
                case 3:
                    ComputerStore.optionThree(inventory); //Call optionThree method
                    break;
                case 4:
                    ComputerStore.optionFour(inventory); //Call optionFour method
                    break;
                case 5: //closing program
                    ComputerStore.printClosing(); //Call printClosing method
                    System.exit(0); //end the driver
                default:
                    break;
            }
        }
    }
}