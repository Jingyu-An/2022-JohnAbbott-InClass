package question3;

import java.util.Random;

public class Triangle extends Shape {

    double height;
    double base;

    public Triangle() {
        super();
        area();
        super.color = "Black";
    }

    public Triangle(double size) {
        super(size);
        super.color = "Black";
    }

    public Triangle(double size, String color) {
        super(size, color);
    }

    public void erase() {
        System.out.println("Erase the Triangle");
        height = 0;
        base = 0;
        size = 0;
        color = null;
    }

    public void draw() {

        Random rand = new Random();

        height = rand.nextDouble(20) + 1;
        base = rand.nextDouble(20) + 1;
        System.out.printf("Draw Triangle with height : %.1f, base : %.1f\n", height, base);
    }

    public double area(){

        if (size == 0) {
            draw();
            return super.size = height * base / 2;
        } else {
            return size;
        }
    }

    public String toString() {
        return "Triangle with height : " + String.format("%.2f", height) + ", base : " + String.format("%.2f", base) +
                ", " + super.toString();
    }
}
