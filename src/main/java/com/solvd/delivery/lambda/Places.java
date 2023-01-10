package com.solvd.delivery.lambda;

import java.util.ArrayList;
import java.util.List;

public interface Places {
    // create an object of list using ArrayList
    static List<String> places = new ArrayList<>();

    // preparing our data
    public static List getPlaces() {

        // add places and country to the list
        places.add("United States");
        places.add("Canada");
        places.add("United Kingdom");
        places.add("South America");

        return places;
    }

    public static void forEach(Object o) {
    }
}