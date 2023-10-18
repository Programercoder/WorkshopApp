package org.ulpgc.is1.model;

public class Item {
    SparePart Sparepart;
    Repair repair;
    int quantity;

    public Item(SparePart Sparepart, Repair repair, int quantity){
        this.Sparepart = Sparepart;
        this.repair = repair;
        this.quantity = quantity;
    }

    public Repair getRepair(){
        return this.repair;
    }

    public int getQuantity() {
        return quantity;
    }

    public SparePart getSparepart() {
        return Sparepart;
    }
}
