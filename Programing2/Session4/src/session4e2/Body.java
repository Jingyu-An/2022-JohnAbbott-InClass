package session4e2;

public class Body {

    public static enum availableColors {White, Red, Yellow, Blue};

    private availableColors color;
    private double price;

    public Body() {
        System.out.println("Creating Body default constructor");

        color = availableColors.White;
        price = 8000;
    }

    public Body(availableColors colors, double price) {
        System.out.println("Creating a Body parametrized constructor");

        this.color = colors;
        this.price = price;
    }

    public availableColors getColor() {
        return color;
    }

    public void setColor(availableColors color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
