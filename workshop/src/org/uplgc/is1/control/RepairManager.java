package org.uplgc.is1.control;

import org.uplgc.is1.model.Mechanic;
import org.uplgc.is1.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RepairManager {

    public RepairManager() {
        this.vehicles = new ArrayList<>();
        this.mechanics = new ArrayList<>();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    List<Vehicle> vehicles;
    List<Mechanic> mechanics;

    public void addVehicle(Vehicle vehicle1) {
        this.vehicles.add(vehicle1);
    }

    public void addMechanic(Mechanic mechanic) {
        this.mechanics.add(mechanic);
    }
}

