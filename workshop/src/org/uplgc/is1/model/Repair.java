package org.uplgc.is1.model;

import java.util.Date;
import java.util.List;

public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    private final Date date;
    private final String description;
    private final int effort;
    private final List<Item> items;
    private final Payment payment;


    public Repair(Date date, String description, int effort, List<Item> items, Payment payment) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.items = items;
        this.payment = payment;
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getSparePart().getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

}
