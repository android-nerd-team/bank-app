package com.example.recepinanc.simplelistview4;

/**
 * Created by Recepinanc on 10.09.2015.
 */
public class Gelir {

    private String mName;
    private double mValue;

    public Gelir () {

    }

    public Gelir (String name,double value) {
        this.mName = name;
        this.mValue = value;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public double getValue() {
        return mValue;
    }

    public void setValue(double value) {
        mValue = value;
    }
}
