package com.solvd.delivery.transportations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Ship extends Transportation  {
    private String shipName;
    private String shipType;
    private static final Logger logger = LogManager.getLogger(Ship.class);

    // ------------------------ Constructors -------------------------//
    public Ship() {
    }

    public Ship(String shipName, String shipType) {
        this.shipName = shipName;
        this.shipType = shipType;
    }

    public Ship(String transportation, int vehicleID, String dateOfDepart, String dateOfArrival, double weightHold, String shipName, String shipType) {
        super(transportation, vehicleID, dateOfDepart, dateOfArrival, weightHold);
        this.shipName = shipName;
        this.shipType = shipType;
    }

    public Ship(String transportation, String shipName, String shipType) {
        super(transportation);
        this.shipName = shipName;
        this.shipType = shipType;
    }

    // ------------------------ Getters -------------------------//

    public String getShipName() {
        return shipName;
    }

    public String getShipType() {
        return shipType;
    }

    // ------------------------ Setters -------------------------//

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ship)) return false;
        if (!super.equals(o)) return false;
        Ship ship = (Ship) o;
        return getShipName().equals(ship.getShipName()) && getShipType().equals(ship.getShipType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getShipName(), getShipType());
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipName='" + shipName + '\'' +
                ", shipType='" + shipType + '\'' +
                '}';
    }
}