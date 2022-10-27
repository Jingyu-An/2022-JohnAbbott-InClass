package assign;

        /*online Music/Apps Store

        An online music and apps store offers all apps for 3$ each and all songs for 7$ each.
        The store requires members to prepay any amount of money they wish, and then download as many apps or as many songs accordingly.
        You are required to write a program that would ask the user for the amount that he/she will pay, then display two messages indicating:
        - the maximum number of apps that can be downloaded, and how much funds will remain in the account after that, if any.
        - the maximum number of songs that can be downloaded, the number of apps that can be downloaded after that if funds allow,
        and how much funds will remain in the account after that, if any.
         Notice the parenthesis in app(s) and song(s) in the output.

        For this assignment, assume that the user will always enter a valid integer value that is >= 0, and within the limit of the integer range.
        Here is an example of how your program should behave (the value (shown in bolded italic for clarification purpose only) is entered by the user):
        */


import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        int appPrice = 3; //3$
        int songPrice = 7; //7$

        int moneyPrepay;
        int apps;
        int songs;
        int moneyLeft;
        Scanner inputMoney = new Scanner(System.in);

        System.out.println("How much money do you wish to prepay? ");
        moneyPrepay = inputMoney.nextInt();

        while ( moneyPrepay < 0 ){
            System.out.println("Invalid value. Try again");
            moneyPrepay = inputMoney.nextInt();
        }

        apps = moneyPrepay / appPrice;
        moneyLeft = moneyPrepay % appPrice;

        System.out.printf("With this amount, you will be able to purchase %d app(s). You will then have %d$ left as a credit on your account.\n", apps, moneyLeft);

        songs = moneyPrepay / songPrice;
        apps = (moneyPrepay % songPrice) / appPrice;
        moneyLeft = (moneyPrepay % songPrice) % appPrice;

        System.out.printf("Alternatively, for this amount, you will be able to purchase %d song(s) and %d app(s). You will then have %d$ left as a credit on your account.\n", songs, apps, moneyLeft);
        System.out.println("Thanks for Shopping at Best Music Store!");
    }
}
