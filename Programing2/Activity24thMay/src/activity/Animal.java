package activity;

abstract public class Animal {

    protected boolean isMammal;
    protected boolean isCarnivorous;

    public Animal(boolean isMammal, boolean isCarnivorous) {

        this.isMammal = isMammal;
        this.isCarnivorous = isCarnivorous;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }

    abstract public String getGreeting();
}
