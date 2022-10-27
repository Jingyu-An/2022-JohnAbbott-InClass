package assign1;

    /*Write a program that prompts the user to enter the
    side of a hexagon and displays its area.*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int sideOfHexagon;
        double areaOfHexagon;

        System.out.println("Enter the side of a hexagon ");
        Scanner input = new Scanner(System.in);
        sideOfHexagon = input.nextInt();

        areaOfHexagon = ( 3 * (Math.pow(3, 0.5)) * (Math.pow(sideOfHexagon, 2)) ) / 2;
        System.out.println("The hexagon area is " + areaOfHexagon);
    }
}
