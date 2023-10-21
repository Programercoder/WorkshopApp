package org.uplgc.is1.model;

public class Item {
    private SparePart sparePart;
    private int quantity;

    public Item(SparePart sparePart, int quantity) {
        this.sparePart = sparePart;
        this.quantity = quantity;
    }

    public SparePart getSparePart() {
        return sparePart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSparePart(SparePart sparePart) {
        this.sparePart = sparePart;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
