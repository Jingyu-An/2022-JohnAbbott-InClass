package activity19th;

public class UtilizeCellPhones {

    public static void main(String[] args) {

        CellPhone c1 = new CellPhone();
        CellPhone c2 = new CellPhone("Samsung", 1800);
        CellPhone c3 = new CellPhone(c1);

        c1.showInfo();
        c2.showInfo();
        c3.showInfo();

        c1.setPrice(1800);
        c2.setBrand("Apple");
        c3.setSerialNumber();

        System.out.println();
        System.out.println("The changed price of c1 is " + c1.getPrice() + "$.");
        System.out.println("The changed brand of c2 is " + c1.getBrand());
        System.out.println("The changed serial number of c3 is " + c1.getSerialNumber());

        System.out.println("\n=======Compare c1 and c2=======");
        c1.equals(c2);
        System.out.println("\n=======Compare c1 and c3=======");
        c1.equals(c3);
        System.out.println("\n=======Compare c2 and c3=======");
        c2.equals(c3);
    }
}
