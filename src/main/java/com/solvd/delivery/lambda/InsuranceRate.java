package com.solvd.delivery.lambda;

import java.util.ArrayList;
import java.util.List;

public interface InsuranceRate {
    // create an object of list using ArrayList
    static List<Integer> insuranceRate = new ArrayList<>();

    // preparing our data
    public static List getInsuranceRate(){

        // add places and country to the list
        insuranceRate.add(100);
        insuranceRate.add(150);
        insuranceRate.add(200);
        insuranceRate.add(250);

        return insuranceRate;
    }
    public static void forEach(Object o) {
    }
}
