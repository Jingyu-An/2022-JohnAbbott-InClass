package projectA.test;

import projectA.airplane.Airplane;
import projectA.drones.AgriculturalDrone;
import projectA.drones.MAV;
import projectA.helicopter.Helicopter;
import projectA.helicopter.Quadcopter;
import projectA.multirotor.Multirotor;
import projectA.uav.UAV;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TestPart2 {

    public static void main(String[] args) {

        Object[] flying = new Object[7];

        flying[0] = new Airplane();
        flying[1] = new Helicopter();
        flying[2] = new Multirotor();
        flying[3] = new Quadcopter();
        flying[4] = new UAV();
        flying[5] = new AgriculturalDrone();
        flying[6] = new MAV();


        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream("ProjectAOriginalArray.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find file.");
            System.exit(0);
        }

        System.out.println("========= Original Airplane =============");
        printWriter.println("========= Original Airplane =============");
        for (Object o : flying) {
            System.out.println(o);
            printWriter.println(o);
        }
        printWriter.close();

        Object[] copyFlying = copyFlyingObject(flying);

        try {
            printWriter = new PrintWriter(new FileOutputStream("ProjectACopyArray.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find file.");
            System.exit(0);
        }
        System.out.println();
        System.out.println("========= Copy Airplane ===========");
        printWriter.println("========= Copy Airplane ===========");
        for (Object o : copyFlying) {
            System.out.println(o);
            printWriter.println(o);
        }
        printWriter.close();
    }

    public static Object[] copyFlyingObject(Object[] arr) {

        Object[] object = new Object[arr.length];

        for (int i = 0; i < arr.length; i++) {
            object[i] = arr[i];
        }

        return object;
    }
}
