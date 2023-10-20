package org.ulpgc.is1.model;
import java.util.*;

public class Customer {
    private String nombre;
    private Phone phone;
    private List<Vehicle> vehicleList;

    public Customer(String nombre, Phone phone, Vehicle vehicle) {
        this.nombre = nombre;
        this.phone = phone;
        this.vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(vehicle);
    }
    ///Getter de Nombre
    public String getNombre() {
        return this.nombre;
    }
    ///Getter de Phone
    public Phone getPhone() {
        return phone;
    }

    ///Metoso addVehicle
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    ///Getter de vehicle
    public List<Vehicle> getVehicle(int index) {
        return vehicleList.get(index);
    }
    ///metodo deleteVehicle
    public void deleteVehicle(int index) {
        if (index < 0 || index >= vehicleList.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        vehicleList.remove(index);
    }
}