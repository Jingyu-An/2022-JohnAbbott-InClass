package session9;

import java.util.Arrays;

public class Ploblem3 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,12,-23,12,324,12,-23,12,32,11};
        int maxNum = findMaxNumber(array);
        int minNum = findMinNumber(array);
        System.out.println("Max Number : " + maxNum);
        System.out.println("Min Number : " + minNum);

    }

    public static int findMaxNumber(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static int findMinNumber(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
