package org.ulpgc.is1.model;

import java.util.Date;

public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    private BreakdownTypes breakdownTypes;

    public Repair(Date date, String description, int effort, BreakdownTypes breakdownTypes) {
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.breakdownTypes = breakdownTypes;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public int getId() {
        return id;
    }

    public BreakdownTypes getBreakdownTypes() {
        return breakdownTypes;
    }

    public void setBreakdownTypes(BreakdownTypes breakdownTypes) {
        this.breakdownTypes = breakdownTypes;
    }
}
