package question3;

public class TestShape {

    public static void main(String[] args) {

        Circle circle01 = new Circle();
        Circle circle02 = new Circle(20);
        Circle circle03 = new Circle(15,"Yellow");

        Square square01 = new Square();
        Square square02 = new Square(15);
        Square square03 = new Square(60, "Green");

        Triangle triangle01 = new Triangle();
        Triangle triangle02 = new Triangle(40);
        Triangle triangle03 = new Triangle(55, "Silver");


        Shape[] shapes = new Shape[9];
        shapes[0] = circle01;
        shapes[1] = circle02;
        shapes[2] = circle03;
        shapes[3] = square01;
        shapes[4] = square02;
        shapes[5] = square03;
        shapes[6] = triangle01;
        shapes[7] = triangle02;
        shapes[8] = triangle03;

        Shape[] copyShape = copyShape(shapes);

        for (int i = 0; i < shapes.length; i++) {
            showShape(shapes[i]);
        }

        for (int i = 0; i < shapes.length; i++) {
            showShape(copyShape[i]);
        }

    }

    public static void showShape(Shape s){
        System.out.println(s);
    }

    public static Shape[] copyShape(Shape[] array){
        Shape[] arr = new Shape[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
}

