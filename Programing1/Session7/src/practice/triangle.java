package practice;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        int lines;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of lines");
        lines = input.nextInt();

        System.out.println("Triangle");
        drawTriangle(lines);
        System.out.println("Diamond");
        drawDiamond(lines);
    }

    public static void drawTriangle (int lines){
        for (int i = 1; i <= lines; i++ ){
            for (int j = lines-i; j > 0; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void drawDiamond (int lines){
        drawTriangle(lines);
        for (int i = lines-1; i >0 ; i-- ){
            for (int j = 0; j < lines-i; j++){
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
