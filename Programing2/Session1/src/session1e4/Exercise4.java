package session1e4;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Additions add = new Additions();

        System.out.println("Enter 2 integer");
        int integer1 = input.nextInt();
        int integer2 = input.nextInt();

        System.out.println(add.add(integer1,integer2));

        System.out.println("Enter 3 integer");
        integer1 = input.nextInt();
        integer2 = input.nextInt();
        int integer3 = input.nextInt();

        System.out.println(add.add(integer1,integer2, integer3));


        System.out.println("Enter 2 double");
        double db1 = input.nextDouble();
        double db2 = input.nextDouble();

        System.out.println(add.add(db1,db2));

        System.out.println("Enter 3 double");
        db1 = input.nextDouble();
        db2 = input.nextDouble();
        double db3 = input.nextDouble();

        System.out.println(add.add(db1, db2, db3));
    }
}
