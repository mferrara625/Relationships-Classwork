package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{

    List<Tire> tires;

    public Car(Engine engine) {
        super(engine, "Car", true, false, false, false);
        this.tires = new ArrayList<>();
    }
    public void turnOn(){
        engine.isOn = true;
    }
    public void turnOff(){
        engine.isOn = false;
    }
    public void addPassenger(Passenger passengers){
        this.passengers.add(passengers);
    }
    public void removePassenger(Passenger passengers){
        this.passengers.remove(passengers);
    }
    public void addTire(){
        tires.add(new Tire(25, 35));
    }
    public void removeTire(int tireIndex){
        tires.remove(tireIndex);
    }
    public void replaceTire(int tireIndex){
        removeTire(tireIndex);
        addTire();
    }
    public String toString(){
        return "Engine: " + engine.type + " Type: " + type + " isLand?: " + isLand + " isWater?: " + isWater + " isAir?: " + isAir + " isSpace?: " + isSpace + " Passengers: " + passengers + " Tires: " + tires.size();
    }
}
