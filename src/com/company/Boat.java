package com.company;


public class Boat extends Vehicle{
    int maxLoad;
    public Boat(Engine engine, int maxLoad) {
        super(engine, "Boat", false, true, false, false);
        this.maxLoad = maxLoad;
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
    public String toString(){
        return "Engine: " + this.engine.type + " Type: " + type + " isLand?: " + isLand + " isWater?: " + isWater + " isAir?: " + isAir + " isSpace?: " + isSpace + " passengers: " + passengers + " Max Load: " + maxLoad;
    }
}
