package assign;

import java.util.Scanner;

public class Assignment2 {
    public static boolean flagFirstSelectPattern = true; //flag for program repeats
    public static void main(String[] args) {

        int patternNum; //Variable of pattern number
        int rowsNum; //Variable of rows number

        System.out.println("\n-- Welcome to Jingyu Triangle / Diamond / Printer --\n"); //welcome message

        while (true) { //Infinite loop until select 5
            patternNum = selectPattern(); //Call selectPatter method and get pattern number 1~4 or -1(exit)
            if (patternNum == -1) {
                System.out.println("\nHope you enjoyed the triangles ..."); //Closing message
                break; //exit the program.
            }
            rowsNum = selectRows(); //Call selectRow method and get the rows number 2~10
            printPattern(patternNum,rowsNum); //Call printPattern method with pattern number and rows number
        }

    }

    /*Print method pattern example*/
    public static void printPattern(){
        System.out.println("1) 54321    2)     1    3) 12345    4)   1");
        System.out.println("   5432           12        2345        123");
        System.out.println("   543           123         345       12345");
        System.out.println("   54           1234          45        123");
        System.out.println("   5           12345           5         1");
    }

    /*Select pattern number method*/
    public static int selectPattern(){

        Scanner input = new Scanner(System.in); //input
        int patternNum; //Variable of pattern number

        if (flagFirstSelectPattern) {  //Check the flagFirstSelectPattern for program repeats
            System.out.println("Which pattern do you want to print?"); //first run message
            flagFirstSelectPattern = false; //Change flag to false
        } else {
            System.out.println("So which pattern do you want to print?"); //program repeat message
        }

        printPattern(); //Call printPattern method
        System.out.print("Enter your choice (5 to Quit) : ");
        patternNum = input.nextInt(); //input pattern number 1~5

        while (patternNum < 1 || patternNum > 5){ //check the valid pattern number
            System.out.printf("Woops! %d is an illegal choice. Try again.\n", patternNum);
            System.out.print("Please enter the number between 1 and 5 inclusive(5 to Quit) : ");
            patternNum = input.nextInt();
        }
        if (patternNum == 5) { //Check the pattern number is 5
            return -1;//Return -1 to exit the program.
        }
        return patternNum; //return selected pattern number
    }

    /*Select rows number method*/
    public static int selectRows(){

        Scanner input = new Scanner(System.in);
        int rows; //Variable of rows number

        do { //same message until enter the valid rows number
            System.out.print("How many rows would you like to print? (More than 1 please) : ");
            rows = input.nextInt();
        }while (rows < 2 || rows >9); //Check the valid rows number are between 2 and 9

        return rows; //return rows number
    }

    /*Print pattern method*/
    public static void printPattern(int pattern, int rows){

        int evenRows = rows; //Checking variable for rows is even or odd
        System.out.println(); //add newline for better look

        switch (pattern){ //Check the pattern number
            case 1 :
                for (int i = 0; i < rows; i++){
                    for (int j = rows; j > i; j--){
                        System.out.print(j);
                        // j starts rows number and prints backward rows number until j>i;
                    }
                    System.out.println(); //add newline
                }
                break;
            case 2 :
                for (int i = 1; i <= rows; i++){
                    //i starts at 1 because j is easier to calculate.
                    for (int j = rows-i; j > 0; j--){
                        System.out.print(" ");
                        // j starts rows-i number and prints spaces;
                        // j is the number of lines minus 1, which prints a space on the first line.
                    }
                    for (int j = 1; j <= i; j++){
                        System.out.print(j);
                        // j starts 1 and prints 1 to 5
                    }
                    System.out.println(); //add newline
                }
                break;
            case 3 :
                for (int i = 0; i < rows; i++){
                    for (int j = 0; j < i; j++){
                        System.out.print(" ");
                        // j starts 0 and prints spaces;
                    }
                    for (int j = 0; j < rows-i; j++){
                        System.out.print(j+i+1);
                        // j and i starts 0. so I print j+i+1 because it starts print 1
                    }
                    System.out.println(); //add newline
                }
                break;
            case 4 :
                //Top triangle print
                for (int i = 1; i <= rows; i += 2){
                    //i += 2 because this pattern needs odd numbers of numbers
                    for (int j = 1; j <= (rows-i)/2; j++){
                        //Need spaces half of previous patterns
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++){
                        System.out.print(j);
                        //print numbers until i
                    }
                    System.out.println(); //add newline
                }

                //Check rows number is even
                if (rows%2 == 0){
                    evenRows = rows + 1;
                    //Put rows + 1 value into evenRows.
                    //evenRows become odd number
                }
                //bottom triangle print
                for (int i = evenRows-2; i > 0; i -= 2){
                    //i -= 2 because this pattern needs odd numbers of numbers
                    for (int j = 1; j <= (evenRows-i)/2; j++){
                        //Need spaces half of previous patterns
                        if (evenRows != rows) {
                            //Rows is even number
                            //First rows of bottom triangle print skip for making pattern 4 because evenRows is rows +1
                            //put original rows value into evenRow for making pattern 4
                            evenRows = rows;
                            continue;
                        }
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++){
                        System.out.print(j);
                        //print numbers until i
                    }
                    System.out.println();
                }
                break;
            default:
                break;
        }
        System.out.println(); //add newline for better look
    }
}
