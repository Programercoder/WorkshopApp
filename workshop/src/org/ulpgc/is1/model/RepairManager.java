package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;

public class RepairManager {

    private final List<Mechanic> mechanics;
    private final List<Vehicle> vehicles;

    public RepairManager(){
        mechanics = new ArrayList<>();
        vehicles = new ArrayList<>();
    }

    public void addMechanic(Mechanic mechanic){mechanics.add(mechanic);}
    public void addVehicle(Vehicle vehicle ){vehicles.add(vehicle);}

    public Mechanic getMechanic(int index){
       return  this.mechanics.get(index);
        }

    public Vehicle getVehicle(int index){
        return this.vehicles.get(index);
    }
}

