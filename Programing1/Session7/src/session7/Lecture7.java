package session7;

import java.util.Scanner;

public class Lecture7 {
    public static void main(String[] args) {

        int fibonacciNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        fibonacciNum = input.nextInt();

        System.out.println(fibonacci(fibonacciNum));
    }
    public static int fibonacci(int number){
        if (number == 0){
            return 0;
        }else if (number == 1){
            return 1;
        }else {
            return ( fibonacci(number - 2) + fibonacci(number - 1) );
        }
    }
}
