package org.uplgc.is1.model;

import java.util.ArrayList;

public class Vehicle {
    private String make;
    private String model;
    private Plate plate;
    private Repair repair;
    private ArrayList<Repair> repairArrayList;
    public Vehicle(String make, String model, Plate plate){
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.repair = new Repair();
        this.repairArrayList = new ArrayList<Repair>();
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Plate getPlate() {
        return plate;
    }
}
