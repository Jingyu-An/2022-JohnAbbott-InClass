package test;

import java.util.Scanner;

//import java.util.Scanner;//import means bringing some codes from another place


//comment -> what ever I write here will be transparnet/invisible for the
//compiler


//line 7 -> class declaration

public class Test {

    //line 10: main method and the excution of the java app starts here
    public static void main(String[] args) {
        System.out.println("hello FSD");
        //println -> means go to the next line

        //printing a result into the console
        System.out.print("Hello World  : ");

        //System : is a class in JDK
        //. : is being used to command
        //out.
        //print
        //("Hello world")
        int sum = 1 + 2;
        System.out.println(sum);
        System.out.println(1 + 2);
        System.out.println(3 * 6);

        //how I get something from user?
        Scanner scan = new Scanner(System.in);
        //a variable
        System.out.print("insert your name");
        String input = scan.next();

        System.out.print("insert your age");
        int number = scan.nextInt();


        System.out.println(input);
        System.out.println(number);
    }
}
