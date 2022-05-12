package session9;

    /*Getting the size of array from use

    We ask user to put values

    Printing the array

    Asking for use which number wants to search inside the array    15

    You return index

    Ask from user which number wants to replace   0   method*/

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        int arraySize = gettingSize();
        int[] array = new int[arraySize];
        putValueOfArray(array);
        printArray(array);

        int findValue = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you find in array : ");
        findValue = input.nextInt();
        int findValueIndex = searchArray(array, findValue);


        System.out.print("Which number wants to replace? ");
        int replaceValue = input.nextInt();
        replaceArray(array, replaceValue, findValueIndex);
        printArray(array);

    }

    public static int gettingSize(){
        int size = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        size = input.nextInt();
        while (size < 0){
            System.out.print("Enter the size of array : ");
            size = input.nextInt();
        }
        return size;
    }

    public static int[] putValueOfArray(int[] arr){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the value in index %d : ", i);
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.print("Your array : ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int searchArray(int[] arr, int findValue){
        for (int i = 0; i < arr.length; i++){
            if (findValue == arr[i]){
                System.out.printf("Your number %d is in index %d", findValue, i);
                System.out.println();
                return i;
            }
        }
        System.out.println("I couldn't find it.");
        return -1;
    }

    public static void replaceArray(int[] arr, int value, int index){
        if (index != -1){
            System.out.printf("Replace %d to %d", arr[index], value);
            arr[index] = value;
            System.out.println();
            return;
        }
        System.out.println("No change!");
    }
}
