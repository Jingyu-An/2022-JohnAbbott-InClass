package activity;

public class Dog extends Animal{

    public Dog() {
        super(true, true);
    }

    @Override
    public String getGreeting() {
        return "ruff";
    }

    @Override
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

        return "A dog says '" + getGreeting() + "', " + carnivorous + ", and " + mammal + ".";
    }
}
