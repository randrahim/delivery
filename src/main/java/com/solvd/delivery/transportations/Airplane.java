package com.solvd.delivery.transportations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Airplane extends Transportation {
    private String airplaneName;
    private String airplaneType;
    private static final Logger logger = LogManager.getLogger(Airplane.class);

    // ------------------------ Constructors -------------------------//
    public Airplane() {
    }

    public Airplane(String airplaneName, String airplaneType) {
        this.airplaneName = airplaneName;
        this.airplaneType = airplaneType;
    }

    public Airplane(String transportation, int vehicleID, String dateOfDepart, String dateOfArrival, double weightHold, String airplaneName, String airplaneType) {
        super(transportation, vehicleID, dateOfDepart, dateOfArrival, weightHold);
        this.airplaneName = airplaneName;
        this.airplaneType = airplaneType;
    }

    public Airplane(String transportation, String airplaneName, String airplaneType) {
        super(transportation);
        this.airplaneName = airplaneName;
        this.airplaneType = airplaneType;
    }

    // ------------------------ Getters -------------------------//

    public String getAirplaneName() {
        return airplaneName;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    // ------------------------ Setters -------------------------//

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airplane)) return false;
        if (!super.equals(o)) return false;
        Airplane airplane = (Airplane) o;
        return getAirplaneName().equals(airplane.getAirplaneName()) && getAirplaneType().equals(airplane.getAirplaneType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAirplaneName(), getAirplaneType());
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "airplaneName='" + airplaneName + '\'' +
                ", airplaneType='" + airplaneType + '\'' +
                '}';
    }
}