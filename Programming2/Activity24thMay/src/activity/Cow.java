package activity;

public class Cow extends Animal {

    public Cow() {
        super(true, false);
    }

    @Override
    public String getGreeting() {
        return "moo";
    }

    public String toString() {
        String mammal;
        String carnivorous;
        if (isMammal())
            mammal = "is a mammal";
        else
            mammal = "is not a mammal";

        if (isCarnivorous())
            carnivorous = "is carnivorous";
        else
            carnivorous = "is not carnivorous";

        return "A cow says '" + getGreeting() + "', " + carnivorous + ", and " + mammal + ".";
    }
}
