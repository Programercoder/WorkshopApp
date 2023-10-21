package org.ulggc.is1.control;

import org.ulpgc.is1.model.*;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepairManager repairManager = new RepairManager();

        // Inyectar información al modelo mediante el método init
        init(repairManager);
        System.out.println("Los datos del primer mecanico son: " + repairManager.getMechanic().get(0).getName() + " " + repairManager.getMechanic().get(0).getSurname());
        System.out.println("Los datos del segundo vehiculo son Make: " +  repairManager.getVehicle().get(1).getMake() + ", Model: " + repairManager.getVehicle().get(1).getModel() + ", Plate: " + repairManager.getVehicle().get(1).getPlate().getNumber() + ", Customer name and phone: " + repairManager.getVehicle().get(1).getOwner().getName() + ", " + repairManager.getVehicle().get(1).getOwner().getPhone().getNumber());
    }

    public static void init(RepairManager repairManager) {
        ///Seguir con esto
        repairManager.addMechanic("Rick", "Sanchez");
        repairManager.addMechanic("Hernesto", "Figueroa");
        repairManager.addVehicle("Oil change", "Hylux", new Plate("GC20035"), new Customer("Pedro", new Phone("658654235")));
        repairManager.addVehicle("Glass change", "juke", new Plate("GC20034"), new Customer("Pablo", new Phone("658654235")));
        repairManager.addSparePart("Bumper", 130);
        repairManager.addSparePart("Exhaust pipe", 200);
    }
}
