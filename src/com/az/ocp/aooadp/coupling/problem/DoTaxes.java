package com.az.ocp.aooadp.coupling.problem;

// COUPLING PROBLEM

public class DoTaxes {

    float rate;

    float doColorado() {
        SalesTaxRates str = new SalesTaxRates();
        rate = str.salesRate; // WRONG this should be a method call like: rate = str.getSalesRate("CO");
        // do stuff with rate
        return rate;
    }
}
