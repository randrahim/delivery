package com.solvd.delivery.payment;

import java.util.Objects;

public class Transportation {

    private String transportation;

    // ------------------------ Constructors -------------------------//
    public Transportation() {
    }

    // ------------------------ Getters -------------------------//
    public String getTransportation(double thePackageWeight) {

        if ((0 <= thePackageWeight) && (thePackageWeight <= 10)) {
            transportation = "Truck";
        } else if ((11 <= thePackageWeight) && (thePackageWeight <= 20)) {
            transportation = "Train";
        } else if ((21 <= thePackageWeight) && (thePackageWeight <= 30)) {
            transportation = "Ship";
        } else if (31 <= thePackageWeight) {
            transportation = "Airplane";
        }
        return transportation;
    }

    // ------------------------ Setters -------------------------//
    public Transportation(String transportation) {
        this.transportation = transportation;
    }

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transportation)) return false;
        Transportation that = (Transportation) o;
        return transportation.equals(that.transportation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportation);
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "transportation='" + transportation + '\'' +
                '}';
    }
}
