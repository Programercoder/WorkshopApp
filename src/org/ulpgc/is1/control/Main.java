package org.ulggc.is1.control;

import org.ulpgc.is1.model.*;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepairManager repairManager = new RepairManager();

        // Inyectar información al modelo mediante el método init
        init(repairManager);
        System.out.println(((Mechanic)repairManager.getMechanic().get(0).getMechanic()));
        System.out.println(((Vehicle)repairManager.getVehicle().get(1).getVehicle()));
    }

    public static void init(RepairManager repairManager) {
        ///Seguir con esto
        repairManager.addMechanic("Hernesto", "Figueroa");
        repairManager.addVehicle("Oil change", "Hylux", new Plate("GC20035"), new Customer("Pedro", new Phone("658654234")));
        repairManager.addVehicle("Glass change", "juke", new Plate("GC20034"), new Customer("Pablo", new Phone("658654235")));
        mechanics.add(mechanic1);
        new Repair(345, "Maletero", "65", mechanics, vehicle2);
        repairManager.addVehicle(vehicle1);
        repairManager.addVehicle(vehicle2);
        repairManager.addMechanic(mechanic1);
        repairManager.addMechanic(mechanic2);
    }
}