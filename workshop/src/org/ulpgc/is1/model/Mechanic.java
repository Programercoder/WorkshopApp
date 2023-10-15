package org.ulpgc.is1.model;

public class Mechanic {
    private  String name;
    private final String surname;

    public Mechanic(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        surname = surname;
    }
}
