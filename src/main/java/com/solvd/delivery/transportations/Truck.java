package com.solvd.delivery.transportations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Truck extends Transportation {
    private String truckName;
    private String truckType;
    private static final Logger logger = LogManager.getLogger(Truck.class);

    // ------------------------ Constructors -------------------------//
    public Truck() {
    }

    public Truck(String truckName, String truckType) {
        this.truckName = truckName;
        this.truckType = truckType;
    }

    public Truck(String transportation, int vehicleID, String dateOfDepart, String dateOfArrival, double weightHold, String truckName, String truckType) {
        super(transportation, vehicleID, dateOfDepart, dateOfArrival, weightHold);
        this.truckName = truckName;
        this.truckType = truckType;
    }

    public Truck(String transportation, String truckName, String truckType) {
        super(transportation);
        this.truckName = truckName;
        this.truckType = truckType;
    }

    // ------------------------ Getters -------------------------//

    public String getTruckName() {
        return truckName;
    }

    public String getTruckType() {
        return truckType;
    }

    // ------------------------ Setters -------------------------//

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return getTruckName().equals(truck.getTruckName()) && getTruckType().equals(truck.getTruckType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTruckName(), getTruckType());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "truckName='" + truckName + '\'' +
                ", truckType='" + truckType + '\'' +
                '}';
    }
}
