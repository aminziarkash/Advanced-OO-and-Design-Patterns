package com.az.ocp.aooadp.factory;

import com.az.ocp.aooadp.isaandhasa.Vehicle;

public class Truck implements Vehicle {

    private String vehicleType = "Truck";
    
    private int numberOfWheels = 8;
    
    private int numberOfSeats = 2;
    
    @Override
    public void drive() {
        System.out.println("Driving a truck!");
    }
    
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    
    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }
}
