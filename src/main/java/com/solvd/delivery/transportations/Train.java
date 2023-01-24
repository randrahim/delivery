package com.solvd.delivery.transportations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Train extends Transportation {
    private int trainId;
    private String trainName;
    private String trainType;
    private double weightHold;
    private static final Logger logger = LogManager.getLogger(Train.class);

    // ------------------------ Constructors -------------------------//
    public Train() {
    }

    public Train(String transportation, int trainId, String trainName, String trainType, double weightHold) {
        super(transportation);
        this.trainId = trainId;
        this.trainName = trainName;
        this.trainType = trainType;
        this.weightHold = weightHold;
    }

    // ------------------------ Getters -------------------------//
    public int getTrainId() {
        return trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getTrainType() {
        return trainType;
    }

    public double getWeightHold() {
        return weightHold;
    }

    // ------------------------ Setters -------------------------//
    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public void setWeightHold(double weightHold) {
        this.weightHold = weightHold;
    }
}
