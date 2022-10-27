package assignment;

/*
 * _________________________
 * Assignment 2
 * Part 2
 * Jingyu An / 2228416
 * -------------------------
 * */

import java.util.*;

public class LadderAndSnake {

    private String playerName;
    private int playerLocation; //current location
    private int order; //value for order of playing

    /* Array of map  */
    private int[][] board =
                   {{38,  2,  3, 14,  5,  6,  7,  8, 31, 10 },
                    {11, 12, 13, 14, 15,  6, 17, 18, 19, 20 },
                    {42, 22, 23, 24, 25, 26, 27, 84, 29, 30 },
                    {31, 32, 33, 34, 35, 44, 37, 38, 39, 40 },
                    {41, 42, 43, 44, 45, 46, 47, 30, 49, 50 },
                    {67, 52, 53, 54, 55, 56, 57, 58, 59, 60 },
                    {61, 19, 63, 60, 65, 66, 67, 68, 69, 70 },
                    {91, 72, 73, 74, 75, 76, 77, 78, 79, 100},
                    {81, 82, 83, 84, 85, 86, 87, 88, 89, 90 },
                    {91, 92, 68, 94, 24, 96, 76, 78, 99, 100}};



    public LadderAndSnake(int numOfPlayer) {

        this.playerName = "Player " + numOfPlayer; //Create name of player with player number
        this.playerLocation = 0;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int flipDice() {

        Random random = new Random();

        return random.nextInt(6) + 1; //Create numbers between 1 and 6
    }

    /* auto play */
    public int play() {

        int dice;
        dice = this.flipDice(); //first flip dice

        System.out.print(this + " got a dice value of " + dice + "; ");

        this.playerLocation += dice; // add number of dice for current location

        if (this.playerLocation == 100) { //check 100

            System.out.println("now in square " + this.playerLocation);
            return this.playerLocation;
        } else if (this.playerLocation > 100) { //check over 100

            this.playerLocation = 100 - this.playerLocation % 10; //move backward with the excessive amount
        }

        int boardRow = this.playerLocation / 10; // calculate row value with current location
        int boardCol = this.playerLocation % 10; // calculate col value with current location
        if (boardCol == 0) // value is multiple of 10, row index 1 greater than current row. should be decremented by 1
            boardRow -= 1;
        else
            boardCol -= 1; // remainder is 1 greater than index. should be decremented by 1.

        /* Check the map with current location*/
        if (board[boardRow][boardCol] > this.playerLocation) { //player is at a square of a ladder bottom, go up

            System.out.print("gone to square " + this.playerLocation + " then up to square " + board[boardRow][boardCol]);
            this.playerLocation = board[boardRow][boardCol];
        } else if (board[boardRow][boardCol] < this.playerLocation) { //player is at a square of a snake head, go down

            System.out.print("gone to square " + this.playerLocation + " then down to square " + board[boardRow][boardCol]);
            this.playerLocation = board[boardRow][boardCol];
        } else {

            System.out.print("now in square " + board[boardRow][boardCol]);
        }
        System.out.println();

        return this.playerLocation;
    }

    @Override
    public String toString() { //return players name
        return playerName;
    }

    @Override
    public boolean equals(Object o) { //check the order for order of playing
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LadderAndSnake that = (LadderAndSnake) o;
        return order == that.order;
    }
}