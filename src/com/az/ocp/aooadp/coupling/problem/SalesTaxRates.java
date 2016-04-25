package com.az.ocp.aooadp.coupling.problem;

public class SalesTaxRates {

    public float salesRate; // should be private

    public float adjustedSalesRate; // should be private

    public float getSalesRate(String region) {
        salesRate = new DoTaxes().doColorado(); // WRONG! do region-based calculations
        return adjustedSalesRate;
    }
}
