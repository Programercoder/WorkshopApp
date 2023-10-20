package org.uplgc.is1.control;

import org.uplgc.is1.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepairManager repairManager = new RepairManager();

        init(repairManager);
        System.out.println(((Mechanic)repairManager.getMechanics().get(0)));
        System.out.println(((Vehicle)repairManager.getVehicles().get(1)));
    }

    public static void init(RepairManager repairManager) {
        Mechanic mechanic1 = new Mechanic("Ana", "Perez");
        Mechanic mechanic2 = new Mechanic("David", "Lumusa");
        Customer customer1 = new Customer("Maria", new Phone("643273589"));
        Customer customer2 = new Customer("Diego", new Phone("649034678"));
        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", new Plate("A3456CD"));
        Vehicle vehicle2 = new Vehicle("Nissan", "Juke", new Plate("F2345SA"));
        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanic1);
        new Repair(BreakdownTypes.electrical, 365, 65, mechanics, vehicle2);
        repairManager.addVehicle(vehicle1);
        repairManager.addVehicle(vehicle2);
        repairManager.addMechanic(mechanic1);
        repairManager.addMechanic(mechanic2);
    }
}