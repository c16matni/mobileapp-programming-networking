package com.example.networking;

public class Mountain {
    private String name;
    private String ID;
    private int meter;


    public Mountain(String name, String id, int meter) {
        this.name = name;
        this.ID = ID;
        this.meter = meter;
    }

    public String getName(){
        return name;
    }

    public String getID(){
        return ID;
    }
    public int getMeter(){
        return meter;
    }

}
