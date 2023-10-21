package org.uplgc.is1.control;

import org.uplgc.is1.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepairManager repairManager = new RepairManager();

        init(repairManager);
        System.out.println((Mechanic)repairManager.getMechanics(0));
        System.out.println((Vehicle)repairManager.getVehicles(1));
    }

    public static void init(RepairManager repairManager) {
        repairManager.addMechanic("Ana", "Perez");
        repairManager.addMechanic("David", "Lumusa");
        repairManager.addCustomer("Erika", new Phone("643273589"));
        repairManager.addCustomer("Diego", new Phone("649034678"));
        repairManager.addVehicle("Toyota", "Corolla", new Plate("A3456CD"));
        repairManager.addVehicle("Nissan", "Juke", new Plate("F2345SA"));


        repairManager.getMechanics(1);
        repairManager.getVehicles(0);

        //new Repair(BreakdownTypes.electrical, 365, 65, mechanics(1), vehicles(1));

    }
}