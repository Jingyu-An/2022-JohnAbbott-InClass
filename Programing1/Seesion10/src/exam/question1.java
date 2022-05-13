package exam;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");  //message
        String name = input.nextLine(); //input a name

        makePattern(name); //Call makePatter method

    }

    /* Making pattern method */
    public static void makePattern(String name){

        System.out.println(); //add newline for output

        for (int i = 0; i < name.length(); i++){  //nested loop for print top triangle
            for (int j = 0; j < name.length()-i; j++) { // loop max value is changed from name.length to 0 depend on i
                System.out.print(name.charAt(j) + "\t"); //use charAt(index) for print each char
            }
            System.out.println(); //add newline for output
        }
        for (int i = 2; i <= name.length(); i++){ //nested loop for printing bottom triangle
            for (int j = 0; j < i; j++) { // loop max value is changed from i(start 2) to name.length
                System.out.print(name.charAt(j) + "\t");  //use charAt(index) for print each char
            }
            System.out.println(); //add newline for output
        }
    }
}
