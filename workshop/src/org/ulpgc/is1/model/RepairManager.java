package org.ulpgc.is1.model;
import java.util.*;
public class RepairManager {
    
    private  ArrayList<Mechanic> MechanicList = new ArrayList<>();
    private  ArrayList<Vehicle> VehicleList = new ArrayList<>();
    private  ArrayList<SparePart> SparePartList = new ArrayList<>();



   
    public void repair(String name, int price) {
        SparePartList.add(new SparePart(name, price));
    }

    public int countVehicle(){
        return VehicleList.size();
    }

    public void removeVehicle(int index) {
        if (index < 0 || index >= VehicleList.size()) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        VehicleList.remove(index);
    }


    public void addMechanic(String name, String surname){
        MechanicList.add(new Mechanic(name, surname));
    }



    public void addVehicle(String make, String model, Plate plate, Customer customer) {
        VehicleList.add(new Vehicle(make, model, plate, customer));
    }

    public void addSparePart(String name, int price){
        SparePartList.add(new SparePart(name, price));
    }


    public ArrayList<Mechanic> getMechanic() {
        return MechanicList;
    }

    public ArrayList<Vehicle> getVehicle() {
        return VehicleList;
    }

    public ArrayList<SparePart> getSparePart() {
        return SparePartList;
    }
}


