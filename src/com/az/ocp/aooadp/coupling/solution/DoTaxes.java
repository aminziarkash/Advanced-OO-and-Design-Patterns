package com.az.ocp.aooadp.coupling.solution;

// COUPLING SOLUTION

public class DoTaxes {

    private float rate;

    float doColorado() {
        SalesTaxRates str = new SalesTaxRates();
        rate = str.getSalesRate("CO");
        // do stuff with rate
        return rate;
    }
}
