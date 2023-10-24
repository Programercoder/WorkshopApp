package org.ulpgc.is1.model;

public class Item {
    ///atributes
    SparePart Sparepart;
    Repair repair;
    int quantity;
    
    ///Item constructor
    public Item(SparePart Sparepart, Repair repair, int quantity){
        this.Sparepart = Sparepart;
        this.repair = repair;
        this.quantity = quantity;
    }
    
    ///getRepair method
    public Repair getRepair(){
        return this.repair;
    }
    ///getQuantity method
    public int getQuantity() {
        return quantity;
    }
    ///getSparepart method
    public SparePart getSparepart() {
        return Sparepart;
    }
}
