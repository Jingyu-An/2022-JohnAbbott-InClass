package session8;

import java.util.Arrays;
import java.util.Scanner;

public class LessionArray {
    public static void main(String[] args) {

        /*int[] array1 = new int[4]; //I create the object array with size of 4

        array1[0] = 2;
        array1[1] = 78;
        array1[2] = 32;
        array1[3] = -1;

        int [] array2 = {2, 3, 56,  27, 12, 76};

        System.out.println("array1");
        for (int i = 0; i < 4; i++){
            System.out.println(array1[i]);
        }

        System.out.println("array2");
        for (int j : array2) {
            System.out.println(j);
        }*/

        Scanner input = new Scanner(System.in);
        int value;

        int[] array1 = {1, 2, 3, 4, 5, 11, -13, 0, 15, 34, 434, 21};

        System.out.println("enter the value you want");
        value = input.nextInt();
        findValue(array1, value);
        System.out.println("dddd");
    }

    public static void findValue(int[] array, int num){
        for (int i : array){
            if(i == num){
                System.out.println("Your number is in array");
                return;
            }
        }
        System.out.println("Your number is not in array");
    }
}
