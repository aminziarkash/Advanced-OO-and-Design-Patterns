package com.az.ocp.aooadp.isaandhasa;

public interface Vehicle {

    /**
     * Gets the number of the wheel for the vehicle
     * @return
     */
    int getNumberOfWheels();

    /**
     * Gets the type of the vehicle
     * @return
     */
    String getVehicleType();
    
    /**
     * Drive the vehicle
     */
    void drive();

}
