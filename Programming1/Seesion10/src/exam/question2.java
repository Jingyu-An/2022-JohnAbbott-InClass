package exam;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please put your N value ?"); //message
        int nValue = input.nextInt(); //input N number

        int[][] originalArray = new int[nValue][nValue]; //make array with N
        int[][] newArray; //new array for revers
        inputArray(originalArray); //Call inputArray method
        newArray = reversArray(originalArray); //Call reversArray method and put the revered array into newArray
        printArray(newArray); //print array

    }

    /* input array method */
    public static void inputArray(int[][] array){

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) { //nested loop for input each value of dimensional Array
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt(); //input each value of array
            }
        }
    }

    /* revers array method */
    public static int[][] reversArray(int[][] array){

        int[][] reversArray = new int[array.length][array.length]; //variable of revers array

        //nested loop for input each value of dimensional Array
        for (int i = array.length-1; i >= 0; i--) { //i(row) starts array.length-1(max index) and will be 0(last index) because it works for revers array.
            for (int j = 0; j < array[i].length; j++) { //j starts 0 because col doesn't need to revers
                reversArray[(array.length-1)-i][j] = array[i][j]; //reversArray[0 to max index][j] = array[max index to 0][j]
            }
        }
        return reversArray; //return reversed array
    }

    /* print array method*/
    public static void printArray(int[][] array){

        for (int[] i : array) { //use foreach for print array easier
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
