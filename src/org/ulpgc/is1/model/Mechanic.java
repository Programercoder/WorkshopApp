package org.ulpgc.is1.model;
import java.util.*;


public class Mechanic {

    ///Atributes
    private String name;
    private String surname;
    private List<Repair> repair;

    ///Constructor
    public Mechanic(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.repair = new ArrayList<Repair>();
    }

    ///getSurname method
    public String getSurname() {
        return surname;
    }

    ///getName method
    public String getName() {
        return name;
    }

    ///getRepair method
    public List<Repair> getRepair() {
        return repair;
    }

    ///addRepair method
    public void addRepair(Repair reparation){
        repair.add(reparation);
    }

    ///deleteRepair method
    public void deleteRepair(int index) {
        if (index < 0 || index >= repair.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        repair.remove(index);
    }
}
