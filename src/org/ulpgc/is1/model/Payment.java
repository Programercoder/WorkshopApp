package org.ulpgc.is1.model;

import java.util.Date;

public class Payment {


    private Date date;
    private int ammount;

    public Payment(Date date, int ammount) {
        this.date = date;
        this.ammount = ammount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}
