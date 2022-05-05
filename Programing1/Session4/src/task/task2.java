package task;

    /*Write a program that prompts theWrite a program that prompts the
    user to enter the month and year and displays the number of days in the
    month. For example, if the user entered month 2 and year 2012, the program
    should display that February 2012 had 29 days. If the user entered month 3
    and year 2015, the program should display that March 2015 had 31 days.

    use this link-> https://coda.io/@hales/simple-online-calculator-for-dates-and-times/how-many-months-of-the-year-have-28-days-13
    don't forget about leap years that have 29 days !!!*/

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        int monthNum;
        String month="";
        int year;
        int daysOfMonth=0;

        System.out.println("Enter the month and year");
        Scanner input = new Scanner(System.in);
        monthNum = input.nextInt();
        year = input.nextInt();

        while (monthNum < 1 || monthNum > 12) {
            System.out.println("Invalid month. Enter the month and year again");
            monthNum = input.nextInt();
            year = input.nextInt();
        }

        switch (monthNum){
            case 1:
                month = "January";
                daysOfMonth = 31;
                break;
            case 2:
                month = "February";
                if ( (year%4 ==0) && (year%100!=0) ) {
                    daysOfMonth = 29;
                } else {
                    daysOfMonth = 28;
                }
                break;
            case 3:
                month = "March";
                daysOfMonth = 31;
                break;
            case 4:
                month = "April";
                daysOfMonth = 30;
                break;
            case 5:
                month = "May";
                daysOfMonth = 31;
                break;
            case 6:
                month = "June";
                daysOfMonth = 30;
                break;
            case 7:
                month = "July";
                daysOfMonth = 31;
                break;
            case 8:
                month = "August";
                daysOfMonth = 31;
                break;
            case 9:
                month = "September";
                daysOfMonth = 30;
                break;
            case 10:
                month = "October";
                daysOfMonth = 31;
                break;
            case 11:
                month = "November";
                daysOfMonth = 30;
                break;
            case 12:
                month = "December";
                daysOfMonth = 31;
                break;
            default:
                month = "Invalid month";
                break;
        }

        System.out.printf("%s %d had %d days", month, year, daysOfMonth);

    }
}
