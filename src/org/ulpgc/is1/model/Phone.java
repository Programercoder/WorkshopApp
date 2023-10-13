package org.ulpgc.is1.model;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

///Preguntar sobre clases primitivas
public class Phone {
    private String number;

    private Phone(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    //Falta comprobar el metodo isValue()
    public boolean isValid(String number) {
        String valid = "\\d{9}";
        Pattern pattern = Pattern.compile(valid);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
