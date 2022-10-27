package assign;

//write a program to simulate 'rock, scissors, paper'

import java.util.Scanner;

public class Assign {
    public static void main(String[] args) {

        int computer;
        int player;

        computer = (int)(Math.random()*3);
        System.out.println("The 'rock, scissors, paper' Game\n" +
                "Enter the number 0 to 2\n" +
                "Rock:0, Scissors:1 Paper:2");

        Scanner input = new Scanner(System.in);
        player = input.nextInt();
        while (player<0 || player>2){
            System.out.println("Incorrect value....Please try again and enter an integer 1 through 3");
            player = input.nextInt();
        }

        input.close();

        if (player == computer) {
            System.out.println("Draw. You : %d, Computer : %d");
        } else if ( (player == 0 && computer == 1) || (player == 1 && computer == 2) || (player == 2 && computer == 0)) {
            System.out.printf("Win. You : %d, Computer : %d", player, computer);
        } else{
            System.out.printf("Defeat. You : %d, Computer : %d", player, computer);
        }
    }
}
