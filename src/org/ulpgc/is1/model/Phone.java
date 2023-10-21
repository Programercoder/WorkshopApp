package org.ulpgc.is1.model;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

///Preguntar sobre clases primitivas
public class Phone {
    private String number;

    public Phone(String number){
        this.number = number;
    }
    //getter de number
    public String getNumber() {
        return number;
    }
    //Setter de number
    public void setNumber(String number) {
        this.number = number;
    }

    //Metodo isValid
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
