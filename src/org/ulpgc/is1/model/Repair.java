package org.ulpgc.is1.model;
import java.util.*;
import java.util.Date;

public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    private ListArray<BreakdownTypes> breakdownTypes;
    private Payment payment;
    private Vehicle vehicle;
    private List<Mechanic> mechanic;
    private List<Item> item;

    ///Inicializador sin parametro payment
    public Repair(Date date, String description, int effort, BreakdownTypes breakdownTypes, Vehicle vehicle,Mechanic mechanic, Item item) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.breakdownTypes = new ArrayList<BreakdownTypes>();
        breakdownTypes.add(breakdownTypes)
        this.vehicle = vehicle;
        this.item = new ArrayList<Item>();
        mechanic.add(item);
        this.mechanic = new ArrayList<mechanic>();
        mechanic.add(mechanic);

    }
    ///Inicializador con parametro payment
    public Repair(Date date, String description, int effort, BreakdownTypes breakdownTypes, Vehicle vehicle,Mechanic mechanic, Item item, Payment payment) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.breakdownTypes = new ArrayList<BreakdownTypes>();
        breakdownTypes.add(breakdownTypes)
        this.vehicle = vehicle;
        this.mechanic = new ArrayList<Item>();
        mechanic.add(item);
        this.payment = payment;

    }
    ///Getter de description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    ///Getter de Date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    ///Getter de effort
    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public int getId() {
        return id;
    }

    //getter de BreakdownTypes
    public BreakdownTypes getBreakdownTypes() {
        return breakdownTypes;
    }

    public void setBreakdownTypes(BreakdownTypes breakdownTypes) {
        this.breakdownTypes = breakdownTypes;
    }
    ///getter de payment
    public Payment getPayment() {
        return payment;
    }
    ///getter de Vehicle
    public Vehicle getVehicle() {
        return vehicle;
    }
    ///getter de Next_ID
    public static int getNextId() {
        return NEXT_ID;
    }

    ///getter de mechanic
    public Mechanic getMechanic(int index) {
        if (index < 0 || index >= mechanic.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return mechanic.remove(index);
    }

    ///Getter de items
    public Item getItems(int index) {
        if (index < 0 || index >= item.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return item.get(index);
    }

    ///Getter de BreakDownTypes
    public BreakdownTypes getBreakdownTypes(int index){
        if (index < 0 || index >= breakdownTypes.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return breakdownTypes.get(index);
    }

}
