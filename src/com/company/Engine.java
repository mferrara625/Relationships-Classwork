package com.company;

public class Engine {
    String type;
    boolean isOn;
    int fuel;

    public Engine(String type){
        this.type = type;
        this.isOn = false;
        this.fuel = 0;
    }
    public void turnOn(){
        Engine.this.isOn = true;
    }
    public void turnOff(){
        Engine.this.isOn = false;
    }
}
