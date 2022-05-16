package project;

import java.util.Random;

public class Question6 {
    public static void main(String[] args) {

        Random rand = new Random();
        int size = rand.nextInt(20); //create random size of array
        while (size <= 1){ //check size of array
            size = rand.nextInt(20);
        }

        int[] array = new int[size]; //create array
        fillArray(array); //call fillArray method
        printArray(array); //call printArray method
        findMissingNumber(array); //call findMissingNumber method
    }

    /* fill array method */
    public static void fillArray(int[] array){

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) { //using nested loops for check duplicate values
            array[i] = rand.nextInt(array.length+1); //put the random value into array
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) //Check for duplicate values
                    i--; //rebuild random value
            }
        }
    }

    /* print array method */
    public static void printArray(int[] array){
        System.out.print("Input: nums = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length-1){ //skip print last ','
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    /* find missing number method */
    public static void findMissingNumber(int[] array){

        int missingNumber = -1; //variable initialization
        int size = array.length;

        ascendingSortArray(array); //call ascendingSortArray method for check missing number easier

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i+1) //check the value of array is not same with i+1 for find missing number
                missingNumber = i+1;
        }

        System.out.println("Output: " + missingNumber);
        System.out.printf("Explanation: n = %d since there are %d numbers, so all numbers are in the rage [0,%d]." +
                " %d is the missing number in the rage since it does no appear in nums.\n", size, size, size, missingNumber);
    }

    /* sort ascending method */
    public static void ascendingSortArray(int[] array){

        int tempNumber; //temporary number storage for sorting

        for (int i = 0; i < array.length; i++) { //using nested loops for sorting
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]){ //current array value is greater than next
                    tempNumber = array[j+1]; //put next array value into tempNumber
                    array[j+1] = array[j]; //put current array value into next array value
                    array[j] = tempNumber; //put the tempNumber into the current array value
                }
            }
        }
    }
}
