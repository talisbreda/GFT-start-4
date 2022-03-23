package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Conductor {
    public static void main(String[] args) {
        Conductor conductor = new Conductor(new Bike());
        conductor.automobile();
    }

    private final Vehicle vehicle;

    @Autowired
    public Conductor(Vehicle obj) {
        this.vehicle = obj;
    }

    public void automobile() {
        vehicle.action();
    }

}
