package project;

import java.util.Random;

public class Question5 {
    public static void main(String[] args) {

        Random rand = new Random();
        int size = rand.nextInt(20); //create random size of array
        while (size <= 1){ //check size of array
            size = rand.nextInt(20);
        }
        if (size%2 == 0) { //Check if array size is even
            size++; //change array size to odd
        }

        int[] array = new int[size]; //create array
        fillArray(array); //call fillArray method
        printArray(array); //call printArray method

        int majorityNumber = findMajorityElement(array); //call findMajorityElement method and put return value into majorityNumber
        System.out.println("Output: " + majorityNumber);
    }

    /* fill array method */
    public static void fillArray(int[] array){

        Random rand = new Random();
        int randomNumber = rand.nextInt(10); //create random value

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(2) + randomNumber;
            //create random value between 0 and 1, and then sum randomNumber.
            //it is made 2 numbers.
        }
    }

    /* find majority element method */
    public static int findMajorityElement(int[] array){

        int number1 = array[0]; // one of elements in array.
        int number2 = 0;
        int count = 0;
        int majorityNumber;

        for (int j : array) {
            if (number1 == j) { //check one of elements in array and count
                count++;
            } else if (number2 == 0) { //put the other number into number2 onetime
                number2 = j;
            }
        }
        if (count > array.length/2) //the count check for find majority number
            majorityNumber = number1;
        else
            majorityNumber = number2;

        return majorityNumber;
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
}
