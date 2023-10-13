package org.ulpgc.is1.model;

public class Vehicle {


    private String make;
    private String model;
    private Plate plate;
    private Costumer costumer;
    private Repair repair;

    public Vehicle(String make, String model, Plate plate, Costumer costumer, Repair repair){
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.costumer = costumer;
        this.repair = repair;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public Repair getRepair() {
        return repair;
    }

    public void setRepair(Repair repair) {
        this.repair = repair;
    }
}
