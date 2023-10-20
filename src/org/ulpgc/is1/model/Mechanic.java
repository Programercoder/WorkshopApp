package org.ulpgc.is1.model;
import java.util.*;


public class Mechanic {
    private String name;
    private String surname;
    private List<Repair> repair;

    public Mechanic(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.repair = new ArrayList<Repair>();
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public List<Repair> getRepair(int index) {
        return repair;
    }

    public void addRepair(Repair reparation){
        repair.add(reparation);
    }

    public void deleteRepair(int index) {
        if (index < 0 || index >= repair.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        repair.remove(index);
    }
}
