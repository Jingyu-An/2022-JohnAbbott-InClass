package projectA.test;

import projectA.airplane.Airplane;
import projectA.drones.AgriculturalDrone;
import projectA.drones.MAV;
import projectA.helicopter.Helicopter;
import projectA.helicopter.Quadcopter;
import projectA.multirotor.Multirotor;
import projectA.uav.UAV;

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


        System.out.println("========= Original Airplane =============");
        for (Object o : flying) {
            System.out.println(o);
        }

        Object[] copyFlying = copyFlyingObject(flying);

        System.out.println();
        System.out.println("========= Copy Airplane ===========");
        for (Object o : copyFlying) {
            System.out.println(o);
        }
    }

    public static Object[] copyFlyingObject(Object[] arr) {

        Object[] object = new Object[arr.length];

        for (int i = 0; i < arr.length; i++) {
            object[i] = arr[i];
        }

        return object;
    }
}
