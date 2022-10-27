package question3;

public class Shape {

    double size;
    String color;

    public Shape() {
    }

    public Shape(double size) {

        this.size = size;
    }

    public Shape(double size, String color) {

        this.size = size;
        this.color = color;
    }

    public void erase() {
        System.out.println("Erase a shape");
    }

    public void draw() {
        System.out.println("Draw a shape");
    }

    public double area() {
        System.out.println("Size of a shape : " + size);
        return size;
    }

    @Override
    public String toString() {
        return "Size : " + String.format("%.2f", size) + ", Color : " + color;
    }
}
