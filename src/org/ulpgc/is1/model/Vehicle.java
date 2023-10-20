package org.ulpgc.is1.model;
import java.util.*;

public class Vehicle {


    private String make;
    private String model;
    private Plate plate;
    private Customer owner;
    private List<Repair> repair;


    public Vehicle(String make, String model, Plate plate, Costumer costumer, Repair repair){
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.costumer = costumer;
        this.repair = new ArrayList<Repair>();
        repair.add(repair);
    }

    ///Metodo deleteRepair
    public deleteReapir(int index){
        if (index < 0 || index >= repair.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return repair.remove(index);
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
}
