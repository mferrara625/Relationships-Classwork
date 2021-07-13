package com.company;

import java.util.ArrayList;
import java.util.List;

public class Plane extends Vehicle{

    List<Tire> tires;
    boolean isLanding;
    int tireCount = 0;

    public Plane(Engine engine) {
        super(engine, "Plane", true, false, true, false);
        this.tires = new ArrayList<>();
        this.isLanding = false;
    }
    public void turnOn(){
        this.engine.isOn = true;
    }
    public void turnOff(){
        this.engine.isOn = false;
    }
    public void addPassenger(Passenger passengers){
        this.passengers.add(passengers);
    }
    public void removePassenger(Passenger passengers){
        this.passengers.remove(passengers);
    }
    public void toggleLanding(){
        this.isLanding = true;
    }
    public void addTire(){
        tires.add(new Tire(25, 35));
        tireCount++;
    }
    public void removeTire(int tireIndex){
        tires.remove(tireIndex);
        tireCount--;
    }
    public void replaceTire(int tireIndex){
        removeTire(tireIndex);
        addTire();
    }
    public String toString(){
        return "Engine: " + engine.type + " Type: " + type + " isLand?: " + isLand + " isWater?: " + isWater + " isAir?: " + isAir + " isSpace?: " + isSpace + " passengers: " + passengers + " tires: " + tireCount + " isLanding?: " + isLanding;
    }
}
