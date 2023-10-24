package org.ulpgc.is1.model;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Payment {


    private Date date;
    private int ammount;

    public Payment(Date date, int ammount) {
        this.date = date;
        this.ammount = ammount;
    }

    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");
        String formated = dateFormat.format(this.date);
        return formated;
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
