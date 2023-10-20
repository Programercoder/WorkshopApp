package org.ulpgc.is1.model;
import java.util.*;
import java.util.Date;

public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    private List<BreakdownTypes> breakdownTypesList;
    private Payment payment;
    private Vehicle vehicle;
    private List<Mechanic> mechanic;
    private List<Item> item;

    ///Inicializador sin parametro payment
    public Repair(Date date, String description, int effort, BreakdownTypes breakdownTypes, Vehicle vehicle,Mechanic Mechanic, Item Item) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.breakdownTypesList = new ArrayList<BreakdownTypes>();
        breakdownTypesList.add(breakdownTypes);
        this.vehicle = vehicle;
        this.item = new ArrayList<Item>();
        item.add(Item);
        this.mechanic = new ArrayList<Mechanic>();
        mechanic.add(Mechanic);

    }
    ///Inicializador con parametro payment
    public Repair(Date date, String description, int effort, BreakdownTypes breakdownTypes, Vehicle vehicle,Mechanic Mechanic, Item Item, Payment payment) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.breakdownTypesList = new ArrayList<BreakdownTypes>();
        breakdownTypesList.add(breakdownTypes);
        this.vehicle = vehicle;
        this.mechanic = new ArrayList<Mechanic>();
        mechanic.add(Mechanic);
        this.item = new ArrayList<Item>();
        item.add(Item);
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
    public List<BreakdownTypes> getBreakdownTypes() {
        return breakdownTypesList;
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
    public List<Mechanic> getMechanic() {
        return mechanic;
    }

    ///Getter de items
    public List<Item> getItems(int index) {
        return item;
    }


}
