package project;

import java.util.Random;

public class Question4 {
    public static void main(String[] args) {

        Random rand = new Random();
        int size = rand.nextInt(20); //create random size of array
        while (size <= 1){ //check size of array
            size = rand.nextInt(20);
        }

        System.out.printf("Create random size of array, size = %d\n", size);

        int[] array = new int[size]; //create array
        fillArray(array); //call fillArray method
        printArray(array); //call printArray method

        int[] ascendingArray = copyArray(array); //Create a new array for sorting in ascending order, keep original array
        System.out.println();
        System.out.println("Sort Ascending");
        ascendingSortArray(ascendingArray); //call ascendingSortArray method
        printArray(ascendingArray); //call printArray method

        int[] descendingArray = copyArray(array); //Create a new array for sorting in descending order, keep original array
        System.out.println();
        System.out.println("Sort Descending");
        descendingSortArray(descendingArray); //call descendingSortArray method
        printArray(descendingArray); //call printArray method
    }

    /* fill array method */
    public static void fillArray(int[] array){

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); //put random value between 1 and 100 into array
        }
    }

    /* copy array method */
    public static int[] copyArray(int[] array){

        int[] tempArray = new int[array.length]; //Create new array for copy

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i]; //put each value of array into temp array
        }
        return tempArray;
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

    /* sort descending method */
    public static void descendingSortArray(int[] array){

        int tempNumber; //temporary number storage for sorting

        for (int i = 0; i < array.length; i++) { //using nested loops for sorting
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] < array[j+1]){ //The number is less than
                    tempNumber = array[j+1]; //put next array value into tempNumber
                    array[j+1] = array[j]; //put current array value into next array value
                    array[j] = tempNumber; //put the tempNumber into the current array value
                }
            }
        }
    }

    /* print array method */
    public static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
