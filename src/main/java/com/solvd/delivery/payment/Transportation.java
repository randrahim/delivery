package com.solvd.delivery.payment;

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
}
