package org.ulpgc.is1.control.*;
import model.ReapairManager;

import org.ulpgc.is1.model.*;


//No cree el main como lo pide en la practica cree uno para ir sacando las clases y los metodos
//Falta hacerlo como lo pide en la practica
public class Main {
    private static void init(RepairManager workshop) {
        workshop.addMechanic("Pedro", "Palomo", Repair(Date("05-12-2021"), "Breaks", 12), BreakdownTypes.electrical);
        workshop.addVehicle("Oil change", "Hilux", new Plate("GC20020") ,new Costumer("Juan", "630234520"),new Phone("630234520");
        workshop.repair("Oil", 20);
    }
    public static void main(String[] args) {
        RepairManager workshop = new RepairManager();
        init(workshop);
        System.out.printf("El workshop tiene: " + workshop.getMechanic(),   );



    }
}