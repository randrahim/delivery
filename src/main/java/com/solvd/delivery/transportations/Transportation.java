package com.solvd.delivery.transportations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public abstract class Transportation {
    private String transportation;
    private int vehicleID;
    private String dateOfDepart;
    private String dateOfArrival;
    private double weightHold;
    private static final Logger logger = LogManager.getLogger(Transportation.class);

    // ------------------------ Constructors -------------------------//
    public Transportation() {
    }

    public Transportation(String transportation, int vehicleID, String dateOfDepart, String dateOfArrival, double weightHold) {
        this.transportation = transportation;
        this.vehicleID = vehicleID;
        this.dateOfDepart = dateOfDepart;
        this.dateOfArrival = dateOfArrival;
        this.weightHold = weightHold;
    }

    // ------------------------ Getters -------------------------//

    public String getTransportation() {
        return transportation;
    }

    public int getVehicleID() { return vehicleID; }

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

    public void setVehicleID(int vehicleID) { this.vehicleID = vehicleID; }

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
        return getVehicleID() == that.getVehicleID() && Double.compare(that.getWeightHold(), getWeightHold()) == 0 && getTransportation().equals(that.getTransportation()) && getDateOfDepart().equals(that.getDateOfDepart()) && getDateOfArrival().equals(that.getDateOfArrival());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTransportation(), getVehicleID(), getDateOfDepart(), getDateOfArrival(), getWeightHold());
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "transportation='" + transportation + '\'' +
                ", vehicleID=" + vehicleID +
                ", dateOfDepart='" + dateOfDepart + '\'' +
                ", dateOfArrival='" + dateOfArrival + '\'' +
                ", weightHold=" + weightHold +
                '}';
    }
}