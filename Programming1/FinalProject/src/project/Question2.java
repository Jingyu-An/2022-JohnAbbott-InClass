package project;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Joker:\n");
        int joker = input.nextInt(); //joker input
        System.out.print("Number :\n");
        int number = input.nextInt(); //number input

        int[] arrayNumbers = new int[number]; //create number size of array
        callItJoker(joker, arrayNumbers); //call callItJoke method

    }

    /* call it joker method */
    public static void callItJoker(int joker, int[] array){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers:\n");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt() % joker; //input the number and put remainder of joker into array
        }

        System.out.println();
        for (int i : array){
            System.out.print(i + " "); //print array
        }
    }
}
