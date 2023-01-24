package com.solvd.delivery.transportations;

import com.solvd.delivery.interfaces.ITransportation;

import java.util.Objects;

public abstract class Transportation implements ITransportation {
    private String transportation;
    private String dateOfDepart;
    private String dateOfArrival;
    private double weightHold;

    // ------------------------ Constructors -------------------------//
    public Transportation() {
    }

    public Transportation(String transportation, String dateOfDepart, String dateOfArrival, double weightHold) {
        this.transportation = transportation;
        this.dateOfDepart = dateOfDepart;
        this.dateOfArrival = dateOfArrival;
        this.weightHold = weightHold;
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

    public String getTransportation() {
        return transportation;
    }

    public String getDateOfDepart() {
        return dateOfDepart;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public double getWeightHold() {
        return weightHold;
    }

    // ------------------------ Setters -------------------------//
    public Transportation(String transportation) {
        this.transportation = transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public void setDateOfDepart(String dateOfDepart) {
        this.dateOfDepart = dateOfDepart;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public void setWeightHold(double weightHold) {
        this.weightHold = weightHold;
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

    @Override
    public void myMethod() {
        System.out.println("test Method");
    };
}
