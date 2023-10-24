package org.ulpgc.is1.model;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Plate {

    ///Atributes
    private String number;

    ///Constructor
    public Plate(String number) {
        if isValid(number){
            this.number = number;
        }
        else {
            this.number = "Wrong Plate";
        }
    }

    ///getNumber method
    public String getNumber() {
        return number;
    }

    ///setNumber method
    public void setNumber(String number) {
        this.number = number;
    }

    ///isValid method
    public boolean isValid(String number) {
        String valid = "^[A-Z]{2}\\d{5}$";
        Pattern pattern = Pattern.compile(valid);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

}
