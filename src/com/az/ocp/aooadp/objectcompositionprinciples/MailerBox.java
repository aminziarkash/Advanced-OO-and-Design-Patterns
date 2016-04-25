package com.az.ocp.aooadp.objectcompositionprinciples;

public class MailerBox implements Box, Mailer {
    
    private Box box;
    
    public MailerBox(Box box) {
        this.box = box;
    }
    
    @Override
    public void seal() { // Method forwarding/delegation to GiftBox
        box.seal();
    }
    
    @Override
    public void pack() {
        box.pack();
    }
    
    public void addPostage() {
        System.out.println("Affix stamps");
    }
    
    public void ship() {
        System.out.println("Ship...");
    }
}
