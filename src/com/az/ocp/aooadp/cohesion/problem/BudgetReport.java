package com.az.ocp.aooadp.cohesion.problem;

//COHESION PROBLEM

public class BudgetReport {

    public void connectToRDBMS() {
        System.out.println("Connecting to RDBMS...");
    }

    public void generateBudgetReport() {
        System.out.println("Generating budget report...");
    }

    void saveToFile() {
        System.out.println("Saving to file...");
    }

    void print() {
        System.out.println("Printing...");
    }
}
