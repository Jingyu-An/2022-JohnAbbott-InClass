package task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        long minutes;
        long years;
        long days;

        Scanner scanMinutes = new Scanner(System.in);
        System.out.println("please enter the minutes");
        minutes = scanMinutes.nextLong();

        days = minutes / 1440;
        years = days / 365;
        days = days - (years * 365);

        System.out.println("Result = " + years + " years "+ days + "days");
    }
}
