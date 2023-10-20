package org.ulpgc.is1.model;
import java.util.*;
import

public class Mechanic {
    private String name;
    private String surname;
    private List<Repair> repair;

    public Mechanic(String name, String surname, Repair repair){
        this.name = name;
        this.surname = surname;
        this.repair = new ArrayList<Repair>();
        repair.addRepair(repair);
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

    public addRepair(Repair reparation){
        repair.add(reparation);
    }

    public deleteRepair(int index) {
        if (index < 0 || index >= repair.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return repair.remove(index);
    }
}
