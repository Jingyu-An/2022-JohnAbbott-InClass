package task;

    /*"Enter an integer for today's day of the week (Sunday is 0, Monday is 1, and Saturday is 6):
    Enter the number of days after today to discover the future day:*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int today;
        int afterDays;
        int futureDay;

        System.out.println("Enter an integer for today's day of the week" +
                "\n(Sun:0, Mon:1, Tues:2, Wed:3, Thur:4, Fri:5 Sat:6)");
        Scanner input = new Scanner(System.in);
        today = input.nextInt();
        while (today < 0 || today > 6) {
            System.out.println("Incorrect value....Please try again and enter an integer 0 through 6");
            today = input.nextInt();
        }

        System.out.println("Enter the number of days after today to discover the future day");
        afterDays = input.nextInt();
        futureDay = (afterDays + today)%7;
        input.close();
        /*System.out.println("The future day is " + futureDay +
                "\n(Sun:0, Mon:1, Tues:2, Wed:3, Thur:4, Fri:5 Sat:6)");*/
        if (futureDay == 0) {
            System.out.println("The future day is Sunday");
        } else if (futureDay == 1){
            System.out.println("The future day is Monday");
        } else if (futureDay == 2){
            System.out.println("The future day is Tuesday");
        } else if (futureDay == 3){
            System.out.println("The future day is Wednesday");
        } else if (futureDay == 4){
            System.out.println("The future day is Thursday");
        } else if (futureDay == 5){
            System.out.println("The future day is Friday");
        } else if (futureDay == 6){
            System.out.println("The future day is Saturday");
        }
    }
}
