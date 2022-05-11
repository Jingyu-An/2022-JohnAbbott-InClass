package session8;

import java.util.Random;

public class DimensionalArray {
    public static void main(String[] args) {

        int[][] array1 = new int[3][5];

        //int[][][] array2 = new int[2][3][4];
        initialArray(array1);
        printArray(array1);

    }

    public static void initialArray(int[][] arr){
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
            System.out.println("");
        }
    }
}
