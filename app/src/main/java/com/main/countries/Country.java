package com.main.countries;

import java.io.Serializable;

public class Country implements Serializable
{
    private long ID;
    private String Name;
    private String Capital;
    private long Flag;

    public Country(long ID, String name, String capital, long flag) {
        this.ID = ID;
        Name = name;
        Capital = capital;
        Flag = flag;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getCapital() {
        return Capital;
    }

    public long getFlag() {
        return Flag;
    }
}
