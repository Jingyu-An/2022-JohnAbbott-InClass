package session9;

        /*Getting the size of array from use

        We ask user to put values

        Printing the array

        Ask user which index wants to remove (Method)

        Print the new array*/

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        int sizeOfArray = Problem4.gettingSize();
        int[] array = new int[sizeOfArray];
        Problem4.putValueOfArray(array);
        Problem4.printArray(array);

        int[] arrayNew;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index number you want to remove : ");
        int removeIndex = input.nextInt();
        while (removeIndex < 0 || removeIndex > sizeOfArray){
            System.out.print("Enter the index number you want to remove : ");
            removeIndex = input.nextInt();
        }
        arrayNew = removeArray(array, removeIndex);
        Problem4.printArray(arrayNew);
    }

    public static int[] removeArray(int[] arr, int index) {
        int[] newArray = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++){
            if (i >= index) {
                newArray[i] = arr[i+1];
            }else {
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }
}
