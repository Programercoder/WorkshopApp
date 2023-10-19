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
    ///Metodo getRepair
    public Repair getRepair(){
        return this.repair;
    }
    ///Metodo getQuantity
    public int getQuantity() {
        return quantity;
    }
    ///MetodoSparepart
    public SparePart getSparepart() {
        return Sparepart;
    }
}
