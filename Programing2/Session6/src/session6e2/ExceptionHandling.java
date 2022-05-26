package session6e2;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the two numbers : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        divide(x,y);
    }

    public static void divide(double x, double y) throws Exception {

        double result;

        if (y == 0) {
            throw new Exception("It wrong!!");
        }
        else {
            result = x / y;
            System.out.println(result);
        }
    }
}
