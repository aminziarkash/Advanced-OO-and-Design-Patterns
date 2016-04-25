package com.az.ocp.aooadp.coupling.solution;

public class SalesTaxRates {

    private float salesRate;

    private float adjustedSalesRate;

    public float getSalesRate(String region) {
        // do stuff with region
        salesRate = new DoTaxes().doColorado(); 
        return salesRate;
    }
    
    public float getAdjustedSalesRate() {
        return adjustedSalesRate;
    }
    
}
