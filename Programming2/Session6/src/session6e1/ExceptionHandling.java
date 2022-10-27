package session6e1;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the two numbers : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        try {
            divide(x,y);
        } catch (Exception e) {
            String s = e.getMessage();
            System.out.println(s);
        }
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
