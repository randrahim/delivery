package com.solvd.delivery.transportations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Airplane extends Transportation {
    private int airplaneId;
    private String airplaneName;
    private String airplaneType;
    private static final Logger logger = LogManager.getLogger(Airplane.class);

    // ------------------------ Constructors -------------------------//
    public Airplane() {
    }

    public Airplane(String transportation, int airplaneId, String airplaneName, String airplaneType) {
        super(transportation);
        this.airplaneId = airplaneId;
        this.airplaneName = airplaneName;
        this.airplaneType = airplaneType;
    }

    // ------------------------ Getters -------------------------//
    public int getAirplaneId() {
        return airplaneId;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    // ------------------------ Setters -------------------------//
    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }
}
