package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    List<Passenger> passengers = new ArrayList<>();
    Engine engine;
    String type;
    boolean isLand;
    boolean isWater;
    boolean isAir;
    boolean isSpace;
    int maxPassengers;

    public Vehicle(Engine engine, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace){
        this.engine = engine;
        this.type = type;
        this.isLand = isLand;
        this.isWater = isWater;
        this.isAir = isAir;
        this.isSpace = isSpace;
        this.maxPassengers = 0;

    }
    public void turnOn(){
        this.engine.isOn = true;
    }
    public void turnOff(){
        this.engine.isOn = false;
    }
    public void addPassenger(Passenger name){
        passengers.add(name);
    }
    public void removePassenger(Passenger name){
        passengers.remove(name);
    }
}
