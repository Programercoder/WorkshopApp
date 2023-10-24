package org.ulpgc.is1.model;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Payment {


    ///Atributes
    private Date date;
    private int ammount;

    ///Constructor
    public Payment(Date date, int ammount) {
        this.date = date;
        this.ammount = ammount;
    }

    ///getDate method
    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");
        String formated = dateFormat.format(this.date);
        return formated;
    }

    ///setDate method
    public void setDate(Date date) {
        this.date = date;
    }

    ///getAmmount method
    public int getAmmount() {
        return ammount;
    }

    ///setAmmount method
    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}
