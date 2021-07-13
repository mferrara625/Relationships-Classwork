package com.company;

public class Tire {
    int diameter;
    int pressure;

    public Tire(int diameter, int pressure){
        this.diameter = diameter;
        this.pressure = pressure;
    }
    public void fill(){
        Tire.this.pressure = 40;
    }
    public String toString(){
        return "Diameter: " + diameter + " Pressure: " + pressure;
    }
}
