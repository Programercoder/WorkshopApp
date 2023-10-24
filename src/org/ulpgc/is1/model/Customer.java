package org.ulpgc.is1.model;
import java.util.*;

public class Customer {

    ///Atributes
    private String name;
    private Phone phone;
    private List<Vehicle> vehicleList;

    ///Constructor
    public Customer(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
        this.vehicleList = new ArrayList<Vehicle>();
    }
    ///Getter de Nombre
    public String getName() {
        return this.name;
    }
    ///Getter de Phone
    public Phone getPhone() {
        return phone;
    }

    ///addVehicle method
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    ///getVehicle method
    public List<Vehicle> getVehicle() {
        return vehicleList;
    }
    ///deleteVehicle method
    public void deleteVehicle(int index) {
        if (index < 0 || index >= vehicleList.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        vehicleList.remove(index);
    }
}
