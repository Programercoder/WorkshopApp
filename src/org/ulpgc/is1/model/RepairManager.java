package org.ulpgc.is1.model;
import java.util.*;
public class RepairManager {
    ///Preguntar a la profe si se puede usar set ya que el mecanico no deberia repetirse
    private final ArrayList<Mechanic> MechanicList = new ArrayList<>();
    private final ArrayList<Vehicle> VehicleList = new ArrayList<>();
    private final ArryList<SparePart> sparePart = new ArrayList<>();



    //Preguntar al profe que hace exactamente el metodo repair
    public void repair(String part, int price) {

    }


    public void addMechanic(String name, String surname){
        MechanicList.add(new Mechanic(name, surname));
    }



    public void addVehicle(String make, String model, Plate plate, Costumer costumer) {
        VehicleList.add(new Vehicle(make, model, plate, costumer);
    }

    public void addSparePart(String name, int price){
        VehicleList.add(new SparePart(name, price));
    }


}
