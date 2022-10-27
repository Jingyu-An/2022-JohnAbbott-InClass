package question1;

public class Gold implements Collecable {

    int gold; //value of gold

    public Gold(int gold) {
        this.gold = gold;
    }

    @Override
    public void pickUp() { //implement a Collectible interface

        System.out.println("Picked up " + gold + " gold.");
    }

    @Override
    public void drop() { //implement a Collectible interface

        System.out.println("Dropped " + gold + " gold.");
    }
}
