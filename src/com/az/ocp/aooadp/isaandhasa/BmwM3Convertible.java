package com.az.ocp.aooadp.isaandhasa;

public class BmwM3Convertible extends Car { // IS-A

    private SuperTune superTune = new SuperTune(); // HAS-A

    public int increasePower() {
        return superTune.addMoreHorsPower();
    }
    
    @Override
    public void drive() {
        System.out.println("Driving in my car...");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }
}
