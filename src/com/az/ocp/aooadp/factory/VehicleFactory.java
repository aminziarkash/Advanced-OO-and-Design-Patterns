package com.az.ocp.aooadp.factory;

import com.az.ocp.aooadp.isaandhasa.Car;
import com.az.ocp.aooadp.isaandhasa.Vehicle;

public enum VehicleFactory {

    INSTANCE;
    
    public Vehicle createVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        } else if(vehicleType.equalsIgnoreCase("truck")) {
            return new Truck();
        } else {
            return null;
        }
    }
}
