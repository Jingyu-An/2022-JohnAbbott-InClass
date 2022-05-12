package session9;

import java.util.Random;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array row and col ");
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] array = new int[row][col];
        modifyArray(array);
        printArray(array);


        System.out.print("Enter the number you find in array : ");
        int findValue = input.nextInt();
        int[] indexArray = new int[2];
        indexArray = searchIndex(array, findValue);

        if (indexArray != null){
            System.out.print("Which number wants to replace? ");
            int replaceValue = input.nextInt();
            replaceArray(array, indexArray[0], indexArray[1], replaceValue);
        }
        printArray(array);
    }

    public static void modifyArray(int[][] arr){
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void printArray(int[][] arr){
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[] searchIndex(int[][] arr, int value){
        int[] index = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == value){
                    System.out.printf("%d is in index[%d][%d]", value, i, j);
                    System.out.println();
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        System.out.println("I couldn't find it.");
        return null;
    }

    public static void replaceArray(int[][] arr, int row, int col, int number){
        arr[row][col] = number;
    }
}
