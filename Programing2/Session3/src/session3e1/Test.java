package session3e1;

public class Test {

    public static void main(String[] args) {

        Employee[] myArray = new Employee[4];

        Employee e1 = new Employee("King", 34, 100);
        Employee e2 = new Employee("Queen", 28, 90);
        Employee e3 = new Employee("Princess", 14, 80);

        myArray[0] = e1;
        myArray[1] = e2;
        myArray[2] = e3;
        myArray[3] = e1;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i].showInfo();
        }

    }
}
