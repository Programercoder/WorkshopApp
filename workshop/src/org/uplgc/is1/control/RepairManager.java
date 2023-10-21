package org.uplgc.is1.control;


import org.uplgc.is1.model.*;

import java.util.ArrayList;
import java.util.List;

public class RepairManager {
     List<Vehicle> vehicles;
     List<Mechanic> mechanics;
     List<Customer> customers;


    public RepairManager() {
        this.vehicles = new ArrayList<>();
        this.mechanics = new ArrayList<>();
        this.customers = new ArrayList<>();
    }
    public boolean addCustomer(String name, Phone phone){
        Customer customer = new Customer(name, phone);
        return this.customers.add(customer);
    }
    public Vehicle getVehicles(int index) {
        return this.vehicles.get(index);
    }

    public Mechanic getMechanics(int index) {
        return this.mechanics.get(index);
    }

    public void addVehicle(String make, String model, Plate plate){
        Vehicle vehicle = new Vehicle(make, model, plate);
        this.vehicles.add(vehicle);
    }

    public void addMechanic(String name, String surname) {
        Mechanic mechanic = new Mechanic(name, surname);
        this.mechanics.add(mechanic);
    }

    //public void Repair(BreakdownTypes breakdownTypes){}
}

