package question3;

import java.util.Random;

public class Circle extends Shape {

    double radius;


    public Circle() {
        super();
        area();
        super.color = "White";
    }

    public Circle(double size) {
        super(size);
        super.color = "White";
    }

    public Circle(double size, String color) {
        super(size, color);
    }

    public void erase() {
        System.out.println("Erase the Circle");
        radius = 0;
        size = 0;
        color = null;
    }
    public void draw() {

        Random rand = new Random();

        radius = rand.nextDouble(20) + 1;
        System.out.printf("Draw Circle with radius : %.1f\n", radius);
    }

    public double area(){

        if (size == 0) {
            draw();
            return super.size = radius * radius + Math.PI;
        } else {
            return size;
        }
    }

    @Override
    public String toString() {
        return "Circle with radius : " + String.format("%.2f", radius) + ", " + super.toString();
    }
}
