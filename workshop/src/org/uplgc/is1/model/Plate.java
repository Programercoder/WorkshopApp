package org.uplgc.is1.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plate {
    private String number;

    public Plate(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isValid(String number) {
        String valid = "^[A-Z]{2}\\d{5}$";
        Pattern pattern = Pattern.compile(valid);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
