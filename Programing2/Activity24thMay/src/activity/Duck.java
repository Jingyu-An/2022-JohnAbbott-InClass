package activity;

public class Duck extends Animal{


    public Duck() {
        super(false, false);
    }

    @Override
    public String getGreeting() {
        return "quack";
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

        return "A duck says '" + getGreeting() + "', " + carnivorous + ", and " + mammal + ".";
    }
}
