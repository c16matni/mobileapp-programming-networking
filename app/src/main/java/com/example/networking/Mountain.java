package com.example.networking;

public class Mountain {
    private String name;
    private String id;
    private int meter;


    public Mountain(String name, String id, int meter) {
        this.name = name;
        this.id = id;
        this.meter = meter;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
    public int getMeter(){
        return meter;
    }

}
