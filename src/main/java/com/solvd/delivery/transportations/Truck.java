package com.solvd.delivery.transportations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Truck extends Transportation {
    private int truckId;
    private String truckName;
    private String truckType;
    private static final Logger logger = LogManager.getLogger(Truck.class);

    // ------------------------ Constructors -------------------------//
    public Truck() {
    }

    public Truck(String transportation, int truckId, String truckName, String truckType) {
        super(transportation);
        this.truckId = truckId;
        this.truckName = truckName;
        this.truckType = truckType;
    }

    // ------------------------ Getters -------------------------//
    public int getTruckId() {
        return truckId;
    }

    public String getTruckName() {
        return truckName;
    }

    public String getTruckType() {
        return truckType;
    }

    // ------------------------ Setters -------------------------//
    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }
}
