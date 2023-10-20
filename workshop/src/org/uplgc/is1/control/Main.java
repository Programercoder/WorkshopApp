package org.uplgc.is1.control;

import org.uplgc.is1.model.*;

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
        Mechanic mechanic1 = new Mechanic("Ana", "Perez");
        Mechanic mechanic2 = new Mechanic("David", "Lumusa");
        Customer customer1 = new Customer("Maria", "643273589");
        Customer customer2 = new Customer("Diego", "649034678");
        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", "A3456CD");
        Vehicle vehicle2 = new Vehicle("Nissan", "Juke", "F2345SA");
        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanic1);
        new Repair(345, "Maletero", "65", mechanics, vehicle2);
        repairManager.addVehicle(vehicle1);
        repairManager.addVehicle(vehicle2);
        repairManager.addMechanic(mechanic1);
        repairManager.addMechanic(mechanic2);
    }
}