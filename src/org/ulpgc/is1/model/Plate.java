package org.ulpgc.is1.model;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
        String valid = "^[A-Z]{1} \\d{2} [A-Z]{3}$";
        Pattern pattern = Pattern.compile(valid);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

}
