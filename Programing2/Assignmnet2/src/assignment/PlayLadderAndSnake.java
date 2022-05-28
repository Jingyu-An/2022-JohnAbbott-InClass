package assignment;

/*
* _________________________
* Assignment 2
* Part 2
* Jingyu An / 2228416
* -------------------------
* */

import java.util.*;

public class PlayLadderAndSnake {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<LadderAndSnake> ladderAndSnakes = new ArrayList<>(); //Create ArrayList

        int count = 0; //number of players counter

        System.out.println("\n==============================================");
        System.out.println("===== Welcome to Jingyu Ladder And Snake =====");
        System.out.println("==============================================\n");

        System.out.println("Enter the # of players for your game - Number must be between 2 and 4 inclusively:");
        int numOfplayers = input.nextInt();

        while (numOfplayers < 2 || numOfplayers > 4) { //value check between 2 and 4
            count++;
            if (count == 4){ //if 4 times fail, program exit
                System.out.printf("Bad Attempt %d - You have exhausted all your chances. Program will terminate!\n", count);
                System.exit(0);
            }

            System.out.printf("Bad Attempt %d - Invalid # of players. Please enter a # between 2 and 4 inclusively:\n", count);
            numOfplayers = input.nextInt();
        }

        System.out.println("Game is Plated by " + numOfplayers + " players;");
        System.out.println("Now decideing which plater will start playing;");

        for (int i = 0; i < numOfplayers; i++) { //Create player whit class LadderAndSnake and initialize order of playing with flipDice()
            ladderAndSnakes.add(new LadderAndSnake(i+1));
            ladderAndSnakes.get(i).setOrder(ladderAndSnakes.get(i).flipDice()); //set order of playing with dice
            System.out.println(ladderAndSnakes.get(i) + " got a dice value of " + ladderAndSnakes.get(i).getOrder());
        }

        Collections.sort(ladderAndSnakes, new PlayerOrder().reversed()); //sort reversed for order of playing

        checkOrderOfPlaying(ladderAndSnakes); //check a tie and re-order of playing

        System.out.print("Reached final decision on order of playing: ");
        for (int i = 0; i < ladderAndSnakes.size(); i++) {

            System.out.print(ladderAndSnakes.get(i));

            if (i != ladderAndSnakes.size()-1)
                System.out.print(",");
        }
        System.out.println();

        boolean isFinish = false;


        while (!isFinish) { //play game until some player reaches 100

            int checkFinish = 0; //check 100

            for (LadderAndSnake ladderAndSnake : ladderAndSnakes) {
                checkFinish = ladderAndSnake.play(); //call play() method
                if (checkFinish == 100) { //some player wins
                    System.out.println("==============================================");
                    System.out.println("==============  " + ladderAndSnake + " WIN!" + "  ===============");
                    System.out.println("==============================================");
                    isFinish = true;
                    break;
                }
            }
            if (checkFinish != 100)
                System.out.println("Game not over; flipping again ");
        }


        System.out.println("\n==============================================");
        System.out.println("==== The game is over. See you next time. ====");
        System.out.println("==============================================\n");
    }

    /* check a tie and re-order of playing */
    public static void checkOrderOfPlaying(ArrayList<LadderAndSnake> players){

        // Check according to the number of players.
        if (players.size() == 2) { // two players

            while (players.get(0).equals(players.get(1))) { //re-call flipDice() and re-sort until two players' order is different.

                System.out.println("A tie was achieved between " + players.get(0) + " and " +
                        players.get(1) + ". Attempting to break the tie");

                /* re-call flipDice()*/
                players.get(0).setOrder(players.get(0).flipDice());
                players.get(1).setOrder(players.get(1).flipDice());

                System.out.println(players.get(0) + " got a dice value of " + players.get(0).getOrder());
                System.out.println(players.get(1) + " got a dice value of " + players.get(1).getOrder());

                /* re-sort */
                Collections.sort(players, new PlayerOrder().reversed());
            }
        } else if (players.size() == 3){ //three players

            /* check three players are same*/
            while (players.get(0).equals(players.get(1))
                && players.get(1).equals(players.get(2))){ //re-call flipDice() and re-sort until three players' order is different.

                System.out.println("A tie was achieved among " + players.get(0) + ", " +
                    players.get(1) + ", and " + players.get(2) + ". Attempting to break the tie");

                /* re-call filpDice()*/
                players.get(0).setOrder(players.get(0).flipDice());
                players.get(1).setOrder(players.get(1).flipDice());
                players.get(2).setOrder(players.get(2).flipDice());

                System.out.println(players.get(0) + " got a dice value of " + players.get(0).getOrder());
                System.out.println(players.get(1) + " got a dice value of " + players.get(1).getOrder());
                System.out.println(players.get(2) + " got a dice value of " + players.get(2).getOrder());

                /* re-sort */
                Collections.sort(players, new PlayerOrder().reversed());
            }

            /* check first and second players are same */
            while (players.get(0).equals(players.get(1))){ //re-call flipDice() and re-sort until two players' order is different.

                /* Preserve the last player's order of playing */
                players.get(2).setOrder(0);

                System.out.println("A tie was achieved between " + players.get(0) + " and " +
                        players.get(1) + ". Attempting to break the tie");

                players.get(0).setOrder(players.get(0).flipDice());
                players.get(1).setOrder(players.get(1).flipDice());

                System.out.println(players.get(0) + " got a dice value of " + players.get(0).getOrder());
                System.out.println(players.get(1) + " got a dice value of " + players.get(1).getOrder());

                Collections.sort(players, new PlayerOrder().reversed());
            }

            /* check second and last players are same */
            while (players.get(1).equals(players.get(2))) { //re-call flipDice() and re-sort until two players' order is different.

                /* Preserve the first player's order of playing */
                players.get(0).setOrder(7);

                System.out.println("A tie was achieved between " + players.get(1) + " and " +
                        players.get(2) + ". Attempting to break the tie");

                players.get(1).setOrder(players.get(1).flipDice());
                players.get(2).setOrder(players.get(2).flipDice());

                System.out.println(players.get(1) + " got a dice value of " + players.get(1).getOrder());
                System.out.println(players.get(2) + " got a dice value of " + players.get(2).getOrder());

                Collections.sort(players, new PlayerOrder().reversed());
            }
        } else { //four players

            /* check four players are same */
            while (players.get(0).equals(players.get(1))
                    && players.get(1).equals(players.get(2))
                    && players.get(2).equals(players.get(3))){ //re-call flipDice() and re-sort until four players' order is different.

                System.out.println("A tie was achieved between " + players.get(0) + ", " +
                        players.get(1) + ", " + players.get(2) + ", and "+ players.get(3) + ". Attempting to break the tie");

                /* re-call flipDice() */
                players.get(0).setOrder(players.get(0).flipDice());
                players.get(1).setOrder(players.get(1).flipDice());
                players.get(2).setOrder(players.get(2).flipDice());
                players.get(3).setOrder(players.get(3).flipDice());

                System.out.println(players.get(0) + " got a dice value of " + players.get(0).getOrder());
                System.out.println(players.get(1) + " got a dice value of " + players.get(1).getOrder());
                System.out.println(players.get(2) + " got a dice value of " + players.get(2).getOrder());
                System.out.println(players.get(3) + " got a dice value of " + players.get(3).getOrder());

                /* re-order */
                Collections.sort(players, new PlayerOrder().reversed());
            }

            /* check first, second, third players are same */
            while (players.get(0).equals(players.get(1))
                    && players.get(1).equals(players.get(2))){ //re-call flipDice() and re-sort until three players' order is different.

                /* Preserve the last player's order of play */
                players.get(3).setOrder(0);

                System.out.println("A tie was achieved between " + players.get(0) + ", " +
                        players.get(1) + ", and " + players.get(2) + ". Attempting to break the tie");

                /* re-call flipDice() */
                players.get(0).setOrder(players.get(0).flipDice());
                players.get(1).setOrder(players.get(1).flipDice());
                players.get(2).setOrder(players.get(2).flipDice());

                System.out.println(players.get(0) + " got a dice value of " + players.get(0).getOrder());
                System.out.println(players.get(1) + " got a dice value of " + players.get(1).getOrder());
                System.out.println(players.get(2) + " got a dice value of " + players.get(2).getOrder());

                /* re-order */
                Collections.sort(players, new PlayerOrder().reversed());
            }

            /* check second, third, last players are same */
            while (players.get(1).equals(players.get(2))
                    && players.get(2).equals(players.get(3))){ //re-call flipDice() and re-sort until three players' order is different.

                /* Preserve the first player's order of play */
                players.get(0).setOrder(7);

                System.out.println("A tie was achieved between " + players.get(1) + ", " +
                        players.get(2) + ", and " + players.get(3) + ". Attempting to break the tie");

                /* re-call flipDice() */
                players.get(1).setOrder(players.get(1).flipDice());
                players.get(2).setOrder(players.get(2).flipDice());
                players.get(3).setOrder(players.get(3).flipDice());

                System.out.println(players.get(1) + " got a dice value of " + players.get(1).getOrder());
                System.out.println(players.get(2) + " got a dice value of " + players.get(2).getOrder());
                System.out.println(players.get(3) + " got a dice value of " + players.get(3).getOrder());

                /* re-order */
                Collections.sort(players, new PlayerOrder().reversed());
            }

            /* check first, second players are same */
            while (players.get(0).equals(players.get(1))){ //re-call flipDice() and re-sort until two players' order is different.

                /* Preserve third, last player's order of play */
                players.get(2).setOrder(0);
                players.get(3).setOrder(-1);

                System.out.println("A tie was achieved between " + players.get(0) + " and " +
                        players.get(1) + ". Attempting to break the tie");

                /* re-call flipDice() */
                players.get(0).setOrder(players.get(0).flipDice());
                players.get(1).setOrder(players.get(1).flipDice());

                System.out.println(players.get(0) + " got a dice value of " + players.get(0).getOrder());
                System.out.println(players.get(1) + " got a dice value of " + players.get(1).getOrder());

                /* re-order */
                Collections.sort(players, new PlayerOrder().reversed());
            }

            /* check first, second, third players are same */
            while (players.get(1).equals(players.get(2))) { //re-call flipDice() and re-sort until two players' order is different.

                /* Preserve first, last player's order of play */
                players.get(0).setOrder(7);
                players.get(3).setOrder(0);

                System.out.println("A tie was achieved between " + players.get(1) + " and " +
                        players.get(2) + ". Attempting to break the tie");

                /* re-call flipDice() */
                players.get(1).setOrder(players.get(1).flipDice());
                players.get(2).setOrder(players.get(2).flipDice());

                System.out.println(players.get(1) + " got a dice value of " + players.get(1).getOrder());
                System.out.println(players.get(2) + " got a dice value of " + players.get(2).getOrder());

                /* re-order */
                Collections.sort(players, new PlayerOrder().reversed());
            }

            /* check first, second, third players are same */
            while (players.get(2).equals(players.get(3))) { //re-call flipDice() and re-sort until two players' order is different.

                /* Preserve first, second player's order of play */
                players.get(0).setOrder(8);
                players.get(1).setOrder(7);

                System.out.println("A tie was achieved between " + players.get(2) + " and " +
                        players.get(3) + ". Attempting to break the tie");

                /* re-call flipDice() */
                players.get(2).setOrder(players.get(2).flipDice());
                players.get(3).setOrder(players.get(3).flipDice());

                System.out.println(players.get(2) + " got a dice value of " + players.get(2).getOrder());
                System.out.println(players.get(3) + " got a dice value of " + players.get(3).getOrder());

                /* re-order */
                Collections.sort(players, new PlayerOrder().reversed());
            }
        }
    }
}

/* Create class for ordering with my order value */
class PlayerOrder implements Comparator<LadderAndSnake> {

    @Override
    public int compare(LadderAndSnake p1, LadderAndSnake p2) {
        /* check value of order via getOder()*/
        if (p1.getOrder() > p2.getOrder()) {
            return 1;
        } else if (p1.getOrder() < p2.getOrder()) {
            return -1;
        }
        return 0;
    }
}
