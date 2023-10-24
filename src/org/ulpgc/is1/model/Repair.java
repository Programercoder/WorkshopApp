package org.ulpgc.is1.model;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Repair {

    ///Atributes
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

    ///Constructor
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

    ///Getter of description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    ///Getter of Date
    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");
        String formated = dateFormat.format(this.date);
        return formated;
    }

    ///setDate method
    public void setDate(Date date) {
        this.date = date;
    }
    ///Getter of effort
    public int getEffort() {
        return effort;
    }

    ///setEffort nethod
    public void setEffort(int effort) {
        this.effort = effort;
    }

    ///getId method
    public int getId() {
        return id;
    }


    //getter of BreakdownTypes
    public List<BreakdownTypes> getBreakdownTypes() {
        return breakdownTypesList;
    }


    ///getter of payment
    public Payment getPayment() {
        return payment;
    }


    ///getter of Vehicle
    public Vehicle getVehicle() {
        return vehicle;
    }
    ///getter of Next_ID
    public static int getNextId() {
        return NEXT_ID;
    }

    ///getter of mechanic
    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    ///Getter of items
    public List<Item> getItems() {
        return itemList;
    }

    ///addMechanic method
    public void addMechanic(Mechanic mechanic){
        mechanicList.add(mechanic);
    }

    ///addItems method
    public void addItem(Item item){
        itemList.add(item);
    }

    ///addBreakdownTypes method
    public void addBreakdownTypes(BreakdownTypes Type){
        breakdownTypesList.add(Type);
    }

    ///price method
    public void price(Date date, int amount) {
        this.payment = new Payment(date, amount);
    }
}

