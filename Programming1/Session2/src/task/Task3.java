package task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        System.out.println("Enter a celsius");
        Scanner scanCelsius = new Scanner(System.in);
        celsius = scanCelsius.nextDouble();

        fahrenheit = (celsius * 9 /5) + 32;
        System.out.println(celsius + " celsius = " + fahrenheit + " fahrenheit");
    }
}
