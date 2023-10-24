package org.ulpgc.is1.model;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

///Preguntar sobre clases primitivas
public class Phone {

    ///Atributes
    private String number;

    ///Phone constructor
    public Phone(String number){
        if isValid(number) {    
            this.number = number;
        }
        else {
            this.number = "XXXX";
        }
    }
        
    //getter of number
    public String getNumber() {
        return this.number;
    }
    //Setter of number
    public void setNumber(String number) {
        this.number = number;
    }

    //isValid method
    public boolean isValid(String number) {
        String valid = "\\d{9}";
        Pattern pattern = Pattern.compile(valid);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
