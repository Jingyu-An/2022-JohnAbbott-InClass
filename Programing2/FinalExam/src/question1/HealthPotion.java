package question1;

public class HealthPotion extends Consumable {

    int healthRestored;

    public HealthPotion(int itemID, String itemName, int healthRestored) {

        super(itemID, itemName); //call Consumable constructor with two parameters
        this.healthRestored = healthRestored;
    }
}
