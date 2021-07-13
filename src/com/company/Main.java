package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Passenger> passengers = new ArrayList<>();
        Engine engine1 = new Engine("V8 - Gas");
        Engine engine2 = new Engine("Electric");
        Passenger mike = new Passenger("Mike",165);
        Passenger cliff = new Passenger("Cliff", 150);
        Passenger arnell = new Passenger("Arnell", 160);
        Car myCar = new Car(engine1);
        myCar.addPassenger(mike);
        myCar.addTire();
        myCar.addTire();
        myCar.addTire();
        myCar.addTire();

        Boat myBoat = new Boat(engine2,3000);
        myBoat.addPassenger(cliff);
        Plane myPlane = new Plane(engine1);
        myPlane.addPassenger(arnell);
        myPlane.addTire();
        myPlane.addTire();
        myPlane.addTire();
        myPlane.addTire();
        myPlane.addTire();
        myPlane.addTire();

        System.out.println(myCar);
        System.out.println(myBoat);
        System.out.println(myPlane);
//        System.out.println(engine1.isOn);
//        engine1.turnOn();
//        System.out.println("--------");
//        System.out.println(engine1.isOn);

    }
}
