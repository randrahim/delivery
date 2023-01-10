package com.solvd.delivery.lambda;

import java.util.ArrayList;
import java.util.List;

public interface Discount {

    // create an object of list using ArrayList
    static List<Double> discount = new ArrayList<>();

    // preparing our data
    public static List getDiscount(){

        // add places and country to the list
        discount.add(0.05);
        discount.add(0.1);
        discount.add(0.2);
        discount.add(0.3);

        return discount;
    }
    public static void forEach(Object o) {
    }
}
