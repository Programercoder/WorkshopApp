package org.ulpgc.is1.control.*;
import model.ReapairManager;

import org.ulpgc.is1.model.*;


//No cree el main como lo pide en la practica cree uno para ir sacando las clases y los metodos
//Falta hacerlo como lo pide en la practica
public class Main {
    private static void init(RepairManager workshop) {
        ///Primer mecanico
        Repair repair1 = new Repair(Date "08-04-20022", "cambio aceite", 25 );
        Mechanic mechanic1 = new Mechamic("Pepe", "Miranda", repair1);

        ///segundo mecanico
        Repair repair2 = new Repair(Date "07-04-20022", "cambio de neumatico", 30 );
        Mechanic mechanic2 = new Mechamic("Pedro", "Marrero", repair2);

        ///Primer vehiculo
        Costumer Costumer1 = new Costumer("Mario", new Phone("345678901"))
        Vehicle vehicle = new Vehicle("Glass", "Hilux", new Plate("GC20045"));

        ///Piezas en el almacen
        SparePart part1 = new SparePart("Bumper", 200, new Item(1));
        SparePart part2 = new SparePart("Tire", 100, new Item(1));

        workshop.addMechanic(mechanic1, repair1, BreakdownTypes.electrical);
        workshop.addVehicle("Oil change", "Hilux", new Plate("GC20020") ,new Costumer("Juan", "630234520"),new Phone("630234520");
        workshop.repair()
    }
    public static void main(String[] args) {
        RepairManager workshop = new RepairManager();
        init(workshop);
        System.out.printf("Carcteristicas del primer mecanico:   nombre: " + workshop.getMechanic(0).getName() + " Apellido: " + workshop.getMechanic(0).getSurname());
        System.out.printf("Carcteristicas del segundo vehiculo:   make: " + workshop.getVehicle(1).getMake() + " Model: " + workshop.getVehicle(1).getModel() +" Plate: "+ workshop.getVehicle(1).getPlate.getNumber() + " Costumer name: " + workshop.getVehicle().getCostumer().getName()+" Costumer phone: " + workshop.getVehicle().getCostumer().getPhone());





    }
}