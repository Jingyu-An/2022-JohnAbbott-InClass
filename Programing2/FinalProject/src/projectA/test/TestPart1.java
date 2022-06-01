package projectA.test;

import projectA.airplane.Airplane;
import projectA.drones.AgriculturalDrone;
import projectA.drones.MAV;
import projectA.helicopter.Helicopter;
import projectA.helicopter.Quadcopter;
import projectA.multirotor.Multirotor;
import projectA.uav.UAV;

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

        UAV[] arrUAV1 = new UAV[20];
        arrUAV1[0] = new UAV();
        arrUAV1[1] = new AgriculturalDrone();
        arrUAV1[2] = new MAV();
        arrUAV1[3] = new UAV(23,5000);
        arrUAV1[4] = new AgriculturalDrone(21,3500,"Canada", 4);
        arrUAV1[5] = new MAV(11, 1000, "S1", 20);
        arrUAV1[6] = new AgriculturalDrone(11, 52344, "Apple", 6);

        UAV[] arrUAV2 = new UAV[15];
        UAV[] arrUAV3 = new UAV[5];
        arrUAV3[0] = new AgriculturalDrone();

        System.out.println();
        findLeastAndMostExpensiveUAV(arrUAV1);
        System.out.println();
        findLeastAndMostExpensiveUAV(arrUAV2);
        System.out.println();
        findLeastAndMostExpensiveUAV(arrUAV3);
    }

    public static void checkEquals(Object o1, Object o2) {
        if (o1.equals(o2))
            System.out.println("Two object are the same.");
        else
            System.out.println("These are different");
    }

    public static void findLeastAndMostExpensiveUAV(UAV[] arr) {

        UAV least = arr[0];
        UAV most = arr[0];

        if (arr[0] == null) {
            System.out.println("There is no UAV");
            return;
        }

        if (arr[1] ==null){
            System.out.println("=== Least and Most expensive UAV are same ==");
            System.out.println(arr[0]);
            return;
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == null)
                break;
            if (least.getPrice() > arr[i].getPrice())
                least = arr[i];
            else if (most.getPrice() < arr[i].getPrice())
                most = arr[i];
        }
        System.out.println("======== Least expensive UAV ========");
        System.out.println(least);
        System.out.println("======== Most expensive UAV  ========");
        System.out.println(most);
    }
}
