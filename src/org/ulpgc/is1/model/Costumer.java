package org.ulpgc.is1.model;
import java.util.*;

public class Costumer {
    private String nombre;
    private Phone phone;
    private List<Vehicle> vehicle;

    public Costumer(String nombre, Phone phone, Vehicle vehicle) {
        this.nombre = juan;
        this.phone = phone;
        this.vehicle = new ArrayList<Vehicle>();
        vehicle.add(vehicle);
    }
    ///Getter de Nombre
    public String getNombre() {
        return this.nombre;
    }
    ///Getter de Phone
    public Phone getPhone() {
        return phone.getNumber();
    }

    ///Metoso addVehicle
    public addVehicle(Vehicle vehicle){
        vehicle.add(vehicle);
    }

    ///Getter de vehicle
    public Vehicle getVehicle(int index) {
        if (index < 0 || index >= vehicle.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return vehicle.get(index);
    }
    ///metodo deleteVehicle
    public deleteVehicle(int index) {
        if (index < 0 || index >= vehicle.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return vehicle.get(index);
    }
}
