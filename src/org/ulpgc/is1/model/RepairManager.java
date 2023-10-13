package org.ulpgc.is1.model;
import java.util.*;
public class RepairManager {
    ///Preguntar a la profe si se puede usar set ya que el mecanico no deberia repetirse
    private final ArrayList<Mechanic> MechanicList = new ArrayList<>();
    private final ArrayList<Vehicle> VehicleList = new ArrayList<>();



    //To do
    public void repair(String part, int price) {

    }

    ///Preguntar al profe si se debe usar composite aggregation
    public void addMechanic(String name, String surname, Repair repair, Payment payment, BreakdownTypes breakdown){
        MechanicList.add(new Mechanic(name, surname, repair, payment, breakdown));
    }

    ///Mirar sobre shared and composite aggregation

    public void addVehicle(String make, String model, Plate plate, Costumer costumer, Phone phone) {
        VehicleList.add(new Vehicle(make, model, plate, costumer, phone));
    }
}
