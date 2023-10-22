package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepairManager repairManager = new RepairManager();

        // Inyectar información al modelo mediante el método init
        init(repairManager);
        
        ///Data of the first mechanic and the second vehicle 
        System.out.println("Los datos del primer mecanico son: " + repairManager.getMechanic().get(0).getName() + " " + repairManager.getMechanic().get(0).getSurname());
        System.out.println("Los datos del segundo vehiculo son Make: " +  repairManager.getVehicle().get(1).getMake() + ", Model: " + repairManager.getVehicle().get(1).getModel() + ", Plate: " + repairManager.getVehicle().get(1).getPlate().getNumber() + ", Customer name and phone: " + repairManager.getVehicle().get(1).getOwner().getName() + ", " + repairManager.getVehicle().get(1).getOwner().getPhone().getNumber());

        ///Reparation
        Repair repair =  new Repair(new Date(2023,12,5), "Bumper and exhaust pipe reparation", 300, repairManager.getVehicle().get(1));
        SparePart part1 = repairManager.getSparePart().get(0);
        SparePart part2 = repairManager.getSparePart().get(1);
        repair.addItem(new Item(part1, repair, 1200));
        repair.addItem(new Item(part2, repair, 5000));
        repair.addBreakdownTypes(BreakdownTypes.mechanical);
        repairManager.getMechanic().get(0).addRepair(repair);

        ///formalization of the payment
        repairManager.getMechanic().get(0).getRepair().get(0).price(new Date(2023,12,20), 500);
        
        ///Delete the first Vehicle
        repairManager.removeVehicle(0);

        ///Number of vehicles in the workshop
        System.out.println("Number of vehicles: " + repairManager.countVehicle());

        ///Data of the reparation
        System.out.println("Data of the reparation: Date: "+repairManager.getMechanic().get(0).getRepair().get(0).getDate() + " Description: "+ repairManager.getMechanic().get(0).getRepair().get(0).getDescription()+", Effort: "+repairManager.getMechanic().get(0).getRepair().get(0).getEffort()+", Vehicle,  Make, model, plate and Customer name and phone:  "+repairManager.getMechanic().get(0).getRepair().get(0).getVehicle().getMake()+" ,"+repairManager.getMechanic().get(0).getRepair().get(0).getVehicle().getModel()+" ,"+repairManager.getMechanic().get(0).getRepair().get(0).getVehicle().getPlate().getNumber()+" "+repairManager.getMechanic().get(0).getRepair().get(0).getVehicle().getOwner().getName()+" ,"+repairManager.getMechanic().get(0).getRepair().get(0).getVehicle().getOwner().getPhone().getNumber());
        System.out.println("Mechanic assigned for repair: "+repairManager.getMechanic().get(0).getName()+" "+repairManager.getMechanic().get(0).getSurname());
        System.out.println("Reparation Type: "+repairManager.getMechanic().get(0).getRepair().get(0).getBreakdownTypes());
        System.out.println("Parts changed: "+repairManager.getMechanic().get(0).getRepair().get(0).getItems().get(0).getSparepart().getName()+", "+repairManager.getMechanic().get(0).getRepair().get(0).getItems().get(1).getSparepart().getName());
        System.out.println("Data of the payment:  Date: "+repairManager.getMechanic().get(0).getRepair().get(0).getPayment().getDate()+", Amount: "+repairManager.getMechanic().get(0).getRepair().get(0).getPayment().getAmmount());
    }

    ///Repair innit
    public static void init(RepairManager repairManager) {
        repairManager.addMechanic("Rick", "Sanchez");
        repairManager.addMechanic("Hernesto", "Figueroa");
        repairManager.addVehicle("Oil change", "Hylux", new Plate("GC20035"), new Customer("Pedro", new Phone("658654235")));
        repairManager.addVehicle("Bumper and Exhaust pipe", "juke", new Plate("GC20034"), new Customer("Pablo", new Phone("658654235")));
        repairManager.addSparePart("Bumper", 1300);
        repairManager.addSparePart("Exhaust pipe", 2000);
    }
}
