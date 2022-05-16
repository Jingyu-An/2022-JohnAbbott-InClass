package project;

import java.util.Random;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row;
        int col;

        do { //input row and col
            System.out.print("Enter numbers of row and col: (row > 0, col > 0)\n");
            row = input.nextInt();
            col = input.nextInt();
        }while (row < 1 || col < 1); //check row and col is greater than 0

        int[][] array = new int[row][col]; //create two-dimensional array

        fillArray(array); //call fillArray method
        printArray(array); //call printArray method

        System.out.print("Enter the number you want to disappear:\n");
        int number = input.nextInt(); //input disappear number

        int[][] newArray = copyArray(array); //copy array to newArray, keep original array.
        disappearNumber(newArray,number); //call disappearNumber method
        printArray(newArray); //call printArray method
    }

    /* fill array method */
    public static void fillArray(int[][] array){

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100); //put random number between 1 and 100 into array.
            }
        }
    }

    /* copy array method */
    public static int[][] copyArray(int[][] array){

        int[][] tempArray = new int[array.length][array[0].length]; //create temp array for copy

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tempArray[i][j] = array[i][j]; //put each value of array into tempArray
            }
        }
        return tempArray;
    }

    /* disappear number method */
    public static void disappearNumber(int[][] array, int number){

        int count = 0; //counter for changed number

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) { //find number in array
                    array[i][j] = 0; //change number to 0
                    System.out.printf("Array[%d][%d] : %d\n", i, j, number);
                    count++;
                }
            }
        }
        if (count != 0) //if found number(s) in array
            System.out.printf("I found %d number(s) and changed them.\n", count);
        else
            System.out.print("I couldn't find it.\n");
    }

    /* print array method */
    public static void printArray(int[][] array){
        System.out.println();
        for (int[] i : array){
            for (int j : i){
                System.out.print(j + " "); //print each value of array
            }
            System.out.println();
        }
        System.out.println();
    }
}
