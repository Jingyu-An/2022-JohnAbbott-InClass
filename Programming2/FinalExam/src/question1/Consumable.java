package question1;

public class Consumable implements Collecable {

    int itemID;
    String itemName;

    public Consumable(int itemID, String itemName) {
        this.itemID = itemID;
        this.itemName = itemName;
    }

    @Override
    public void pickUp() { //implement a Collectible interface
        System.out.println("Picked up a " + itemName + ".");
    }

    @Override
    public void drop() { //implement a Collectible interface
        System.out.println("Dropped a " + itemName + ".");
    }
}
