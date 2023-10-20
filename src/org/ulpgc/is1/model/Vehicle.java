package org.ulpgc.is1.model;
import java.util.*;

public class Vehicle {


    private String make;
    private String model;
    private Plate plate;
    private Customer owner;
    private List<Repair> repair;


    public Vehicle(String make, String model, Plate plate, Customer customer){
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.owner = customer;
        this.repair = new ArrayList<Repair>();
    }

    ///Metodo deleteRepair
    public void deleteRepair(int index){
        if (index < 0 || index >= repair.size()) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        repair.remove(index);
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

    public Customer getCostumer() {
        return this.owner;
    }


    public List<Repair> getRepair() {
        return repair;
    }

    public Customer getOwner() {
        return owner;
    }
}
