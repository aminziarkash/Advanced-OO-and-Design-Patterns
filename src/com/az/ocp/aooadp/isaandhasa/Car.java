package com.az.ocp.aooadp.isaandhasa;

public class Car implements Vehicle {

    private String carBrand;

    private String carModel;

    private boolean isConvertible;
    
    private final int numberOfWheels = 4;

    private int numberOfSeats;
    
    private int horsePower;
    
    private final String vehicleType = "Car";
    
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getHorsePower() {
        return horsePower;
    }
    
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    
    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    
    
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
