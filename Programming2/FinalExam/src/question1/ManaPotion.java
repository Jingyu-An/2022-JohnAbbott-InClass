package question1;

public class ManaPotion extends Consumable {

    int manaRestored;

    public ManaPotion(int itemId, String itemName, int manaRestored) {

        super(itemId, itemName); //call Consumable constructor with two parameters
        this.manaRestored = manaRestored;
    }
}
