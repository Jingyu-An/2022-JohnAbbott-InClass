package sassion6;

import java.util.Scanner;

public class Lecture6 {
    public static void main(String[] args) {

        /*While Start  -------------------------------
        int i = 0;
        while( i<5 ){   //Condition

            //Statements
            System.out.println("Hello");
            i++;
        }

        int count;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 12 : ");
        count = input.nextInt();

        if (count<1 || count>12){
            System.out.println("Sorry, invalid number");
            System.exit(0);
        }
        System.out.println("Please enter a number you want to reach : ");
        int limit = input.nextInt();

        while (count<1 || count>12){
            System.out.println("Sorry, invalid number. Please enter again");
            count = input.nextInt();
        }

        while (count<=limit){
            System.out.println(count);
            count++; //count = count + 1;
        }

        System.out.println("Done!!");

        int sum = 0;
        int multiple = 1;
        int count = 1;
        int limit;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        limit = input.nextInt();

        while (count <= limit){
            sum = sum + count;
            multiple = multiple * count;
            count++;
        }
        System.out.println(sum);
        System.out.println(multiple);
        While End    -------------------------------*/

        /*Do-While Start   ---------------------------
        int i = 6;

        while (i < 5) {
            System.out.println("While : " + i);
            i++;
        }

        do {
            System.out.println("Do-Wile : " + i);
        } while (i<5);

        int count;
        int i = 1;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        count = input.nextInt();

        do {
            sum = sum + i;
            i++;
        }while (i <= count);
        System.out.println(sum);
         Do-While End -------------------------------*/

        /* For Start    -------------------------------
        int sum = 0;
        int limit;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        limit = input.nextInt();

        for ( int i = 0; i <= limit; i++){
            sum = sum + i;
            if (i == limit){
                System.out.printf("%d", i);
            }else {
                System.out.printf("%d + ", i);
            }
        }
        System.out.println(" = " + sum);
        For End      -------------------------------*/

        /*boolean flag = true;
        while (flag == true) {
            int random = (int)(Math.random() * ((10-0)+1));
            if (random > 5) {
                flag = true;
            } else {
                flag = false;
            }
            System.out.println("flag is " + flag);
            System.out.println(random);
        }

        int weeks = 3;
        int days = 7;

        for (int i = 1; i<=weeks; i++) {
            System.out.println("Weeks number " + i);

            for (int j = 1; j <= days; j++) {
                System.out.println("days number " + j);
            }
        }*/

        int lines;
        Scanner input = new Scanner(System.in);
        System.out.println("Give me the number of line");
        lines = input.nextInt();

        while ( lines < 1 || lines > 10){
            System.out.println("Invalid number. Try again.");
            lines = input.nextInt();
        }

        lines = lines*2 -1;

        for (int i = 1; i <= lines; i += 2){
            for (int j = 1; j <= (lines-i)/2; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = lines-2; i >= 1; i -= 2){
            for (int j = 1; j <= (lines-i)/2; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}