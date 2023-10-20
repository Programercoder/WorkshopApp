package org.uplgc.is1.model;

import java.util.Date;
import java.util.List;

public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    


    public Repair(BreakdownTypes breakdownTypes, int i, int id, List<Mechanic> mechanics, Vehicle vehicle2) {
        this.id = 0;
    }
}
