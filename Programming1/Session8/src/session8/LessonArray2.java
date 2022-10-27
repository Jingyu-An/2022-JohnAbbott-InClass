package session8;

import java.util.Scanner;

public class LessonArray2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size? ");
        int size = input.nextInt();
        int[] arr1 = new int[size];

        makeArray(arr1);
        printArray(arr1);

        System.out.print("Enter the value you are looking for? ");
        int value = input.nextInt();
        findIndex(arr1, value);
    }

    public static void makeArray(int[] arr){
//        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
//            System.out.println("give the value for index number " + i);
            arr[i] = i*5;
//            arr[i] = input.nextInt();
        }
    }

    public static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i + "  ");
        }
        System.out.println("");
    }

    public static void findIndex(int[] arr, int value){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                System.out.println(value + " is in index " + i);
                return;
            }
        }
        System.out.println("I couldn't find it.");
    }
}
