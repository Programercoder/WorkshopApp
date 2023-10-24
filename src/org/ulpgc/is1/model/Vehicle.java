package org.ulpgc.is1.model;
import java.util.*;

public class Vehicle {

    ///Vehicle atributes
    private String make;
    private String model;
    private Plate plate;
    private Customer owner;
    private List<Repair> repair;

    ///Vehicle constructor
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

    ///getMake method
    public String getMake() {
        return make;
    }
    
    ///setMake method
    public void setMake(String make) {
        this.make = make;
    }
    
    ///getModel method
    public String getModel() {
        return model;
    }

    ///setModel method
    public void setModel(String model) {
        this.model = model;
    }

    ///getPlate method
    public Plate getPlate() {
        return plate;
    }

    ///setPlate method
    public void setPlate(Plate plate) {
        this.plate = plate;
    }



    ///getRepair method
    public List<Repair> getRepair() {
        return repair;
    }
    
    ///getOwner method
    public Customer getOwner() {
        return owner;
    }

    ///setOwner method
    public void setOuner(Customer name){
        this.owner = name; 
    }
        
    
}
