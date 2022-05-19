package session2e4;

public class Demo {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(4, 10000, 380);
        Vehicle v2 = new Vehicle(v1);
        Vehicle v3 = new Vehicle(v1);
        Vehicle v4 = new Vehicle(v1);
        Vehicle v5 = new Vehicle(v1);
        Vehicle v6 = new Vehicle(v1);

        v1.showInfo();
        v2.showInfo();
        v3.showInfo();
        v4.showInfo();
        v5.showInfo();
        v6.showInfo();
    }
}
