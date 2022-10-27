package session3e3;

public class TestObj {

    public static void main(String[] args) {

        System.out.println("Let's Create vehicles.");

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(6, 50000);

        System.out.println("=============================================");
        System.out.println("Let's Create buses.");

        Bus b1 = new Bus();
        Bus b2 = new Bus(50);
        Bus b3 = new Bus(b1);

        b1.setPrice(200000);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
