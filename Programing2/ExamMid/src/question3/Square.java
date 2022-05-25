package question3;

import java.util.Random;

public class Square extends Shape {

    double length;

    public Square() {
        super();
        area();
        super.color = "Blue";
    }

    public Square(double size) {
        super(size);
        super.color = "Blue";
    }

    public Square(double size, String color) {
        super(size, color);
    }

    public void erase() {
        System.out.println("Erase the Square");
        length = 0;
        size = 0;
        color = null;
    }
    public void draw() {

        Random rand = new Random();

        length = rand.nextDouble(20) + 1;
        System.out.printf("Draw Square with length : %.1f\n", length);
    }

    public double area(){

        if (size == 0) {
            draw();
            return size = length * length;
        } else {
            return size;
        }
    }

    public String toString() {
        return "Square with length : " + String.format("%.2f", length) + ", " + super.toString();
    }
}
