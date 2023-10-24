package org.ulpgc.is1.model;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    private List<BreakdownTypes> breakdownTypesList;
    private Payment payment;
    private Vehicle vehicle;
    private List<Mechanic> mechanicList;
    private List<Item> itemList;

    ///Inicializador sin parametro payment
    public Repair(Date date, String description, int effort,Vehicle vehicle) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.breakdownTypesList = new ArrayList<BreakdownTypes>();
        this.vehicle = vehicle;
        this.itemList = new ArrayList<Item>();
        this.mechanicList = new ArrayList<Mechanic>();

    }

    ///Getter de description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    ///Getter de Date
    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");
        String formated = dateFormat.format(this.date);
        return formated;
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
    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    ///Getter de items
    public List<Item> getItems() {
        return itemList;
    }

    ///Metodo addMechanic
    public void addMechanic(Mechanic mechanic){
        mechanicList.add(mechanic);
    }

    ///Metodo addItems
    public void addItem(Item item){
        itemList.add(item);
    }

    ///Metodo addBreakdownTypes
    public void addBreakdownTypes(BreakdownTypes Type){
        breakdownTypesList.add(Type);
    }

    public void price(Date date, int amount) {
        this.payment = new Payment(date, amount);
    }
}

