package question1;

public class TestQuestion1 {

    public static void main(String[] args) {

        Collecable collecables[] = new Collecable[5];

        collecables[0] = new Gold(30);
        collecables[1] = new Gold(15);
        collecables[2] = new HealthPotion(4000, "Minor Health Potion", 10);
        collecables[3] = new HealthPotion(4100, "Large Health Potion", 100);
        collecables[4] = new ManaPotion(50000, "Medium Mana Potion", 50);


        for (Collecable coll : collecables) {
            coll.pickUp();
            coll.drop();
        }
    }
}
