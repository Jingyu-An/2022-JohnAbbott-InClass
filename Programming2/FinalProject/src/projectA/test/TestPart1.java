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

public class TestPart1 {

    public static void main(String[] args) {


        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane("Canada", 4000000,5);
        Airplane airplane3 = new Airplane(airplane1);

        System.out.println("==============================================");
        System.out.println(airplane1);
        System.out.println(airplane2);
        System.out.println(airplane3);
        System.out.println("==============================================");
        System.out.println();

        Helicopter helicopter1 = new Helicopter();
        Helicopter helicopter2 = new Helicopter("Cnada", 2400000, 4,6,2000,5);
        Helicopter helicopter3 = new Helicopter(helicopter1);
        System.out.println("==============================================");
        System.out.println(helicopter1);
        System.out.println(helicopter2);
        System.out.println(helicopter3);
        System.out.println("==============================================");
        System.out.println();

        Multirotor multirotor1 = new Multirotor();
        Multirotor multirotor2 = new Multirotor("Canada", 9000000, 7, 8, 2021, 5, 6);
        Multirotor multirotor3 = new Multirotor(multirotor2);
        System.out.println("==============================================");
        System.out.println(multirotor1);
        System.out.println(multirotor2);
        System.out.println(multirotor3);
        System.out.println("==============================================");
        System.out.println();

        Quadcopter quadcopter1 = new Quadcopter();
        Quadcopter quadcopter2 = new Quadcopter("Canada", 8000000, 5, 5, 2019, 4, 500);
        Quadcopter quadcopter3 = new Quadcopter(quadcopter2);
        System.out.println("==============================================");
        System.out.println(quadcopter1);
        System.out.println(quadcopter2);
        System.out.println(quadcopter3);
        System.out.println("==============================================");
        System.out.println();

        UAV uav1 = new UAV();
        UAV uav2 = new UAV(10, 3000);
        UAV uav3 = new UAV(uav2);
        System.out.println("==============================================");
        System.out.println(uav1);
        System.out.println(uav2);
        System.out.println(uav3);
        System.out.println("==============================================");
        System.out.println();

        AgriculturalDrone agriculturalDrone1 = new AgriculturalDrone();
        AgriculturalDrone agriculturalDrone2 = new AgriculturalDrone(8, 5000, "Canada", 6);
        AgriculturalDrone agriculturalDrone3 = new AgriculturalDrone(agriculturalDrone1);
        System.out.println("==============================================");
        System.out.println(agriculturalDrone1);
        System.out.println(agriculturalDrone2);
        System.out.println(agriculturalDrone3);
        System.out.println("==============================================");
        System.out.println();

        MAV mav1 = new MAV();
        MAV mav2 = new MAV(9, 3500, "Canada", 20);
        MAV mav3 = new MAV(mav2);
        System.out.println("==============================================");
        System.out.println(mav1);
        System.out.println(mav2);
        System.out.println(mav3);
        System.out.println("==============================================");
        System.out.println();

        checkEquals(airplane1, airplane3);
        checkEquals(agriculturalDrone2,agriculturalDrone3);
        checkEquals(mav1, mav3);
        checkEquals(uav2,uav3);
        checkEquals(quadcopter1,quadcopter3);
        checkEquals(helicopter1,helicopter3);
        checkEquals(helicopter3,agriculturalDrone3);

        Object[] arrFlying1 = new Object[17];
        arrFlying1[0] = airplane1;
        arrFlying1[1] = airplane2;
        arrFlying1[2] = mav3;
        arrFlying1[3] = helicopter1;
        arrFlying1[4] = helicopter2;
        arrFlying1[5] = agriculturalDrone1;
        arrFlying1[6] = quadcopter1;
        arrFlying1[7] = quadcopter2;
        arrFlying1[8] = uav1;
        arrFlying1[9] = multirotor1;
        arrFlying1[10] = multirotor2;
        arrFlying1[11] = new AgriculturalDrone(10, 1000, "Apple", 5);
        arrFlying1[12] = uav3;
        arrFlying1[13] = airplane3;
        arrFlying1[14] = mav2;
        arrFlying1[15] = new MAV(12,50000,"Power",12);
        arrFlying1[16] = agriculturalDrone3;

        Object[] arrFlying2 = new Object[12];
        arrFlying2[0] = airplane1;
        arrFlying2[1] = airplane2;
        arrFlying2[2] = airplane3;
        arrFlying2[3] = helicopter1;
        arrFlying2[4] = helicopter2;
        arrFlying2[5] = helicopter3;
        arrFlying2[6] = quadcopter1;
        arrFlying2[7] = quadcopter2;
        arrFlying2[8] = quadcopter3;
        arrFlying2[9] = multirotor1;
        arrFlying2[10] = multirotor2;
        arrFlying2[11] = multirotor3;

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream("ProjectAFindUAV1.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find file.");
            System.exit(0);
        }

        printWriter.println("====== Array Flying1 =====");
        for (Object o: arrFlying1) {
            printWriter.println(o);
        }

        System.out.println();
        System.out.println("====== Find Least and Most Expensive UAV ======");
        findLeastAndMostExpensiveUAV(arrFlying1, printWriter);

        printWriter.close();

        try {
            printWriter = new PrintWriter(new FileOutputStream("ProjectAFindUAV2.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find file.");
            System.exit(0);
        }

        printWriter.println("====== Array Flying2 =====");
        for (Object o: arrFlying2) {
            printWriter.println(o);
        }

        System.out.println();
        System.out.println("====== Find Least and Most Expensive UAV ======");
        findLeastAndMostExpensiveUAV(arrFlying2, printWriter);

        printWriter.close();
    }

    public static void checkEquals(Object o1, Object o2) {
        if (o1.equals(o2))
            System.out.println("Two object are the same.");
        else
            System.out.println("These are different");
    }

    public static void findLeastAndMostExpensiveUAV(Object[] arr, PrintWriter printWriter) {

        UAV least = null;
        UAV most = null;
        UAV temp = null;

        System.out.println("\n\n=================================================");
        printWriter.println("\n\n=================================================");

        if (arr[0] == null) {
            System.out.println("There is no Flying");
            printWriter.println("There is no Flying");
            return;
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == null)
                break;
            if (arr[i] instanceof UAV) {
                temp = (UAV) arr[i];
                if (least == null) {
                    least = temp;
                    most = temp;
                }
                if (least.getPrice() > temp.getPrice())
                    least = temp;
                else if (most.getPrice() < temp.getPrice())
                    most = temp;
            }
        }
        if (least == null){
            System.out.println("==== There is no UAV ====");
            printWriter.println("==== There is no UAV ====");
        } else if (least.equals(most)){
            System.out.println("==== Least and Most expensive UAV are the same ====");
            System.out.println(least);
            printWriter.println("==== Least and Most expensive UAV are the same ====");
            printWriter.println(least);
        } else {
            System.out.println("======== Least expensive UAV ========");
            System.out.println(least);
            System.out.println("======== Most expensive UAV  ========");
            System.out.println(most);

            printWriter.println("======== Least expensive UAV ========");
            printWriter.println(least);
            printWriter.println("======== Most expensive UAV  ========");
            printWriter.println(most);
        }
    }
}
