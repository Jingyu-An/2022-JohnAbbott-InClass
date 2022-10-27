package session9;

import java.util.Scanner;

        /*Getting the size of array from use

        We ask user to put values

        Printing the array

        Ask user how many value wants to expand */


public class Problem5 {
    public static void main(String[] args) {

        int arraySize = Problem4.gettingSize();
        int[] array = new int[arraySize];
        Problem4.putValueOfArray(array);
        Problem4.printArray(array);

        int extendLength = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        extendLength = input.nextInt();

        int[] newArray = extendArray(array, extendLength);
//        Problem4.putValueOfArray(newArray);
        Problem4.printArray(newArray);

    }

    public static int[] extendArray(int[] arr,int extendNum){
        int[] newArray = new int[arr.length + extendNum];
        for (int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
