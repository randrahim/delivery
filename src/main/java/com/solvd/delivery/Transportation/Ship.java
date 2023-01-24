package com.solvd.delivery.Transportation;

public class Ship extends Transportation {
    private int shipId;
    private String shipName;
    private String shipType;

    // ------------------------ Constructors -------------------------//
    public Ship() {
    }

    public Ship(String transportation, int shipId, String shipName, String shipType) {
        super(transportation);
        this.shipId = shipId;
        this.shipName = shipName;
        this.shipType = shipType;
    }

    // ------------------------ Getters -------------------------//
    public int getShipId() {
        return shipId;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipType() {
        return shipType;
    }

    // ------------------------ Setters -------------------------//
    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }
}
