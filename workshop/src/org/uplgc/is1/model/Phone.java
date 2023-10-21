package org.uplgc.is1.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isValid(String number) {
        String valid = "\\d{9}";
        Pattern pattern = Pattern.compile(valid);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return true;
        } else {
            this.number = "XXXX";
            return false;
        }
    }
}
