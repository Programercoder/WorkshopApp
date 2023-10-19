package org.ulpgc.is1.model;
import java.util.*;
###Subir a git este archivo
public class SparePart {
    private String name;
    private int price;
    private List<Item> item;

    public SaperePart(String name, int price, Item item){
        this.name = name;
        this.price = price;
        this.item = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<Item> getItems() {
        return item;
    }

    public addItem(Repair repair, int quantity){
        Item = new Item(this, reapir, quantity);
        item.add(Item);
    }
}
