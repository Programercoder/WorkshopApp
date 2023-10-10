package org.ulpgc.is1.model;

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
}
