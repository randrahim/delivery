package com.solvd.delivery.transportations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Train extends Transportation {
    private String trainName;
    private String trainType;
    private double weightHold;
    private static final Logger logger = LogManager.getLogger(Train.class);

    // ------------------------ Constructors -------------------------//
    public Train() {
    }

    public Train(String trainName, String trainType, double weightHold) {
        this.trainName = trainName;
        this.trainType = trainType;
        this.weightHold = weightHold;
    }

    public Train(String transportation, int vehicleID, String dateOfDepart, String dateOfArrival, double weightHold, String trainName, String trainType, double weightHold1) {
        super(transportation, vehicleID, dateOfDepart, dateOfArrival, weightHold);
        this.trainName = trainName;
        this.trainType = trainType;
        this.weightHold = weightHold1;
    }

    public Train(String transportation, String trainName, String trainType, double weightHold) {
        super(transportation);
        this.trainName = trainName;
        this.trainType = trainType;
        this.weightHold = weightHold;
    }

    // ------------------------ Getters -------------------------//

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

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public void setWeightHold(double weightHold) {
        this.weightHold = weightHold;
    }

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        if (!super.equals(o)) return false;
        Train train = (Train) o;
        return Double.compare(train.getWeightHold(), getWeightHold()) == 0 && getTrainName().equals(train.getTrainName()) && getTrainType().equals(train.getTrainType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTrainName(), getTrainType(), getWeightHold());
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainName='" + trainName + '\'' +
                ", trainType='" + trainType + '\'' +
                ", weightHold=" + weightHold +
                '}';
    }
}