package example;

public class Identifier2 {
    public static void main(String[] args) {

        boolean flag = false; // the default value is false;

        // if -> if it happens or if it is true, then do this
        // if it is not true do that !!!

        if (flag == true) {
            System.out.println("flag is true");
        }
        //if (flag == false) {
        //  System.out.println("flag is false");
        //}
        else {
            System.out.println("flag is false");
        }

        int number = 12;

        boolean check = number > 10;

        //if (number > 12)
        //if (check)
        if (check == true) {
            System.out.println("number is greater than 10");
        }
        else {
            System.out.println("number is less than 10");
        }

        char ch = 'd';

        //precedence
        int result = 12 + 15 * 19 / 3;

        //int result2 = 2 + 3.5;
        float result2 = 2 + 3.5f;

        double result3 = 2 + 3.5; // that's the rule to add f beside the number
    }
}
