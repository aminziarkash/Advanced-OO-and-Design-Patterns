package com.az.ocp.aooadp.objectcompositionprinciples;

public class GiftBox implements Box {
    
    @Override
    public void pack() {
        System.out.println("Pack box...");
    }
    
    @Override
    public void seal() {
        System.out.println("Seal box...");
    }
}
