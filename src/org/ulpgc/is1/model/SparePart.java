package org.ulpgc.is1.model;
import java.util.*;

public class SparePart {
    private String name;
    private int price;


    public SparePart(String name, int price){
        this.name = name;
        this.price = price;
    }
    //Getter de name
    public String getName() {
        return name;
    }
    ///Getter de price
    public int getPrice() {
        return price;
    }


}
